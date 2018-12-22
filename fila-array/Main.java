class Main {
    public static void main(String[] args) {
        Fila f = new Fila();
		f.inserir(1);
		f.inserir(2);
		f.inserir(3);
		f.inserir(4);
		f.inserir(5);
		f.inserir(6);
		f.inserir(7);
		f.inserir(8);
		f.inserir(9);
		f.inserir(10);
		f.inserir(11);
		//f.retirar();
		System.out.println("Quantidade de elementos: "+f.getTotal());
		System.out.println("Tamanho do Array: "+f.getTamArray());

		f.print(); 
		//int y = f.retirar();
    }
}
