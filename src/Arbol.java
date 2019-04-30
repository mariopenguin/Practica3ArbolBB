public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    // Escribe las claves del árbol binario de raiz a en preorden.
    private void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println (nodo.toString()); // Nodo
            preOrden(nodo.getIz()); // Izquierda
            preOrden(nodo.getDe()); // Derecha
        }
    }
    public void preOrden() {
        preOrden(raiz);
    }

    // Escribe las claves del árbol binario de raiz a en postorden.
    private void postOrden(NodoArbol nodo) {
        if (nodo != null) {
            postOrden(nodo.getIz()); // Izquierda
            postOrden(nodo.getDe()); // Derecha
            System.out.println(nodo.toString()); // Nodo
        }
    }
    public void postOrden() {
        postOrden(raiz);
    }

    // Escribe las claves del árbol binario de raiz a en orden central.
    private void ordenCentral(NodoArbol nodo) {
        if (nodo != null) {
            ordenCentral(nodo.getIz()); // Izquierda
            System.out.println(nodo.toString() + " "); // Nodo
            ordenCentral(nodo.getDe()); // Derecha
        }
    }
    public void ordenCentral() {
        ordenCentral(raiz);
    }

    public void listarAmplitud() {
        NodoArbol p = raiz;
        Cola c = new Cola();
        if (p != null)
            c.encolar(p);
        while (!c.colaVacia()) {
            p = c.desencolar();
            System.out.println(p.toString() + " ");
            if (p.getIz() != null)
                c.encolar(p.getIz());
            if (p.getDe() != null)
                c.encolar(p.getDe());
        }
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol nodo) {
        raiz = nodo;
    }

    private NodoArbol insertar(NodoArbol nodo, int clave, Alumno dato) {
        if (nodo != null)
            if (nodo.getClave() < clave)
                nodo.setDe(insertar(nodo.getDe(), clave, dato));
            else if (nodo.getClave() > clave)
                nodo.setIz(insertar(nodo.getIz(), clave, dato));
            else
                System.out.println("la clave ya existe");
        else nodo = new NodoArbol(clave, dato);
        return nodo;
    }

    public void insertar(int clave, Alumno dato) {
        raiz = insertar(raiz, clave, dato);
    }




    //Calculo la media contando mediante una cola el numero de elementos (tambien podria haberse implementado con un atributo mas de la clase)
    // o una clase auxiliar para almacenar el dato

    public float calificacionMedia(){
        Cola cola = new Cola();

        return calificacionRec(raiz,cola)/cola.numElem();
    }
    private float calificacionRec(NodoArbol nodoArbol,Cola cola){

        if (nodoArbol==null){
            return 0;
        }
       else{
           cola.encolar(nodoArbol);
           return calificacionRec(nodoArbol.getIz(),cola)+calificacionRec(nodoArbol.getDe(),cola)+(float) nodoArbol.getDato().getCalificacion();
        }
    }


    //Calculo el alumno con la mejor calificacion

    public void maxCalif(){
        Alumno mejor;
        mejor = maxCalifRec(raiz,raiz);
        System.out.println("---Maxima calificacion---");
        System.out.println(mejor.toString());
    }
    private Alumno maxCalifRec(NodoArbol nodo,NodoArbol mejor){
        if (nodo!=null){
            if (nodo.getDato().getCalificacion()>mejor.getDato().getCalificacion()){
                mejor= nodo;
            }
            else if (nodo.getDato().getCalificacion()==mejor.getDato().getCalificacion()&& nodo.getClave()>mejor.getClave()){
                mejor= nodo;
            }

                Alumno izdo= maxCalifRec(nodo.getIz(),mejor);
                Alumno derecho = maxCalifRec(nodo.getDe(),mejor);
                if (izdo.getCalificacion()>derecho.getCalificacion()){
                    return izdo;
                }
                else {
                    return derecho;
                }
            }

        return mejor.getDato();
    }
  }
