public class Fila{
	private Object[] valores;
	private int primeiro; 
	private int ultimo;
	private int total;

	public Fila(){
		valores = new Object[5];
		primeiro = 0; 
		ultimo = 0;
		total = 0;		
	}

	public int getTotal(){
		return total; 
	}

	public int getTamArray(){
		return valores.length; 
	}

	public void aumenta (){
		if(this.total == this.valores.length){
			Object aux[] = new Object[valores.length*2];
			int ii = primeiro;
			for(int i=0; i<valores.length; i++){
				aux[i] = valores[ii];
				ii = (ii+1)%valores.length;
			}
			primeiro = 0;
			ultimo = valores.length;
			this.valores = aux; 
		}
	}

	public void inserir(Object elemento){
		if(isFull()){
			aumenta();
		}
		valores[ultimo] = elemento;
		//ultimo = ultimo+1;
		ultimo = (ultimo+1) % valores.length;
		total++;
	}

	public Object retirar(){
		if(isEmpty()){
			throw new RuntimeException("Fila vazia! ");
		}
		Object elemento = valores[primeiro];
		primeiro = (primeiro+1) % valores.length;
		//primeiro = primeiro+1; 
		total--; 
		return elemento; 
	} 

	public void print(){
		while(! isEmpty()){
			Object elemento = retirar();
			System.out.println("Desenfileirar "+elemento);	
		}
	}
	
	public boolean isEmpty(){
		return total == 0; 
	}

	public boolean isFull(){
		return total == valores.length; 
	}
}
/*
entrada ==>> final da fila
saida ==>> primeiro da fila
variaveis: inicio, fim, contador
total = tamanho -> fila cheia
total = 0       -> fila vazia
*/
