public class Pilha{
	int tamanho = 10;
	int elementos[];
	int topo;
	
	public Pilha(){
		elementos = new int[tamanho];
		topo = -1; //Posição inválida do vetor
	}

	public boolean isEmpty(){ //ok
		return (topo == -1); //forma simplificada
	}	

	public boolean isFull(){ //ok
		return (topo == elementos.length-1);
	}

	public int top(){ //ok
		if(isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}
		return elementos[topo];
	}

	public void aumenta(){
		if(isFull()){
			int []aux = new int[2*elementos.length];
			for(int i=0; i<elementos.length; i++){
				aux[i] = elementos[i];
			}
			this.elementos = aux; 	
		}
	
	}

	public void push(int e){
		if(isFull()){
			aumenta();
		}
		topo++;
		elementos[topo] = e;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}
		int e;
		e = elementos[topo];
		topo--; 
		return e;
	}
}
