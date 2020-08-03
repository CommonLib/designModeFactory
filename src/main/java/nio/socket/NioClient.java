/*
 * Licensed Materials - Property of PwC
 * (c) Copyright Pwc Corp. 2020. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with PwC Corp.
 */

package nio.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/**
 * Created by byang059 on 8/3/20
 */
public class NioClient {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            Selector selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);

            socketChannel.connect(new InetSocketAddress("127.0.0.1", 8000));

            ByteBuffer writeBuffer = ByteBuffer.allocate(32);
            ByteBuffer readBuffer = ByteBuffer.allocate(32);

            int i = 0;
            while (i <= 3) {
                System.out.println("blocking");
                int readyNum = selector.select();
                if (readyNum == 0) {
                    continue;
                }
                final Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey next = iterator.next();

                    if (next.isConnectable()) {
                        System.out.println("next.isConnectable()");
                        if (socketChannel.finishConnect()) {
                            iterator.remove();
                            write(socketChannel, writeBuffer);
                            next.interestOps(SelectionKey.OP_WRITE);
                        }
                    } else if (next.isReadable()) {
                        System.out.println("next.isReadable()");
                        read(socketChannel, readBuffer);
                        next.interestOps(SelectionKey.OP_WRITE);
                        iterator.remove();
                    } else if (next.isWritable()) {
                        System.out.println("next.isWritable()");
                        write(socketChannel, writeBuffer);
                        next.interestOps(SelectionKey.OP_READ);
                        iterator.remove();
                    }
                }
                i++;
            }
        } catch (IOException e) {
        }
    }

    private static void read(SocketChannel socketChannel, ByteBuffer readBuffer) throws IOException {
        readBuffer.clear();
        socketChannel.read(readBuffer);
        System.out.println(new String(readBuffer.array(), StandardCharsets.UTF_8));
    }

    private static void write(SocketChannel socketChannel, ByteBuffer writeBuffer) throws IOException {
        writeBuffer.clear();
        writeBuffer.put("Hi from client".getBytes());
        socketChannel.write(writeBuffer);
    }
}
