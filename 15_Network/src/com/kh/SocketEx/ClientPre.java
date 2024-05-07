package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientPre {
	public static void main(String[] args) {
		try {
			Socket c = new Socket("localhost", 12370);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			PrintWriter out = new PrintWriter(c.getOutputStream(),true);
			
			out.println("hi server!");
			
			
			//for while문 사용해서 출력확인
			//클라이언트는 서버가 읽을 때 까지 여러번 메세지를 다시 보내서 출력해볼수잇음
			for(int i=0; i<3; i++) {
				out.print(i);
				String m = in.readLine();
				System.out.println("send success : " + m);
				
			}
			
			in.close();
			out.close();
			c.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
