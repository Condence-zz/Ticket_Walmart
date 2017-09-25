public class IteradorLista {
    public NodoLista actual; 
    public IteradorLista(NodoLista n) {
        this.actual=n;
    } 
    public boolean estaFuera() {
        if (actual==null)
            return true;
        else
            return false;
    } 
    public Object obtener() {
        return this.actual.elemento;
    } 
    public void avanzar() {
        if(!estaFuera()) {
            this.actual=this.actual.siguiente;
        }
    } 
    public NodoLista getActual() {
        return actual;
    } 
    public void setActual(NodoLista actual) {
        this.actual = actual;
    } 
}