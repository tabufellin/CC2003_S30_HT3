/*
*
*
*https://www.javamexico.org/blogs/pain5610/estructura_de_datos_java_listas_simplemente_enlazadas_primer_aporte
* */

public class ListSingle<E> extends StackList<E> {
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
    public void add(int i,E dato) {
        if(isEmpty()) {
            NodoListaSimple<E> nuevo = new NodoListaSimple<E>(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            NodoListaSimple<E> nuevo = new NodoListaSimple<E>(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
    }

    //Metodo para borrar al final de la lista.
    public E remove(int i) {
        NodoListaSimple<E> eliminar = null;
        NodoListaSimple<E> temporal = ultimo;
        if(isEmpty()) {
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
            eliminar = actual.nodoDer;
            actual.nodoDer = null;

            ultimo = actual;
        }
        this.tamano--;
        return ultimo.getValor();
    }

    public E get(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamano){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return primero.getValor();
            }else{
                // Crea una copia de la lista.
                NodoListaSimple<E> aux = primero;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getValor();
            }
            // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
}
