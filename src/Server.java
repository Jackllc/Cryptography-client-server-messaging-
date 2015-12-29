import java.io.*;
import java.net.*;

class Server {

    public static void main(String [] args) throws Exception {

	int port = Integer.parseInt(args[0]);

	ServerSocket ss = new ServerSocket(port);
	System.out.println("Waiting incoming connection...");

	Socket s = ss.accept();
	DataInputStream dis = new DataInputStream(s.getInputStream());
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());

	String x = null;

	try {
	    while ((x = dis.readUTF()) != null) {

		System.out.println(x);

		dos.writeUTF(x.toUpperCase());
	    }
	}
	catch(IOException e) {
		System.err.println("Client closed its connection.");
	}

    }
}
