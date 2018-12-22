 class Main {
    public static void main(String[] args) {
		Pilha p = new Pilha();
		p.push(7);
		p.push(6);
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		System.out.println("O topo é: "+p.top());
		p.print();
		System.out.println("\n");
    }
}
