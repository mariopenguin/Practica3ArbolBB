class NodoCola {
	NodoArbol dato;
	NodoCola siguiente;
	// Constructores
	NodoCola (NodoArbol elemento, NodoCola n) { 
		dato = elemento; 
		siguiente = n; 
	}
}

public class Cola {
	private NodoCola principio;
	private NodoCola fin;

	public Cola () {
		principio = null;
		fin = null;
		}
	public boolean colaVacia () {
		return principio == null;	
	}
	public void encolar (NodoArbol p) {
        NodoCola aux;
        aux = new NodoCola(p, null);
        if (principio == null) 
        	{principio = aux;
        	fin = aux;
        	}
        else {
        	fin.siguiente = aux;
        	fin = aux;
        }
	} 
	public NodoArbol desencolar () {
        NodoArbol resultado = null;
        if (!colaVacia ()) {  
        	resultado = principio.dato;
        	principio = principio.siguiente;
        	if (principio == null)
        		fin = null;
        }
        return resultado;
		
	}
	public int numElem(){
		int num =0;
		NodoCola aux = fin;
		while (principio!=aux){
			this.encolar(this.desencolar());
			num++;
		}
		if (principio==aux){
			num++;
		}
		return num;
	}
}
