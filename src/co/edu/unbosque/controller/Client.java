package co.edu.unbosque.controller;
import java.util.Scanner;
import java.net.Socket;
import java.io.PrintWriter;


public class Client {

    public static void main(String[] args) throws Exception{

        try(var socket = new Socket("127.0.0.1", 59897)){
            System.out.println("Conection made "+socket);

            var scanner = new Scanner(System.in);
            var input = new Scanner(socket.getInputStream());
            var output = new PrintWriter(socket.getOutputStream(), true);

            while(scanner.hasNextLine()) {
                output.println(scanner.nextLine());
                System.out.println(input.nextLine());
            }
        }

    }
}
