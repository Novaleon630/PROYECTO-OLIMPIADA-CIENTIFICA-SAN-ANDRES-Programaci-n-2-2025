/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoolimpiadasa;
import java.util.*;
public class Olimpiada {
    private String NombreOlimpiada;
    private String gestion;
    private Convocatoria c1=new Convocatoria();
    
    public Olimpiada(){
        NombreOlimpiada="OLIMPIADA CIENTIFICA SAN ANDRES";
        gestion="2025";
    }

    public Olimpiada(String Nom, String ges) {
        this.NombreOlimpiada = Nom;
        this.gestion = ges;
    }
    public void leer(){
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese datos de la olimpiada");
        System.out.println("nombre de  la olimpiada: ");
        NombreOlimpiada=sc.next();
        System.out.println("gestion de la olimpiada: ");
        gestion= sc.next();
        
        c1=new Convocatoria();
        
        c1.leer();
    }
    public void mostrar(){
        System.out.println("<=========== OLIMPIADA ========>");
        System.out.println(NombreOlimpiada+" ");
        System.out.println("GESTION: "+gestion+" ");
        c1= new Convocatoria();
        c1.mostrar();
        
    }
    
}
