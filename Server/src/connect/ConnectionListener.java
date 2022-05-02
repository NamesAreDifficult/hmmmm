package connect;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionListener {
    public static void listen() throws IOException {
        ServerSocket sock = new ServerSocket(8080);
        while (true){
            Socket csock = sock.accept();
            ConnectionHandler ch = new ConnectionHandler(csock);
            ch.start();
        }
    }
}
