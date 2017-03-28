package com.github.boonya.socketchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.github.boonya.socketchat.thread.ServerReader;
import com.github.boonya.socketchat.thread.ServerWriter;

public class Server {

	public void start() throws IOException {
		ServerSocket server = new ServerSocket(9988);
		System.out.println("服务器已经建立，，等待客户端连接。。");
		Socket socket = server.accept();
		System.out.println("已有客户端连接。。。");
		// 读，或者写
		// 启动线程，用于读客户端的数据
		new ServerReader(socket).start();
		// 启动线程，用于向客户端写数据
		new ServerWriter(socket).start();
	}

	public static void main(String[] args) {
		try {
			new Server().start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
