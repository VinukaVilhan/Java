package Projects.chatApp;

// implements the rubnnable interface

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;


// a runanble interface in  java means a task that could be executed by a thread


public class clientHandler implements Runnable{

    // array to keep track of all our clients
    public static ArrayList<clientHandler> clientHandlers = new ArrayList<>();
    
    // passed from the server class. establish connection between client and server
    private Socket socket;

    // read data sent from a client
    private BufferedReader bufferedReader;
    
    // send data to the clients
    private BufferedWriter bufferedWriter;

    // represents each client
    private String clientUsername;

    public clientHandler(Socket socket)
    {
        try {
            this.socket = socket;
            // byte stream or character stream
            // byte stream ends with Stream -> getOutputStream()
            // we sue character stream - ends with Writer -> OutputStreamWriter
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // read the messages
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // username sent as a line
            this.clientUsername = bufferedReader.readLine();

            // add the client to the array list
            clientHandlers.add(this);

        } catch (Exception e) {
        }
    }

    @Override
    public void main(){

    }
    
}
