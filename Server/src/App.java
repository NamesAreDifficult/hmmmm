// Server application for
// Authors:
// Brian McNulty NamesAreDifficult
// Mia Williams soytoga

import connect.ConnectionListener;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        run(args);
    }

    public static int run(String[] args){
        try {
            ConnectionListener.listen();
        } catch(IOException exc){
            return 1;
        }
        return 0;
    }
}
