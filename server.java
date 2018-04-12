package server;

import java.io.*;
import java.net.*;



public class server {

	public static void main(String[] args)throws Exception
	{
	
		System.out.println("##### SERVER IS READY ######");
		ServerSocket ss = new ServerSocket(3001);
		while(true) {
			try {
				Socket soc = ss.accept();
				RequestHandler rt = new RequestHandler(soc);
				rt.start();
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		

	}

}
