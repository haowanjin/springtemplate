package cn.ddupman.springstudy.tcp.demo1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket socket = server.accept();

            //输入流
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String msg = dis.readUTF();
                System.out.println(msg);

                dos.writeUTF("服务器--->" + msg);
                dos.flush();
            }
        }
    }
}
