/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Cancion;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String Titulo="";
        int Minutos=0;
        int Segundos=0;
        int Año_Publicacion=0;
        int Año_Actual=2023;
        int Resultado=0;
        
        Cancion objcancion=new Cancion ();
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite el titulo de la cancion ");
        Titulo=scan.nextLine();
        objcancion.setTitulo(Titulo);
        
        System.out.println("Digite los minutos");
        Minutos=scan.nextInt();
        objcancion.setMinutos(Minutos);
        
        System.out.println("Digite los segundos");
        Segundos=scan.nextInt();
        objcancion.setSegundos(Segundos);
        
        System.out.println("Digite el año de publicacion");
        Año_Publicacion=scan.nextInt();
        objcancion.setAño_Publicacion(Año_Publicacion);
        
        
        Resultado=Año_Actual-objcancion.getAño_Publicacion();
        
        
        System.out.println("El titulo de la cancion es: "+"\t"+objcancion.getTitulo());
        System.out.println("La duracion es:"+"\t"+objcancion.getMinutos()+":"+objcancion.getSegundos());
        System.out.println("El año de publicacion es:"+"\t"+Resultado);
        
    }
    
}
