package co.edu.unbosque.controller;

import java.net.ServerSocket;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws Exception{
        try(var listener = new ServerSocket(59897)){
            System.out.println("Starting minecra server. . .");

            var pool = Executors.newFixedThreadPool(20);

            while(true) {
                pool.execute(new Admin(listener.accept()));
            }
        }
    }
}