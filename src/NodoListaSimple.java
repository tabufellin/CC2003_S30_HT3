/*
 * Lista Simplemente enlazada.
 *
 */
/**
 *
 * @author Pain
 */
//Clase Nodo. Utiliza el enlace llamado nodoDer o nodo derecho y el valor a introducir.
public class NodoListaSimple<E> {
    NodoListaSimple<E> nodoDer;
    E dato;

    public NodoListaSimple(E dato) {
        this.dato = dato;
        this.nodoDer = null;
    }
    public E getValor() {

        return dato;

    }


    public NodoListaSimple<E> getSiguiente() {

        return nodoDer;
    }
}
