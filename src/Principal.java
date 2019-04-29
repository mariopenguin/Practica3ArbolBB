public class Principal {
    public static void main(String[] args) {
    Arbol arbol = new Arbol();
    Alumno alumno = new Alumno("Juan","Martinez",6.4);
        Alumno alumno8 = new Alumno("Paco","Garcia",1);
        Alumno alumno1 = new Alumno("Mario","Garcia",10);
        Alumno alumno2 = new Alumno("Juan","Ruiz",4);
        Alumno alumno3 = new Alumno("Luis","Garcia",6);
        Alumno alumno4 = new Alumno("Jorge","Ruiz",8);
        Alumno alumno5 = new Alumno("Javi","Garcia",10);
        Alumno alumno6 = new Alumno("Ana","Montero",2);
        Alumno alumno7 = new Alumno("Nana","Garcia",1);
        arbol.insertar(7,alumno);arbol.insertar(2,alumno1); arbol.insertar(3,alumno2);arbol.insertar(4,alumno3);
        arbol.insertar(5,alumno4);arbol.insertar(10,alumno5);arbol.insertar(8,alumno6);arbol.insertar(9,alumno7);arbol.insertar(11,alumno8);
       // arbol.postOrden();
        System.out.println("Media "+arbol.calificacionMedia());
        //arbol.maxCalif();

    }
}
