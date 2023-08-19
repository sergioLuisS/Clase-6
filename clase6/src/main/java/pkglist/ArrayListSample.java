package pkglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSample {
    public void ejemplo1(){...}

        public void ejercicio1(){...}

    public void ListaTareas(){
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Ir a correr");
        tarea.setTaskDescription("Comprar comida");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Ir a la piscina");
        tarea.setTaskDescription("Ir de farra");
        tarea.setDone(false);
        tl.add(tarea);

        tarea = new ClsTaskList();


        for (ClsTaskList item : tl){
            System.out.println("Tarea: "+item.getTaskName());
            System.out.println(tarea.getTaskDescription());
            System.out.println(tarea.isDone());
        }

        //Scanner sc = new Scanner(System.in);

      //  List<Integer> num = new ArrayList<>();
        //num.add(1000);
        //num.add(2000);
        //num.add(3000);
        //num.add(2000);

        //int suma = 0;
        //for (int n : num){
          //  suma = suma + n;

        //}

        //System.out.println("La suma es " +suma);






        //int pos = 0;
        //for (String item : taskList){
          //  System.out.println("Tarea: "+ item);
           // pos++;
        }

        //String primerElemento = taskList.get(0);
        //System.out.println("primer elemento =" +primerElemento);

    }




