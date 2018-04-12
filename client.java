package server;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {

	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("127.0.0.1",3001);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter two number for summation : ");
		double a = reader.nextInt();
		double b = reader.nextInt();
		
		dos.writeDouble(a);
		dos.writeDouble(b);
		double input  = dis.readDouble();
		System.out.println("##### Then it go to the server and return the sum ###### ");
		System.out.println("THE SUM OF THE NUMBER === " + input);
		
	}

}
