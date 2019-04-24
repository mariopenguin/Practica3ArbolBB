public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    // Escribe las claves del árbol binario de raiz a en preorden.
    private void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print (nodo.getClave() + " "); // Nodo
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
            System.out.print(nodo.getClave() + " "); // Nodo
        }
    }
    public void postOrden() {
        postOrden(raiz);
    }

    // Escribe las claves del árbol binario de raiz a en orden central.
    private void ordenCentral(NodoArbol nodo) {
        if (nodo != null) {
            ordenCentral(nodo.getIz()); // Izquierda
            System.out.print(nodo.getClave() + " "); // Nodo
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
            System.out.print(p.getClave() + " ");
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



    public int numElem(){
        Cola cola = new Cola();
        numElemRec(raiz,cola);
        int num =0;
        while (!cola.colaVacia()){
            cola.desencolar();
            num++;
        }
        return num;
    }
    private void numElemRec(NodoArbol nodo,Cola cola){
        if(nodo!=null){
            cola.encolar(nodo);
            numElemRec(nodo.getIz(),cola);
            numElemRec(nodo.getDe(),cola);
        }

    }

    public float calificacionMedia(){


        return calificacionRec(raiz)/numElem();
    }

    private float calificacionRec(NodoArbol nodoArbol){

        if (nodoArbol==null){
            return 0;
        }
       else{
           return calificacionRec(nodoArbol.getIz())+calificacionRec(nodoArbol.getDe())+(float) nodoArbol.getDato().getCalificacion();
        }
    }

    public void maxCalif(){
        Alumno mejor;
        mejor = maxCalifRec(raiz,raiz);
        System.out.println("---Maxima calificacion---");
        System.out.println(mejor.getNombre()+" "+mejor.getCalificacion());
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
