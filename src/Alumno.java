public class Alumno {
    private String nombre, apellidos;
    private double calificacion;

    public Alumno() {
        nombre = "";
        apellidos = "";
        calificacion = 0;
        ;
    }

    public Alumno(String n, String a, double c) {
        nombre = n;
        apellidos = a;
        calificacion = c;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarAlumno() {
        System.out.println (apellidos + ", "+ nombre+" (" + calificacion + ")");
    }
}
