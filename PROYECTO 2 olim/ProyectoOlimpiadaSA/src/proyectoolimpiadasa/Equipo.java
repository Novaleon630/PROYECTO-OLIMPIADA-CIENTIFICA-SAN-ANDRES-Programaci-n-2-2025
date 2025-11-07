/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoolimpiadasa;

import java.util.*;

public class Equipo {

    private String nombreEquipo;
    private int nroEst;
    private Estudiante e[] = new Estudiante[10];

    //CONTRUCTOR 1**** por defecto...>
    public Equipo() {
        nombreEquipo = "Corali";
        nroEst = 5;
        e[0] = new Estudiante("adeventista", 21334, "Jeff", "Casadi", "Loza", 16);
        e[1] = new Estudiante("adeventista", 21334, "Maria", "Lorens", "Loaiza", 15);
        e[2] = new Estudiante("adeventista", 21334, "Marcos", "Danilo", "Merino", 16);
        e[3] = new Estudiante("adeventista", 21334, "Carla", "Espejo", "Montes", 15);
        e[4] = new Estudiante("adeventista", 21334, "Reizel", "Mamani", "Laguna", 16);

        for (int i = nroEst; i < 10; i++) {
            e[i] = new Estudiante();
        }

    }

    public Equipo(String a) {
        Scanner sc = new Scanner(System.in);
        nombreEquipo = a;
        System.out.println("ingrese la cantidad de estudiantes que participaran...");
        nroEst = sc.nextInt();

        for (int i = 0; i < nroEst; i++) {
            e[i] = new Estudiante();
            e[i].leer();
        }
        //para que no quede la ultima posicion nula;
        for (int i = nroEst; i < 10; i++) {
            e[i] = new Estudiante();
        }

    }

    public void mostrar() {
        System.out.println("<== DATOS DEL EQUIPO PARTICIPANTE ==>");
        System.out.println("NOMBRE DEL EQUIPO: "+nombreEquipo+" ");
        System.out.println("<==================== ESTUDIANTES =====================>");
        for (int i = 0; i < nroEst; i++) {
            e[i].mostrar();
        }
    }
    
    public void leer(){
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE LOS DATOS DEL EQUIPO....");
        System.out.println("ingrese el nombre del equipo");
        nombreEquipo=sc.next();
        System.out.println("ingrese el numero de estudiantes");
        nroEst=sc.nextInt();
        System.out.println("ingrese a los participantes");
        for (int i = 0; i < nroEst; i++) {
            e[i]= new Estudiante();
            e[i].leer();
            
        }
        for (int i = nroEst; i < 10; i++) {
            e[i]= new Estudiante();
        }
    }
    

}
