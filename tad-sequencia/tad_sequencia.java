public class tad_sequencia{
	private No inicio;
	private No fim;
	private int tamanho;

	public tad_sequencia(){//ok
		inicio = new No();
		fim = new No();
		this.inicio.setProximo(fim);
		this.fim.setAnterior(inicio);
		this.tamanho = 0;
	}

	public int size(){ //ok
		return this.tamanho;
	}

	public boolean isEmpty(){ //ok
		return (this.tamanho == 0);
	}

	public No first(){//ok
		return inicio.getProximo();
	}

	public No last(){//ok
		return fim.getAnterior();
	}
	public No before(No n){//ok
		return n.getAnterior();
	} 

	public No after(No n){//ok
		return n.getProximo();
	}

	public void replaceElement(No n, Object e){ //ok
		n.setElemento(e);
	}

	public void swapElement(No n, No e){//ok
		No aux = new No();  
		aux.setElemento(n.getElemento());
		n.setElemento(e.getElemento());
		e.setElemento(aux.getElemento());
	}

	public void insertBefore(No n, Object e){//ok!!!
		No v = new No();
		v.setElemento(e);
		v.setProximo(n);
		v.setAnterior(n.getAnterior());
		n.getAnterior().setProximo(v);
		n.setAnterior(v); 
		this.tamanho++;
	}

	public void insertAfter(No n, Object e){//ok
		No v = new No();
		v.setElemento(e);
		v.setAnterior(n);
		v.setProximo(n.getProximo());
		n.getProximo().setAnterior(v);
		n.setProximo(v); 
		this.tamanho++;
	}

	public void insertFirst(Object o){//ok!!
		No n = new No();
		n.setElemento(o);
		if(tamanho == 0){
			n.setAnterior(inicio);
			n.setProximo(fim);
			inicio.setProximo(n);
			fim.setAnterior(n);
		}else{
			n.setAnterior(inicio);
			n.setProximo(inicio.getProximo());
			inicio.getProximo().setAnterior(n); 
			inicio.setProximo(n);
		}
		this.tamanho++;
	}

	public void insertLast(Object o){//Doing
		No n = new No();
		n.setElemento(o);
		if(tamanho == 0){
			n.setAnterior(inicio);
			n.setProximo(fim);
			inicio.setProximo(n);
			fim.setAnterior(n);
		}else{
			n.setProximo(fim.getAnterior());
			fim.getAnterior().setProximo(n);
			fim.setAnterior(n); 
		}
		this.tamanho++;
	}

	public Object remove(No n){ //ok
		No t = new No();
		n.getElemento();
		n.getAnterior().setProximo(n.getProximo());
		n.getProximo().setAnterior(n.getAnterior());
		n.setAnterior(null);
		n.setProximo(null);
		--(this.tamanho);
		return t;
	}

	public Object elemAtRank(int r){//ok
		return atRank(r).getElemento();
	}

	public void replaceAtRank(int r, Object o){//ok
		atRank(r).setElemento(o);//+ ou - ou Ñ 
	}

	public void insertAtRank(int r, Object o){//ok
		atRank(r).setElemento(o);
	}

	public void removeAtRank(int r){//ok
		remove(atRank(r)); 
	}

	public No atRank(int rank){//ok
		No node = new No();
		if(rank <= size()/2){
			node = inicio.getProximo();
			for(int i=0; i<rank; i++){
				node = node.getProximo();
			}
		}else{
			node = fim.getAnterior();
			for(int i=0; i<size()-rank-1; i++){
				node = node.getAnterior();
			}
		}
		return node;
	}

	public int rankOf(No no){//ok
		No n = new No();
	 	n = inicio.getProximo();
		int r = 0;
		while(n != no && n != fim){
			n = n.getProximo();
			r++;
		}
		return r;
	}
}
