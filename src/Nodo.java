/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author xavier
 * edited by
 * @tabufellin and  @pingMaster
 */
public class Nodo <E> {
    // Variable en la cual se va a guardar el valor.
    private E valor;
    // Variable para enlazar los nodos.
    private Nodo<E> siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        valor = null;
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
}
