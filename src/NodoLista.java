public  class NodoLista {
    public Object elemento;
    public NodoLista siguiente; 
    public NodoLista(Object o) {
        this.elemento=o;
        this.siguiente=null;
    } 
    public  NodoLista(Object o, NodoLista n) {
        this.elemento=o;
        this.siguiente=n;
    } 
    public Object getElemento() {
        return elemento;
    } 
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    } 
    public NodoLista getSiguiente() {
        return siguiente;
    } 
    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    } 
}