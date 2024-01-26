package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String hote = "127.0.0.1";
		int port = 1000;
		Socket socl = new Socket(hote, port);
		OutputStream flux = socl.getOutputStream();
//		DataOutputStream sortie = new DataOutputStream(flux);

		int tab[] = null;
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
				tab[i] = random.nextInt(10);
			}
		}

		OutputStreamWriter sortie = new OutputStreamWriter(flux);
//		sortie.write("Message send to server \n");
	
		sortie.writeInt(5);
		sortie.flush(); // force

		InputStream flx = client.getInputStream();
//		BufferedReader entree = new BufferedReader(new InputStreamReader(flx));
		DataInputStream stream = new DataInputStream(flx);
		int message = stream.readInt();
		System.out.println(message);

	}}
