class Main {
  public static void main(String[] args) {
    Grafo g = new Grafo(4);
		g.inserirAresta(0, 0, null);
		g.inserirAresta(0, 1, null);
		g.inserirAresta(0, 2, "Lucas");
		g.inserirAresta(0, 3, "Pedro");

		g.inserirAresta(1, 0, null);
		g.inserirAresta(1, 1, null);
		g.inserirAresta(1, 2, "Tiago");
		g.inserirAresta(1, 3, null);

		g.inserirAresta(2, 0, null);
		g.inserirAresta(2, 1, null);
		g.inserirAresta(2, 2, null);
		g.inserirAresta(2, 3, "João");

		g.inserirAresta(3, 0, null);
		g.inserirAresta(3, 1, null);
		g.inserirAresta(3, 2, null);
		g.inserirAresta(3, 3, "Luiz");

		//g.inserirVertice();

		g.imprimirGrafo();

		System.out.println("Lista arestas: "+g.arestas());

		System.out.println();

		System.out.println("Lista vertices: "+g.vertices());

		System.out.println();

		System.out.println("É adjacente: "+g.eAdjacente(0, 2)+"\n");
		
		System.out.println("Arestas incidentes: "+g.arestasIncidentes(0));

		System.out.println();
		
		System.out.println("Vertices finais: "+g.verticesFinais("Luiz"));

		System.out.println();

		System.out.println("Grau é a quantidade de arestas: "+g.grau());

		System.out.println();

		System.out.println("Ordem é a quantidade de Vertices: "+g.order());

		g.inserirVertice();

		g.inserirAresta(4, 4, "Ana");
			
		System.out.println();

		g.imprimirGrafo();
  }
}