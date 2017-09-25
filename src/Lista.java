import java.util.ArrayList;
import java.util.List; 
public class Lista {
    NodoLista cabecera; 
    public Lista() {
        this.cabecera=new NodoLista(null);
    } 
    public boolean estaVacia() {
        if (this.cabecera.siguiente==null) {
            return true;
        } else {
            return false;
        }
    } 
    public IteradorLista buscar(Object o) {
        NodoLista nodo=this.cabecera.siguiente;
        while (nodo!=null && !nodo.elemento.equals(o)) {
            nodo=nodo.siguiente;
        }
        return new IteradorLista(nodo);
    } 
    public void insertar(Object o, IteradorLista it) {
        if (it!=null && it.actual!=null) {
            it.actual.siguiente=new NodoLista(o, it.actual.siguiente);
        }
    } 
    public void eliminar(Object o) {
        IteradorLista it=encontrarPrevio(o);
        if (it.actual.siguiente!=null) {
            it.actual.siguiente=it.actual.siguiente.siguiente;
        }
    } 
    public IteradorLista encontrarPrevio(Object o) {
        NodoLista nodo=this.cabecera;
        while (nodo.siguiente!=null && !nodo.siguiente.elemento.equals(o)) {
            nodo=nodo.siguiente;
        }
        return new IteradorLista(nodo);
    }
}