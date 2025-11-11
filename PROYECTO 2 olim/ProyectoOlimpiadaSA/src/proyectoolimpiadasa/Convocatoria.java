package proyectoolimpiadasa;

import java.util.*;
//hola mathiu y saico
public class Convocatoria {

    private String fechaIni;
    private int nrodiciplinas;
    private Disciplina dis[] = new Disciplina[10];

    public Convocatoria() {
        fechaIni = "07/11/25";
        nrodiciplinas = 1;
        dis[0] = new Disciplina();

        for (int i = nrodiciplinas; i < 10; i++) {
            dis[i]=new Disciplina();
        }
    }

    public Convocatoria(String x) {
        Scanner sc = new Scanner(System.in);
        fechaIni = x;
        System.out.println("ingrese las disciplinas que participaran");
        nrodiciplinas = sc.nextInt();
        
        for (int i = 0; i < nrodiciplinas; i++) {
            dis[i]=new Disciplina();
            dis[i].leer();
        }
        //siempre a que poner un objeto al final del vector 
        for (int i = nrodiciplinas; i < 10; i++) {
            dis[i] = new Disciplina();
        }

    }

    // esta parte esta interesante por que no deberia ser leer asi por asi... seria crear un metodo
    //inscripcion() (obviamente con el Scanner...) en la clase disciplina no?
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.err.println("ingrese la fecha de la convocatoria: ");
        fechaIni=sc.next();
        System.out.println("numero de diciplina...");
        nrodiciplinas = sc.nextInt();
        
        for (int i = 0; i < nrodiciplinas; i++) {
            dis[i] = new Disciplina();
            dis[i].leer();
        }
        //siempre a que poner un objeto al final del vector 
        for (int i = nrodiciplinas; i < 10; i++) {
            dis[i] = new Disciplina();
        }
    }
    public void mostrar(){
        System.out.println("FECHA DE INICIO...");
        System.out.println(fechaIni+" ");
        
        for (int i = 0; i < nrodiciplinas; i++) {
            if (dis[i] != null) {
                dis[i].mostrar();
            }
        }
    }
}

