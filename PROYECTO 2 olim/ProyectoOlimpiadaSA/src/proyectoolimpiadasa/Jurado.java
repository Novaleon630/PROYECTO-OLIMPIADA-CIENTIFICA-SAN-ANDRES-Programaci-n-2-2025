/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoolimpiadasa;
import java.util.*;


public class Jurado extends Persona{
    private String carrera,nivel_academico;
    
    public Jurado(){
        super();;
        carrera="Biologia";
        nivel_academico="Lic. biologia";
    }

    public Jurado(String ca, String niv, String no, String ApPat, String ApMat, int ed) {
        super(no, ApPat, ApMat, ed);
        this.carrera = ca;
        this.nivel_academico = niv;
    }
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("<== INGRESE LOS DATOS DEL JURADO ==>");
        super.leer();
        System.out.println("ingrese la carrera del jurado: ");
        carrera=sc.next();
        System.out.println("ingrese el nivel academico; ");
        nivel_academico=sc.next();
    }
    public void mostrar(){
        System.out.println("<== DATOS DEL JURADO ==>");
        super.mostrar();
        System.out.println("Carrera: "+carrera+"| "+"Nivel Academico: "+nivel_academico+"| ");
    }
    
}
