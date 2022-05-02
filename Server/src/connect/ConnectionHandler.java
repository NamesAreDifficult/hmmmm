// Connection Handler class allows for multiple clients to connect through a threaded connection handler, new connection
// Handlers are spawned from the ConnectionListener class and each new socket trying to connect to the listener is passed
// to a newly constructed ConnectionHandler which is then run as a thread.


// TODO: Create authentication and authorization model
package connect;

import java.net.Socket;

public class ConnectionHandler extends Thread{
    private final Socket sock;

    public ConnectionHandler(Socket sock){
        this.sock = sock;
    }

    @Override
    public void run(){
        System.out.printf("Connection established, thread running: %s", sock.getInetAddress().toString());

    }

    public Socket getSocket() {
        return sock;
    }
}
