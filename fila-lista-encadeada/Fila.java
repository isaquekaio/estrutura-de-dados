public class Fila{

	private No primeiro;
	private No ultimo;
	private int total;

	public Fila(){
		primeiro = null;
		ultimo = null;
		total = 0; 
	}

	public int getTotal(){//ok
		return total;
	}

	public boolean isEmpty(){//ok
		return total == 0; 
	}

	public void inserir(Object e){
			No novo = new No();
			novo.setValor(e);
		if(isEmpty()){
			primeiro = novo;
			ultimo = novo; 
			total++;				
		}else{
			ultimo.setProx(novo);
			ultimo = novo;
			total++;
		}
	}

	public Object retirar(){//ok 
		Object elem = primeiro.getValor();
		primeiro = primeiro.getProx();
		total--;  
		return elem; 
	}

	public void print(){
		while(!isEmpty()){
			Object elemento = retirar();
			System.out.println("Desenfileirar "+elemento);
		}
	}
}
/*
entrada ==>> final da fila
saida ==>> primeiro da fila
variaveis: inicio, fim, contador
total = tamanho -> fila cheia
total = 0       -> fila vazia
*/
