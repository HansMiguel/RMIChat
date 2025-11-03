
package rmi.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import rmi.client.ChatclientIF;

public class ChatServer extends UnicastRemoteObject implements ChatServerIF {
    
    private static final long serialVersionUID =1L; 
    private ArrayList<ChatclientIF> chatClients;
    protected ChatServer() throws RemoteException{
        chatClients = new ArrayList <ChatclientIF>();
   }
     public synchronized void registerChatClient(ChatclientIF chatClient)
            throws RemoteException{
        this.chatClients.add(chatClient);
  }
    public void broadcastMessage(String message) throws RemoteException{
        int i =0;
        while (i < chatClients.size()){
            chatClients.get(i++).retrieveMessage(message);
        }
    }
    
 }
    



