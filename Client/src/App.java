// Client application for
// Authors:
// Brian McNulty NamesAreDifficult
// Mia Williams soytoga


import java.io.IOException;
import java.net.Socket;


public class App {
    public static void main(String[] args){
        try {
            run(args);
        }catch(IOException exc){
            System.err.println("Failed to create socket");
        }
    }

    public static int run(String [] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 8080);
        return 0;
    }
}
