package Projects.chatApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
    private ServerSocket serverSocket; 

    // constructor for server socket
    public server (ServerSocket serverSocket)
    {
        this.serverSocket = serverSocket;
    }

    // method to start server and keep it running
    public void startServer() {
        try {
            // make the servre run while the server socker is open
            while (!serverSocket.isClosed())
            {
                // waiting for client to connect; program is halted while client connects

                // when client connects the socket object is returned to communicate with the client
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected: "+socket);

                // creating object from a class
                // objects in this class does the communication with the client
                
                ClientHandler clientHandler = new ClientHandler(socket);

                // multithreaded

                // objects maden from teh clientHandler could be run on seperated threads
                Thread thread = new Thread(clientHandler);

                // start the created thread
                thread.start();


            }
        } catch (IOException e) {

        }
    }
    // if an error occurs we need to shutdown our server socket
    public void closedServerSocket()
    {
        try{
            if (serverSocket != null)
            {
                serverSocket.close();
            } 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException
    {
        // making a server connection to thsi port number
        ServerSocket serverSocket = new ServerSocket(1234);
        // server obj takes serverScoket to its constructor
        server server1 = new server(serverSocket);
        // start the server
        server1.startServer();
    }
}
