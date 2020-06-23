/*
 * Licensed Materials - Property of PwC
 * (c) Copyright Pwc Corp. 2020. All Rights Reserved.
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with PwC Corp.
 */

package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by byang059 on 6/23/20
 */
public class JDKProxy {

    public interface Subject {
        void request() throws Exception;

        void request2() throws Exception;
    }

    public static class RealSubject implements Subject {
        public final void request() {
            System.out.println("RealSubject execute request()");
        }

        @Override
        public void request2() throws Exception {
            System.out.println("RealSubject execute request2()");
        }
    }

    public static class JdkProxySubject implements InvocationHandler {
        private RealSubject realSubject;

        public JdkProxySubject(RealSubject realSubject) {
            this.realSubject = realSubject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before");
            Object result = null;
            try {
                result = method.invoke(realSubject, args);
            } catch (Exception e) {
                throw e;
            } finally {
                System.out.println("after");
            }
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        //通过设置参数，将生成的代理类的.class文件保存在本地
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //通过调用Proxy.newProxyInstance生成代理对象
        //方法参数为：1）classLoader  2）要代理的接口 3）代理对象的InvocationHandler
        //(通过方法参数也可以看出来，JDK代理只能通过代理接口来来实现动态代理)
        Subject subject = (Subject) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
        //调用代理对象的request方法。
        //（根据InvocationHandler接口的定义，可以知道实际调用的是JdkProxySubject里的invoke方法）
        subject.request();
        subject.request2();
    }
}
