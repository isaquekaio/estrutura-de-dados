class Main {
  public static void main(String[] args) {
		TadGrafo g = new TadGrafo(5);
		g.inserirAresta(0, 0, null);
		g.inserirAresta(0, 1, "Bola");
		g.inserirAresta(0, 2, null);
		g.inserirAresta(0, 3, "Bolo");
		g.inserirAresta(0, 4, null);

		g.inserirAresta(1, 0, "Bla");
		g.inserirAresta(1, 1, null);
		g.inserirAresta(1, 2, null);
		g.inserirAresta(1, 3, "Blu");
		g.inserirAresta(1, 4, "Ble");

		g.inserirAresta(2, 0, "Bota");
		g.inserirAresta(2, 1, null);
		g.inserirAresta(2, 2, null);
		g.inserirAresta(2, 3, "Bata");
		g.inserirAresta(2, 4, null);

		g.inserirAresta(3, 0, null);
		g.inserirAresta(3, 1, "Bale");
		g.inserirAresta(3, 2, "Blio");
		g.inserirAresta(3, 3, null);
		g.inserirAresta(3, 4, "Boll");

		g.inserirAresta(4, 0, null);
		g.inserirAresta(4, 1, "Ball");
		g.inserirAresta(4, 2, null);
		g.inserirAresta(4, 3, "Bela");
		g.inserirAresta(4, 4, null);

		//g.inserirVertice();

		g.imprimirGrafo();

		System.out.println("Lista arestas: "+g.arestas());

		System.out.println();

		System.out.println("Lista vertices: "+g.vertices());

		System.out.println();

		System.out.println("É adjacente: "+g.eAdjacente(0, 2)+"\n");
		
		System.out.println("Arestas incidentes: "+g.arestasIncidentes(1));

		System.out.println();
		
		System.out.println("Vertices finais: "+g.verticesFinais("Bela"));

		System.out.println();

		g.substituir(0, 3, "Bia");

		//g.inserirVertice();

		g.imprimirGrafo();

		System.out.println("Ordem é qtd de vertices: "+g.ordem());
		
		System.out.println();

		System.out.println("Grau é qtd de arestas: "+g.grau());

		System.out.println();

		System.out.println("oposto: "+g.oposto(1, 0));
  }
}