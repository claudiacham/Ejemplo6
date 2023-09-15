/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Carolina
 */
public class Cancion {
    //Atributos
    public String Titulo;
    public int Minutos;
    public int Segundos;
    public int Año_Publicacion;
    
    //Constructor no parametrizado
    public Cancion(){}
//constructos parametrizado
    public Cancion(String Titulo, int Minutos, int Segundos, int Año_Publicacion) {
        this.Titulo = Titulo;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Año_Publicacion = Año_Publicacion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
//setter
    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public void setAño_Publicacion(int Año_Publicacion) {
        this.Año_Publicacion = Año_Publicacion;
    }
    
    //getter

    public String getTitulo() {
        return Titulo;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public int getAño_Publicacion() {
        return Año_Publicacion;
    }
    
    
}
