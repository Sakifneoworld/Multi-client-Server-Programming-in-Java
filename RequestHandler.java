package server;
import java.io.*;
import java.net.*;
public class RequestHandler extends Thread {
	Socket soc;
	public RequestHandler(Socket soc) {
		this.soc = soc;
	}
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			double a = dis.readDouble();
			double b = dis.readDouble();
			double  c = a +b;
			dos.writeDouble(c);
			
		}
		catch ( Exception e) {
			
		}
	}

}
