package com.github.boonya.socketchat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import com.github.boonya.socketchat.thread.ClientReader;
import com.github.boonya.socketchat.thread.ClientWriter;

public class Client {

	public void start() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client = new Socket("127.0.0.1", 9988);
		System.out.println("客户端已经建立。。。");
		// 1.启动线程用于写给服务器
		new ClientReader(client).start();
		// 2.启动线程用于读取服务器的数据
		new ClientWriter(client).start();
	}

	public static void main(String[] args) {
		try {
			new Client().start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
