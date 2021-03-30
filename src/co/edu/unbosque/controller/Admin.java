package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Admin implements Runnable{
    private Socket socket;

    public Admin(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            var input = new Scanner(socket.getInputStream());
            var output = new PrintWriter(socket.getOutputStream(), true);
            while(input.hasNextLine()) {
                var mes = input.nextLine();
                print(mes);
                output.println("Mistakes were made");
            }
        }
        catch (Exception e) {
            print("Error: "+socket);
        }
        finally {
            try {
                socket.close();
            }
            catch (IOException e) {
            }
            print("Closed: "+socket);
        }
    }
    public void print(String a) {
        synchronized(System.out) {
            System.out.println(a);
        }
    }
}