import java.io.*;
import java.net.*;

class Client {

    public static void main(String [] args) throws Exception {

	String host = args[0]; 
	int port = Integer.parseInt(args[1]); 
	String userid = args[2];
	String filename = args[3];

	Socket s = new Socket(host, port);
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());

	dos.writeUTF(args[2]);
	System.out.println(dis.readUTF());

    }
}
