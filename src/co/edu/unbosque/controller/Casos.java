package co.edu.unbosque.controller;

public class Casos {
    private String Tipologgia;
    private String Especie;
    private String Tamaño;
    private String Localidad;
    private String Direccion;
    private String Nombre;
    private String Telefono;
    private String email;
    private String comentarios;

    public Casos(String tip, String esp, String tam, String loc, String dir, String nom, String tel, String ema, String com){
        Tipologgia = tip;
        Especie = esp;
        Tamaño = tam;
        Localidad = loc;
        Direccion = dir;
        Nombre = nom;
        Telefono = tel;
        email = ema;
        comentarios = com;
    }

    public String getTipologgia() {
        return Tipologgia;
    }

    public void setTipologgia(String tipologgia) {
        Tipologgia = tipologgia;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
