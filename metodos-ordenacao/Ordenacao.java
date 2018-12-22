public class Ordenacao{
	private int vetor[] = {25,57,48,37,12,92,33};

	public void setVetor(int vetor[]){
		this.vetor = vetor;
	}

	public int[] getVetor(){
		return vetor;
	}

	int i, j;
	int aux = 0;

	public void bubbleSort(int vetor[]){
		for(i=0; i<vetor.length-1; i++){
			for(j=0; j<vetor.length-1-i; j++){
				if(vetor[j] > vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
	}

	public void selectSort(int vetor[]){
		for(i=0; i<vetor.length-2; i++){
			for(j=i+1; j<vetor.length-1; j++){
				if(vetor[j] < vetor[i]){
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}

	public void insertSort(int vetor[]){
		for(i=1; i<vetor.length-1; i++){
			aux = vetor[i];
			j = i-1;
			while(j >= 0 && aux < vetor[j]){
				vetor[j+1] = vetor[j];
				j = j-1;
				vetor[j+1] = aux;
			}
		}
	}

	public void printVetor(int vetor[]){
		for(int i=0; i<vetor.length-1; i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
