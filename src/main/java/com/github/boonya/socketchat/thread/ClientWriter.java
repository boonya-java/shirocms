package com.github.boonya.socketchat.thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientWriter extends Thread {  
	
    private Socket client;  
  
    public ClientWriter(Socket client) {  
        this.client = client;  
    }  
  
    @Override  
    public void run() {  
        BufferedReader input = new BufferedReader(new InputStreamReader(  
                System.in));  
        try {  
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(  
                    client.getOutputStream()));  
            String str = "";  
            while (true) {  
                str = input.readLine();  
                bw.write(str);  
                bw.newLine();  
                bw.flush();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

}
