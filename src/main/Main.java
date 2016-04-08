package main;

import datagram.ParallelDatagram;
import datagram.SequentialDatagram;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new ParallelDatagram().run();
		}
		System.out.println("Created 10 parallel datagram sockets.\n");
		
		for (int i = 0; i < 10; i++) {
			SequentialDatagram sequentialDatagram = new SequentialDatagram();
			sequentialDatagram.createDatagram();
			sequentialDatagram.closeDatagram();
		}
		System.out.println("Created 10 sequential datagram sockets.");
	}

}
