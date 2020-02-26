/**
 * Clase que define las operaciones básicas que debe tener una lista
 * circular simple.
 * @author xavier
 * http://codigolibre.weebly.com/blog/listas-circulares-simples-en-java
 */
public class CircularList<E> extends List<E> {

    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Nodo<E> inicio;
    // Puntero que indica el final de la lista o el ultimo nodo.
    private Nodo<E> ultimo;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;

    /**
     * Constructor por defecto.
     */
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    /**
     * Agrega un nuevo nodo al final de la lista circular.
     * @param valor a agregar.
     */
    public void push(E valor){
        // Define un nuevo nodo.
        Nodo<E> nuevo = new Nodo<>();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (empty()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // De igual forma el ultimo nodo sera el nuevo.
            ultimo = nuevo;
            // Y el puntero del ultimo debe apuntar al primero.
            ultimo.setSiguiente(inicio);
            // Caso contrario el nodo se agrega al final de la lista.
        } else{
            // Apuntamos con el ultimo nodo de la lista al nuevo.
            ultimo.setSiguiente(nuevo);
            // Apuntamos con el nuevo nodo al inicio de la lista.
            nuevo.setSiguiente(inicio);
            // Como ahora como el nuevo nodo es el ultimo se actualiza
            // la variable ultimo.
            ultimo = nuevo;
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }


    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
     */
    public E peek() {
        return ultimo.getValor();
    }

    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     */
    public E pop(){
        int position = tamanio - 1;
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        Nodo<E> temporal = ultimo;

        if(position>=0 && position<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(position == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSiguiente();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                ultimo.setSiguiente(inicio);
            }
            // En caso que el nodo a eliminar este por el medio
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo<E> aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < position-1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo<E> siguiente = aux.getSiguiente();
                    // Enlaza el nodo anterior al de eliminar con el
                    // sguiente despues de el.
                    aux.setSiguiente(siguiente.getSiguiente());
                    // Actualizamos el puntero del ultimo nodo
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        return temporal.getValor();
    }

    /*
        just a simple function that is a getter for tamanio
     */
    public int size() {
        return tamanio;
    }



}