public class Main{
	public static void main(String args[]){
		Pilha p = new Pilha();
		p.push(12);
		p.push(11);
		p.push(10);
		p.push(9);
		p.push(8);
		p.push(7);
		p.push(6);
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		
		System.out.println("Topo "+ p.top());
		System.out.println("\n");

		while(!p.isEmpty()){
			int elemento = p.pop();
			System.out.println(" "+elemento);
		}
	}
}/*Colocar elementos em uma ordem e tira-los em uma ordem inversa*/
