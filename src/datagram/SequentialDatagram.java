package datagram;

import java.net.DatagramSocket;
import java.net.SocketException;

public class SequentialDatagram {
	
	private int port = 0;
	private DatagramSocket socket;
	
	public void createDatagram() {
		try {
			this.socket = new DatagramSocket();
			this.port = socket.getLocalPort();
			this.printPort();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	public void closeDatagram() {
		if (this.socket != null) {
			this.socket.close();
			System.out.println("Closed datagram socket.");
		}
	}
	
	private void printPort() {
		System.out.println("Created datagram on port " + this.port + ".");
	}

}
