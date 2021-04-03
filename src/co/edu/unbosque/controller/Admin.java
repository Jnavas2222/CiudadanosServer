package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Admin extends Thread {
    private Socket socket1;
    private List<Usuarios> list1;
    private List<Casos> casos;

    public Admin(Socket socket, List<Usuarios> lists, List<Casos> c) {
        socket1 = socket;
        list1 = lists;
        casos = c;
    }

    @Override
    public void run() {
        try {
            var input = new Scanner(socket1.getInputStream());
            var output = new PrintWriter(socket1.getOutputStream(), true);
            String comp = input.nextLine();
            System.out.println(comp);
            if (comp.equals("agente")) {
                output.println("Press enter to continue");
                    synchronized (list1){
                        print("Adding agente");
                        list1.add(new Usuarios(socket1.getPort(),"Agente",socket1.getLocalAddress().toString(), socket1));
                    }
                    while(socket1.isConnected()){
                    }
                    if(!socket1.isConnected()){
                        synchronized (list1) {
                            list1.remove(socket1);
                            print("" + list1.size());
                        }
                    }
            }else if(comp.equals("cliente")) {
                    output.println("Bienvenido al sistema, precione 1 para generar una queja, precione 2 para hablar con un agente");
                    while (input.hasNextLine()) {
                        var mes = input.nextLine();
                        if (Integer.parseInt(mes) == 1) {
                            output.println("Cual es la tipología del caso? Perdida (1), Robo (2), Abandono (3), Animal Peligroso (4) o Manejo indebido en via publica (5)");
                            var mes2 = input.nextLine();
                            if (Integer.parseInt(mes) == 1) {
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
                                synchronized (casos) {
                                    casos.add(new Casos("Perdido", esp, tam, loc, dir, nom, tel, email, com));
                                }
                                output.println("Caso registrado");
                            } else if (Integer.parseInt(mes) == 2) {
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
                                synchronized (casos){
                                casos.add(new Casos("Robo", esp, tam, loc, dir, nom, tel, email, com));
                                }
                                output.println("Caso registrado");
                            } else if (Integer.parseInt(mes) == 3) {
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
                                synchronized (casos) {
                                    casos.add(new Casos("Abandono", esp, tam, loc, dir, nom, tel, email, com));
                                }
                                output.println("Caso registrado");
                            } else if (Integer.parseInt(mes) == 4) {
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
                                synchronized (casos) {
                                    casos.add(new Casos("Animal peligroso", esp, tam, loc, dir, nom, tel, email, com));
                                }
                                output.println("Caso registrado");
                            } else if (Integer.parseInt(mes) == 5) {
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
                                synchronized (casos) {
                                    casos.add(new Casos("Manejo indebido en via publica", esp, tam, loc, dir, nom, tel, email, com));
                                }
                                output.println("Caso registrado");
                            }
                        } else if (Integer.parseInt(mes) == 2) {
                            output.println("espera un momento");
                            synchronized (list1){
                                print(""+list1.size());
                            Iterator<Usuarios> iterator = list1.iterator();
                            while(iterator.hasNext()) {
                                var it = iterator.next();
                                var outputes = new PrintWriter(it.getSocket().getOutputStream(),true);
                                outputes.println("Someone wants to chat Y/N");
                                var inputes = new Scanner(it.getSocket().getInputStream());
                                print(inputes.nextLine());
                                if(inputes.nextLine().equals("Y")){
                                    output.println("You are now in chat");
                                    outputes.println("You are now in chat");
                                    String m = "";
                                    String n = "";
                                    while(socket1.isConnected()&&it.getSocket().isConnected()){
                                        m = input.nextLine();
                                        outputes.println(m);
                                        n = inputes.nextLine();
                                        output.println(n);
                                    }
                                }
                            }
                            }
                        }
                    }
                for (int i = 0; i < casos.size(); i++) {
                    print(casos.get(i).getNombre());
                }
                }
            }catch (Exception e) {
            print("Error: " + socket1);
        } finally {
            try {
                socket1.close();
            } catch (IOException e) {
            }
            print("Closed: " + socket1);
        }
    }

    public void print(String a) {
        synchronized(System.out) {
            System.out.println(a);
        }
    }
}