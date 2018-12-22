import java.util.*;
class Main {
    public static void main(String[] args) {
    int [] vetor = {2,4,6,8,10,12,14,16,18};
	    int elemento = 10;
		BuscaBinaria b = new BuscaBinaria();
		System.out.println(b.buscaBinaria(vetor, elemento, 0, vetor.length -1));
    }
}
