/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoolimpiadasa;
import java.util.*;

public class Persona {
    protected String nombre, ApPaterno, ApMaterno;
    protected int edad;
    
    public Persona(){
        nombre="harit";
        ApPaterno="lopez";
        ApMaterno="moica";
        edad=25;
    }

    public Persona(String no, String ApPat, String ApMat, int ed) {
        this.nombre = no;
        this.ApPaterno = ApPat;
        this.ApMaterno = ApMat;
        this.edad = ed;
    }
    
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        nombre=sc.next();
        System.out.println("ingrese Apellido paterno: ");
        ApPaterno=sc.next();
        System.out.println("ingrese Apellido materno: ");
        ApMaterno=sc.next();
        System.out.println("ingrese edad de la persona: ");
        edad=sc.nextInt();
        
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"| "+"Ap. Paterno: "+ApPaterno+"| "+"Ap. Materno: "+ApMaterno+"| "+"Edad: "+edad+"| ");
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
