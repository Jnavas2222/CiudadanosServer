package co.edu.unbosque.controller;

import java.net.Socket;

public class Usuarios {

    private int port;
    private String status;
    private String ip;
    private Socket socket;

    public Usuarios(int p, String s, String IP, Socket so){
        port = p;
        status = s;
        ip = IP;
        socket = so;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
