/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author JDAVID
 */
public class main {

    Scanner sc = new Scanner(System.in);
    lista_personas lstprs = new lista_personas();
    Persona p = new Persona();

    public static void main(String[] args) {

        main m = new main();
        m.menu();
    }

    public void menu() {
        System.out.println("------------------------MENU-------------------------");
        System.out.println("1.agregar una persona en la lista");
        System.out.println("2.calcular el tamaño de la lista");
        System.out.println("3.consultar la informacion dada la posicion");
        System.out.println("4.eliminar los datos de la persona en la primera posicion de la lista ");
        System.out.println("5.eliminar los datos de una persona dada su posicion en la lista");
        System.out.println("6.cortar lista a partir de una posicion dada");
        System.out.println("7.obtener todas las personas registradas");
        System.out.println("8.agregar persona al final de la lista");
        System.out.println("9.eliminar la ultima persona registrada en la lista");
        System.out.println("-----------------------------------------------------");
        System.out.println("ingrese una opcion");
        int opcion = sc.nextInt();
        System.out.println("-----------------------------------------------------");
        switch (opcion) {
            case 1:
                System.out.println("ingrese el nombre:");
                String nombre = sc.next();
                System.out.println("ingrese el apellido");
                String ap = sc.next();
                System.out.println("ingrese el tipo de documento");
                String tipoid = sc.next();
                System.out.println("ingrese el numero del documento");
                int numid = sc.nextInt();
                p = new Persona(nombre, ap, tipoid, numid);
                lstprs.agregar_nodo(p);
                System.out.println("-los datos de la persona se han registrado correctamente...-");
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("el tamaño de la lista es " + lstprs.size);
                System.out.println("-------------------------------------------------");
                break;
            case 3:
                System.out.println("ingrese la posicion a consultar");
                int posicion = sc.nextInt();

                if(posicion > lstprs.size - 1){
                    System.out.println("lo sentimos la posicion ingresada es mayor que  el tamaño de la lista ");
                }else{
                    Object obj = lstprs.obtener(posicion);

                    System.out.println("la informacion de la persona en esta posicion es:");
                    System.out.println(obj);
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 4:

                if(lstprs.estaVacia() == true || lstprs.tamano() == 0){
                    System.out.println("lo sentimos la lista no tiene registros...");
                }else{
                    Object objt = lstprs.obtener(0);
                    lstprs.eliminarPrimero();
                    System.out.println("los datos de la " + objt + " ubicados en la primera posicion de la lista han sido eliminados...");
                    System.out.println("-------------------------------------------------");
                }

                break;
            case 5:
                System.out.println("ingrese la posicion del objeto(persona)en la lista para eliminarlo");
                int index = sc.nextInt();
                int tmno = lstprs.tamano();
                if(lstprs.estaVacia() == true || tmno == 0){
                    System.out.println("no hay informacion que eliminar en la lista");

                }else if(index < 0){
                    System.out.println("lo sentimos la posicion ingresada no es valida...(ingrese numeros positivos)");
                }else{

                    lstprs.eliminar(index);

                }

                break;

            case 6:
                System.out.println("ingrese la posicion donde desea cortar la lista");
                int pos = sc.nextInt();
                lstprs.cortar(pos);
                System.out.println("-la lista ha sido cortada en la posicion  : " + pos);
                System.out.println("-------------------------------------------------");
                break;
            case 7:
                if(lstprs.estaVacia() == true || lstprs.tamano() == 0){
                    System.out.println("lo sentimos no hay registros en la lista...");
                }else{
                    System.out.println("las personas registradas en la lista son " + "\n");
                    lstprs.mostrar();
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 8:
                System.out.println("ingrese el nombre:");
                String name = sc.next();
                System.out.println("ingrese el apellido");
                String lastname = sc.next();
                System.out.println("ingrese el tipo de documento");
                String tipodoc = sc.next();
                System.out.println("ingrese el numero del documento");
                int numberid = sc.nextInt();
                p = new Persona(name, lastname, tipodoc, numberid);
                lstprs.agregar_al_final_lista(p);
                System.out.println("-los datos de la persona se han registrado correctamente...-");
                System.out.println("-------------------------------------------------");
                break;
            case 9:

                lstprs.eliminar_ultimo_objeto();

                break;

        }
        menu();

    }
}
