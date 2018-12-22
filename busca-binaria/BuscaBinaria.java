import java.util.*;
public class BuscaBinaria{

	public int buscaBinaria(int []A, int k, int min, int max){
		int m = (max+min)/2; //ok
		int c = A[m];
		if(min > max){//ok
		  System.out.println(min+" maior que"+max);
			return -1;
		}
		else if(c == k){
			System.out.println("achou "+c);
			//return m; //retorna o indece
			return c;//retorna o elemento
		}
		else if(k < c){
			System.out.println(k+" menor que "+c);
			return buscaBinaria(A, k, min, m-1);
			
		}
		else if(k > c){
			System.out.println(k+" maior que "+c);
			return buscaBinaria(A, k, m+1, max);
		}
		return -1;
	}
}
