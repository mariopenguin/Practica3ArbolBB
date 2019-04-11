//Clase NodoArbol; almacena un nodo de un �rbol.

public class NodoArbol {
	// Constructor vacío
	private int clave;
	private Alumno dato;
	private NodoArbol iz;
	private NodoArbol de;

	// Constructor con clave
	public NodoArbol (int clave, Alumno dato) {
		this.clave = clave;
		this.dato = dato;
		iz = null;
		de = null;
	}

	public NodoArbol getIz () {
		return iz;
	}

	public NodoArbol getDe () {
		return de;
	}

	public int getClave () {
		return clave;
	}

	public Alumno getDato () {
		return dato;
	}

	public void setIz (NodoArbol nuevoIz) {
		iz = nuevoIz;
	}

	public void setDe (NodoArbol nuevoDe) {
		de = nuevoDe;
	}

	public void setClave (int nuevaClave) {
		clave = nuevaClave;
	}

	public void setDato (Alumno dato) {
		this.dato = dato;
	}

}