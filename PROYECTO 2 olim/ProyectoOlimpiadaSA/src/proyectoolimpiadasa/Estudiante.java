/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoolimpiadasa;
import java.util.*;
public class Estudiante extends Persona{
    private String colegio;
    private int rude;
    
    public Estudiante(){
        super();
        colegio="William Both";
        rude=23457;
        
    }

    public Estudiante(String colegio, int rude) {
        this.colegio = colegio;
        this.rude = rude;
    }

    public Estudiante(String co, int ru, String no, String ApPat, String ApMat, int ed) {
        super(no, ApPat, ApMat, ed);
        this.colegio = co;
        this.rude = ru;
    }
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese los datos del estudiante: ");
        super.leer();
        System.out.println("ingrese el colegio del estudiante: >>");
        colegio=sc.next();
        System.out.println("ingrese el rude del estudiante: >>");
        rude=sc.nextInt();
        
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Colegio: "+colegio+"| "+"Rude: "+rude+"| ");
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getRude() {
        return rude;
    }

    public void setRude(int rude) {
        this.rude = rude;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
