package co.edu.unbosque.controller;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Agente {

    public static void main(String[] args) throws Exception{

        try(var socket = new Socket("127.0.0.1", 59897)){
            System.out.println("Conection made "+socket);

            var scanner = new Scanner(System.in);
            var input = new Scanner(socket.getInputStream());
            var output = new PrintWriter(socket.getOutputStream(), true);
            boolean da = false;
            while(socket.isConnected()) {
                if(da == false){
                    output.println("agente");
                    da = true;
                }
                else if(da == true) {
                    System.out.println(input.nextLine());
                    output.println(scanner.nextLine());
                }
            }
        }
        catch (Exception e){
            System.out.println("Disconected");
        }

    }
}
