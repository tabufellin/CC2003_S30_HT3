/*
*
*
*https://www.javamexico.org/blogs/pain5610/estructura_de_datos_java_listas_simplemente_enlazadas_primer_aporte
* */

public class ListSingle<E> extends List<E> {
    private NodoListaSimple<E> primero;
    private NodoListaSimple<E> ultimo;
    private int tamano;

    public ListSingle() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public int size() {
        return tamano;
    }

    //Metodo para agregar al final de la lista.
    public void push(E dato) {
        if(empty()) {
            NodoListaSimple<E> nuevo = new NodoListaSimple<>(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            NodoListaSimple<E> nuevo = new NodoListaSimple<>(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
    }

    //Metodo para borrar al final de la lista.
    public E pop() {
        NodoListaSimple<E> temporal = ultimo;
        if(empty()) {
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            NodoListaSimple<E> actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            actual.nodoDer = null;

            ultimo = actual;
        }
        this.tamano--;
        assert ultimo != null;
        return ultimo.getValor();
    }

    public E peek() {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        return ultimo.getValor();
    }
}
