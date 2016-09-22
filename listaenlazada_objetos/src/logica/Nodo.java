/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;



/**
 *
 * @author JDAVID
 */
public class Nodo {
    Object valor;
    Nodo nodo_sig;
    public Nodo(Object obj){
        valor=obj;
        nodo_sig=null;
    }
    public void enlazar_Siguiente_nodo(Nodo siguiente) {
        nodo_sig = siguiente;
    }
    public Nodo obtener_nodos(){
        return nodo_sig;
    }
    public Object valor(){
        return valor;
    }
 
}
