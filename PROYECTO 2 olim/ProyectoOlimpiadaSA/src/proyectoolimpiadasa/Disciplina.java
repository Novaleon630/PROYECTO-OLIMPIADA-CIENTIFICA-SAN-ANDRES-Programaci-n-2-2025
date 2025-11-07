
package proyectoolimpiadasa;
import java.util.*;
public class Disciplina {
    private String nombreDisciplina;
    private Jurado j1= new Jurado();
    private int nroEquipos;
    private Equipo equi[]= new Equipo[50];
    
    public Disciplina(){
        nombreDisciplina="Biologia";
        nroEquipos=1;
        equi[0]=new Equipo();
        
        for (int i = nroEquipos; i < 50; i++) {
            equi[i]= new Equipo();
        }
    }
    public Disciplina(String nom){
        Scanner sc=new Scanner(System.in);
        nombreDisciplina=nom;
        
        System.out.println("ingrese los datos del jurado; ");
        j1= new Jurado();
        j1.leer();
        
        System.out.println("ingrese la cantidad equipos: ");
        nroEquipos=sc.nextInt();
        
        for (int i = 0; i < nroEquipos; i++) {
            equi[i]=new Equipo();
            equi[i].leer();
        }
        for (int i = nroEquipos; i < 50; i++) {
            equi[i]=new Equipo();
        }
    }
    public void leer(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ingrese los datos de la disciplina: ");
        
        System.out.println("Nombre de la disciplina: ");
        nombreDisciplina=sc.next();
        
        j1.leer();
        
        System.out.println("ingrese el numero de equipos...");
        nroEquipos=sc.nextInt();
        
        for (int i = 0; i < nroEquipos; i++) {
            equi[i]= new Equipo();
            equi[i].leer();
        }
        for (int i = nroEquipos; i < 50; i++) {
            equi[i]=new Equipo();
        }
    }
    public void mostrar(){
        System.out.println("<=== DATOS DE LA DISCIPLINA ==>");
        System.out.println("|| DISCIPLINA ||-----> "+nombreDisciplina+"| "+"Nro. equipos: "+nroEquipos+"| ");
        
        j1.mostrar();
        
        for (int i = 0; i < nroEquipos; i++) {
            equi[i].mostrar();
        }
        
    }
}
