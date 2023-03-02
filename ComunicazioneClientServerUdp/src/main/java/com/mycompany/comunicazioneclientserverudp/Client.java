
package com.mycompany.comunicazioneclientserverudp;

/**
 *
 * @author Studente
 */

import java.io.*;
import java.net.*;

public class Client {
    
public stsatic void main{String args[]} throws Exeption
 {
   int PortaServer = 5555;        
   InetAdress IPServer = InetAdress.getByName;
           
           
           
    byte[] bufferOUT = new byte[1024];       
    byte[] bufferIN = new byte[1024];       
           
     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));      
           
  //creazione socket         
DatagramSocket clientSocket = new DatagramSocket();          
System.out.println("Client pronto - inserisci un dato da inviare:");
            
//preparazione messaggio da spedire
String daSpedire = input.readLine();
bufferOut = daSpedire.getBytes();
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }    
    
    
    

    
    
    
    
    
  



  