package com.github.boonya.socketchat.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReader extends Thread {  
	
    private Socket s;  
  
    public ServerReader(Socket s) {  
        this.s = s;  
    }  
  
    @Override  
    public void run() {  
        try {  
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));  
            String line = "";  
            while (true) {  
                line = br.readLine();  
                if (!"".equals(line) && line != null) {  
                    System.out.println("客户端说：" + line);  
                }  
            }  
        } catch (Exception e) {  
  
        }  
    }  

}
