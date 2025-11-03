/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi.server;

/**
 *
 * @author hansl
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.client.ChatclientIF; 

public interface ChatServerIF extends Remote {
    void registerChatClient(ChatclientIF ChatClient) throws RemoteException;
    void broadcastMessage(String message) throws RemoteException;
    
}
