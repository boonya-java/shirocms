package com.github.boonya.socketchat.thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerWriter extends Thread {  
	
    private Socket socket;  
  
    public ServerWriter(Socket socket) {  
        this.socket = socket;  
    }  
  
    @Override  
    public void run() {  
        // 1.获取流  
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
        try {  
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));  
            String str = "";  
            // 2.循环向客户端写数据  
            while (true) {  
                str = input.readLine();  
                bw.write(str);  
                bw.newLine();  
                bw.flush();  
            }  
        } catch (Exception e) {  
  
        }  
    }  
	

}
