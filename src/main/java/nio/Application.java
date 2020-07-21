package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("/Users/byang059/Downloads/redis2.conf");
        FileInputStream input = new FileInputStream("/Users/byang059/Downloads/redis.conf");

        final FileChannel outChannel = out.getChannel();
        final FileChannel inputChannel = input.getChannel();

        ByteBuffer buff = ByteBuffer.allocate(256);

        inputChannel.read(buff);

        final Buffer flip = buff.flip();
        outChannel.write(buff);

        inputChannel.transferTo(0, inputChannel.size(), outChannel);

    }
}
