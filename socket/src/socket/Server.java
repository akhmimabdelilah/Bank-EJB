package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static int Fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Fact(n-1);
		}
	}

	public static void main(String[] args) throws IOException {
		int port = 1001;
//		ServerSocket serveur = new ServerSocket(port);
		ServerSocket sersoc = new ServerSocket(port);
//		System.out.println("En attente des clients");
		System.out.println("server activated on port " + port);

//		Socket client = serveur.accept();
//		System.out.println("Un client vient de se connecter");

//		InputStream is = client.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
//		String msg = br.readLine();
//		System.out.println(msg);
		int f = Fact(4);
		System.out.println(f);

		while (true) { 
			Socket soc = sersoc.accept();
			InputStream flux = soc.getInputStream();
			BufferedReader entree = new BufferedReader(new InputStreamReader(flux));
			String message = entree.readLine();
			Integer fact = Fact(Integer.valueOf(message));
			System.out.println("Message received on server = " + fact);

//			OutputStream sorsoc = soc.getOutputStream();
//			OutputStreamWriter sortie = new OutputStreamWriter(sorsoc);
//			sortie.write("Message easy received \n");
//			sortie.flush(); // force
		}
	}

}