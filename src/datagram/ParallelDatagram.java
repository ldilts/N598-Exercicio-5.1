package datagram;


import java.net.*;

public class ParallelDatagram implements Runnable {
	
	private int port = 0;
	
	private void createDatagram() {
		try {
			DatagramSocket socket = new DatagramSocket();
			this.port = socket.getLocalPort();
			this.printPort();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	private int getPort() {
		return this.port;
	}
	
	private void printPort() {
		System.out.println("Datagram created on port " + this.port + ".");
	}

	@Override
	public void run() {
		this.createDatagram();
	}

}
