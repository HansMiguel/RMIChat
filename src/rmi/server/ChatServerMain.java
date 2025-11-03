package rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ChatServerMain {
    public static void main(String[] args) {
        try {
            
            LocateRegistry.createRegistry(1099);

           
            ChatServer server = new ChatServer();

          
            Naming.rebind("RMIchatServer", server);

            System.out.println("Serveur RMI prêt et en attente de clients...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
