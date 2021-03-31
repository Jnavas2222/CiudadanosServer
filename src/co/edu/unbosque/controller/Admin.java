package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements Runnable{
    private Socket socket;
    private ArrayList<Casos> casos = new ArrayList<Casos>();

    public Admin(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            for(int i = 0;i<casos.size();i++){
                print(casos.get(i).getNombre());
            }
            var output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Bienvenido al sistema, precione 1 para generar una queja, precione 2 para hablar con un agente");
            var input = new Scanner(socket.getInputStream());
            while(input.hasNextLine()) {
                var mes = input.nextLine();
                if(Integer.parseInt(mes) == 1){
                    output.println("Cual es la tipología del caso? Perdida (1), Robo (2), Abandono (3), Animal Peligroso (4) o Manejo indebido en via publica (5)");
                            var mes2 = input.nextLine();
                    if(Integer.parseInt(mes) == 1){
                        output.println("Cual es la especie?");
                        var esp = input.nextLine();
                        output.println("Cual es el tamaño?");
                        var tam = input.nextLine();
                        output.println("Cual es la localidad?");
                        var loc = input.nextLine();
                        output.println("Cual es la dirección?");
                        var dir = input.nextLine();
                        output.println("Cual es su nombre completo?");
                        var nom = input.nextLine();
                        output.println("Cual es su telefono");
                        var tel = input.nextLine();
                        output.println("Cual es su email?");
                        var email = input.nextLine();
                        output.println("Algún comentario");
                        var com = input.nextLine();
                        casos.add(new Casos("Perdido", esp, tam, loc, dir, nom, tel, email, com));
                        output.println("Caso registrado");
                        run();
                    }
                    else if(Integer.parseInt(mes) == 2){
                        output.println("Cual es la especie?");
                        var esp = input.nextLine();
                        output.println("Cual es el tamaño?");
                        var tam = input.nextLine();
                        output.println("Cual es la localidad?");
                        var loc = input.nextLine();
                        output.println("Cual es la dirección?");
                        var dir = input.nextLine();
                        output.println("Cual es su nombre completo?");
                        var nom = input.nextLine();
                        output.println("Cual es su telefono");
                        var tel = input.nextLine();
                        output.println("Cual es su email?");
                        var email = input.nextLine();
                        output.println("Algún comentario");
                        var com = input.nextLine();
                        casos.add(new Casos("Robo", esp, tam, loc, dir, nom, tel, email, com));
                        output.println("Caso registrado");
                        run();
                    }
                    else if(Integer.parseInt(mes) == 3){
                        output.println("Cual es la especie?");
                        var esp = input.nextLine();
                        output.println("Cual es el tamaño?");
                        var tam = input.nextLine();
                        output.println("Cual es la localidad?");
                        var loc = input.nextLine();
                        output.println("Cual es la dirección?");
                        var dir = input.nextLine();
                        output.println("Cual es su nombre completo?");
                        var nom = input.nextLine();
                        output.println("Cual es su telefono");
                        var tel = input.nextLine();
                        output.println("Cual es su email?");
                        var email = input.nextLine();
                        output.println("Algún comentario");
                        var com = input.nextLine();
                        casos.add(new Casos("Abandono", esp, tam, loc, dir, nom, tel, email, com));
                        output.println("Caso registrado");
                        run();
                    }
                    else if(Integer.parseInt(mes) == 4){
                        output.println("Cual es la especie?");
                        var esp = input.nextLine();
                        output.println("Cual es el tamaño?");
                        var tam = input.nextLine();
                        output.println("Cual es la localidad?");
                        var loc = input.nextLine();
                        output.println("Cual es la dirección?");
                        var dir = input.nextLine();
                        output.println("Cual es su nombre completo?");
                        var nom = input.nextLine();
                        output.println("Cual es su telefono");
                        var tel = input.nextLine();
                        output.println("Cual es su email?");
                        var email = input.nextLine();
                        output.println("Algún comentario");
                        var com = input.nextLine();
                        casos.add(new Casos("Animal peligroso", esp, tam, loc, dir, nom, tel, email, com));
                        output.println("Caso registrado");
                        run();
                    }
                    else if(Integer.parseInt(mes) == 5){
                        output.println("Cual es la especie?");
                        var esp = input.nextLine();
                        output.println("Cual es el tamaño?");
                        var tam = input.nextLine();
                        output.println("Cual es la localidad?");
                        var loc = input.nextLine();
                        output.println("Cual es la dirección?");
                        var dir = input.nextLine();
                        output.println("Cual es su nombre completo?");
                        var nom = input.nextLine();
                        output.println("Cual es su telefono");
                        var tel = input.nextLine();
                        output.println("Cual es su email?");
                        var email = input.nextLine();
                        output.println("Algún comentario");
                        var com = input.nextLine();
                        casos.add(new Casos("Manejo indebido en via publica", esp, tam, loc, dir, nom, tel, email, com));
                        output.println("Caso registrado");
                        run();
                    }
                }
                else if(Integer.parseInt(mes) == 2){

                }
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