import java.util.*;
class Main {
    public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int vetor[] = new int[100000];
		for(int i=0; i<100000; i++){
			vetor[i] = le.nextInt();
		}
		
		Ordenacao alg = new Ordenacao();
		
		System.out.println("\n\nbubbleSort:");
		alg.setVetor(vetor);
		long t1 = System.currentTimeMillis();	
		alg.bubbleSort(vetor);
        long t2 = System.currentTimeMillis();	
		System.out.println("\nTempo de execução: " +(t2-t1)+"\n");
		alg.printVetor(vetor);
		/*
		System.out.println("\n\nselecSort:");
		long t3 = System.currentTimeMillis();
		alg.selectSort(vetor);
		long t4 = System.currentTimeMillis();
		System.out.println("\nTempo de execução: " +(t4-t3)+"\n");
		alg.printVetor(vetor);	
	
		System.out.println("\n\ninsetSort:");
		long t5 = System.currentTimeMillis();
		alg.insertSort(vetor);
		long t6 = System.currentTimeMillis();
		System.out.println("\nTempo de execução: " +(t6-t5)+"\n");
		alg.printVetor(vetor);*/
    }
}
