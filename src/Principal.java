public class Principal {
    public static void main(String[] args) {
    Arbol arbol = new Arbol();
    Alumno alumno = new Alumno();
        Alumno alumno8 = new Alumno("","",1);
        Alumno alumno1 = new Alumno("a","",10);
        Alumno alumno2 = new Alumno("","",4);
        Alumno alumno3 = new Alumno("","",6);
        Alumno alumno4 = new Alumno("","",8);
        Alumno alumno5 = new Alumno("b","",10);
        Alumno alumno6 = new Alumno("","",2);
        Alumno alumno7 = new Alumno("","",1);
        arbol.insertar(7,alumno);arbol.insertar(2,alumno1); arbol.insertar(3,alumno2);arbol.insertar(4,alumno3);
        arbol.insertar(5,alumno4);arbol.insertar(10,alumno5);arbol.insertar(8,alumno6);arbol.insertar(9,alumno7);arbol.insertar(11,alumno8);
        arbol.postOrden();
        System.out.println(arbol.calificacionMedia()+"    "+arbol.numElem());
        arbol.maxCalif();
    }
}
