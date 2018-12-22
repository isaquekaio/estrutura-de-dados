public class No{
	private Object elemento;
	private No anterior;
	private No proximo; 

	public void setElemento(Object elemento){
		this.elemento = elemento;
	}

	public void setAnterior(No anterior){
		this.anterior = anterior;
	}

	public void setProximo(No proximo){
		this.proximo = proximo;
	}

	public Object getElemento(){
		return this.elemento;
	}

	public No getAnterior(){
		return this.anterior;
	}

	public No getProximo(){
		return this.proximo; 
	}
}
