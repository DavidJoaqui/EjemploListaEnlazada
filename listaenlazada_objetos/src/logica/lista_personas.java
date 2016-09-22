/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidad.Persona;

/**
 *
 * @author JDAVID
 */
public class lista_personas {

    Nodo cabeza = null;
    Nodo ultimo_nodo = null;
    int size;

    public lista_personas() {
        cabeza = null;
        ultimo_nodo = null;
        size = 0;
    }

    public void agregar_nodo(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
        } else { 	//por lo menos hay un nodo en la lista
            Nodo aux = cabeza;			//aux que toma el primer nodo o cabeza
            Nodo nuevo1 = new Nodo(p);		//se crea el nuevo nodo con sus datos a continuacion de la cabeza
            nuevo1.enlazar_Siguiente_nodo(aux);	//hacemos o devolvemos el enlace hacia la cabeza para referenciarla
            cabeza = nuevo1;			//ahora la cabeza pasa a ser el nuevo nodo acabado de crear 

        }
        size++;
    }

//    public boolean estaVacia() {
//        return (cabeza == null) ? true : false;
//    }
    public boolean estaVacia() {
        boolean x = false;
        if (cabeza == null) {
            x = true;
        }

        return x;

    }

    public int tamano() {
        return size;
    }

    public Object obtener(int pos) {
        int contador = 0;

        Nodo aux = cabeza;
        if (this.estaVacia() == true || size == 0) {
            System.out.println("lo sentimos la lista no contiene registros");
        } else {

            while (contador != pos) {
                aux = aux.obtener_nodos();

                contador++;

            }

        }
        return aux.valor;
    }

    public void eliminarPrimero() {
        cabeza = cabeza.obtener_nodos();

        size--;
    }

    public void eliminar(int indice) {
        int tmno = this.tamano();
       
        boolean x = false;
        if (indice>= tmno) {

            System.out.println("lo sentimos la posicion ingresada supera el tamaño de la lista...");
        }
        if (tmno == 1) {
            eliminarPrimero();
            System.out.println(" el unico registro en la lista ha sido eliminado...");
        } else if(indice<tmno ) {
          
            Nodo aux;

            aux = cabeza;
            int contador = 0;
            while (contador < indice - 1) {
                aux = aux.nodo_sig;
                contador++;
            }

            System.out.println("la " + aux.nodo_sig.valor + "en la posicion " + indice + "ha sido eliminado correctamente...");
            Nodo temp = aux.nodo_sig;
            aux.nodo_sig = temp.nodo_sig;
            temp.nodo_sig = null;
            size--;

        }

    }

    public void eliminar_ultimo_objeto() {

        int index = this.tamano();

        if (this.estaVacia() == true || index==0) {
            System.out.println("lo sentimos la lista esta vacia...");
        }

        if (index == 1) {
            this.eliminarPrimero();
        } else if(index>1) {
            Nodo actual = cabeza;
          

            while (actual.nodo_sig.nodo_sig !=null) {

                actual = actual.nodo_sig;

            }

            System.out.println("el objeto en la ultima posicion de la lista ha sido eliminado");
            System.out.println("la informacion contenida en este nodo " + actual.nodo_sig.valor);

            actual.nodo_sig = null;

            size--;
        }
    }

    public void cortar(int index) {
        int contador = 0;
        Nodo aux = cabeza;
        while (contador < index-1) {
            aux = aux.nodo_sig;
            contador++;
        }
        aux.enlazar_Siguiente_nodo(null);
        size = index;
    }

    public void agregar_al_final_lista(Persona objeto_persona) {

        Nodo nuevo1 = new Nodo(objeto_persona);
        if (this.estaVacia() == true && size == 0) {
            nuevo1.nodo_sig = cabeza;
            cabeza = nuevo1;

        } else {

            ultimo_nodo = cabeza;

            while (ultimo_nodo.nodo_sig != null) {
                ultimo_nodo = ultimo_nodo.nodo_sig;

            }

            ultimo_nodo.nodo_sig = nuevo1;

        }
        size++;
    }

//   public void mostrar(){
//       int tmn=this.size;
//          for (int i = 0; i < tmn; i++) {
//                    System.out.println(obtener(i));
//                    //cadena=cadena+""+lis.obtener(i)+"\n";
//                }
//   }
    public void mostrar() {

        int tmn = this.size;

        int contador2 = 0;
        while (contador2 != tmn) {
            System.out.println(obtener(contador2));
            contador2++;
        }
        System.out.println("-------------------------------------------------");

    }

}
