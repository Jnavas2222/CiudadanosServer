package co.edu.unbosque.controller;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    public static void main(String[] args) throws Exception{

        ArrayList<Admin> lista = new ArrayList<>();
        List<Usuarios> usuarios = Collections.synchronizedList(new ArrayList<>());
        List<Casos> casos = Collections.synchronizedList(new ArrayList<>());
        try(var listener = new ServerSocket(59897)){
            System.out.println("Starting minecra server. . .");
            while(true) {
                Socket socket = listener.accept();
                Admin admin = new Admin(socket, usuarios, casos);
                lista.add(admin);
                admin.start();
            }
        }
        catch(Exception e){
            System.out.println("Someone Discoleaved");
        }
    }
}

