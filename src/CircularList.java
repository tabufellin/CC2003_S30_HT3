public abstract class CircularList<E> extends StackList<E> {

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
     * Inserta un nuevo nodo despues en una posición determinada.
     * @param posicion en la cual se va a insertar el nuevo nodo.
     * @param valor valor del nuevo nodo de la lista.
     */
    public void add(int posicion, E valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamanio){
            Nodo<E> nuevo = new Nodo<E>();
            nuevo.setValor(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Une el nuevo nodo con la lista existente.
                nuevo.setSiguiente(inicio);
                // Renombra al nuevo nodo como el inicio de la lista.
                inicio = nuevo;
                // El puntero del ultimo debe apuntar al primero.
                ultimo.setSiguiente(inicio);
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    // Apuntamos con el ultimo nodo de la lista al nuevo.
                    ultimo.setSiguiente(nuevo);
                    // Apuntamos con el nuevo nodo al inicio de la lista.
                    nuevo.setSiguiente(inicio);
                    // Como ahora como el nuevo nodo es el ultimo se actualiza
                    // la variable ultimo.
                    ultimo = nuevo;
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo<E> aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo<E> siguiente = aux.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            tamanio++;
        }
    }

    public E get(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getValor();
            }else{
                // Crea una copia de la lista.
                Nodo<E> aux = inicio;
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

    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a eliminar.
     */
    public E remove(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        Nodo<E> temporal = ultimo;

        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
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
                for (int i = 0; i < posicion-1; i++) {
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