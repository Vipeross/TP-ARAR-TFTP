import java.io.IOException;
import java.net.*;

public class appli_User_TF 
{
	
	private DatagramSocket cli;
	
	public int ReceiveFile(int port, InetAddress ip, String nom)
	{
		
		try{
			DatagramSocket cli = new DatagramSocket();
			// suite du programme
		}
		catch (SocketException ex) 
		{
			System.err.println("Port d�j� occup�");
			return -2;
		}
		
		byte[] data = new byte[512];
		DatagramPacket dp = new DatagramPacket(data, data.length, ip, port);
		
		try {
			cli.send(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		
		
		byte[] buffer = new byte[512];															
		DatagramPacket dp2 = new DatagramPacket(buffer, buffer.length);
		try {
			cli.receive(dp2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
	 
	
	return 0;
	}
}
