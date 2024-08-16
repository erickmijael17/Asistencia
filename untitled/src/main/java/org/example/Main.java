package org.example;

import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("hello and welcome!:\n");
                int nomVec1[] = {1,2,3,4,5,6,7,8,9,10};

                for (int dato:nomVec1){
                    System.out.println(dato);
                }

        Persona nomVec2[]={new Persona("Pablito", "",'M'),
            new Persona("Juan","",'M')};
        System.out.println("REGISTRO DE ASISTENCIA");

        Scanner leer=new Scanner(System.in);

                for (Persona p:nomVec2){
                    System.out.println("Esta presente"+ p.nombre+" : ");
                    p.fechareg= new Date();
                    p.setEstadoAsis(leer.nextLine());

                }
        System.out.println("Mostrar registro de asistencia");
        for (Persona p:nomVec2){
            System.out.println(p.getNombre()+" : "+p.getEstadoAsis()+" "+p.fechareg);
        }
    }
}

