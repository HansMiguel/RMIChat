/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi.client;

/**
 *
 * @author hansl
 */
import java.rmi.Remote; 
import java.rmi.RemoteException;

public interface ChatclientIF extends Remote {
    void retrieveMessage(String message) throws RemoteException; 
}
