public class Pilha{
	
	private No topo;

	public Pilha(){
		topo = null;
	}

	public void push(Object e){
		No novo = new No();
		novo.setValor(e);
		novo.setProx(topo);
		topo = novo; 
	}

	public boolean isEmpty(){
		return (topo == null);
	}	

	public Object top(){
		if(isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}
		return topo.getValor();
	}

	public Object pop(){
		Object elem = topo.getValor(); 
		topo = topo.getProx();
		return elem; 
	}

	public void print(){
		while(!isEmpty()){
			Object elemento = pop();
			System.out.println("Desempilhei "+elemento);
		}
	}
}
