package com.github.boonya.socketchat.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReader  extends Thread {  
	
    private Socket client;  
  
    public ClientReader(Socket client) {  
        this.client = client;  
    }  
  
    @Override  
    public void run() {  
        try {  
            BufferedReader br = new BufferedReader(new InputStreamReader(  
                    client.getInputStream()));  
            String line = "";  
            while (true) {  
                line = br.readLine();  
                if (!"".equals(line) && line != null) {  
                    System.out.println("服务器说：" + line);  
                }  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

}
