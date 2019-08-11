import java.util.*;
//A celula da matriz representa a aresta,
//A matriz em linha e coluna representa o vertices
//matriz de adjacencia é assimetrica
public class Grafo{

	private Object[][] matrizAdj;
	private ArrayList arestas;
	private ArrayList vertices;

	public Grafo(int tam){
		matrizAdj = new Object[tam][tam];
	}

	public int order(){
		return vertices.size();
	}

	public int grau(){
		return arestas.size();
	}

	public void inserirAresta(int v1, int v2, Object valor){
		matrizAdj[v1][v2] = valor;
	}

	public void removerAresta(int v1, int v2){
		matrizAdj[v1][v2] = null;
	}

	public void inserirVertice(){
		int tam = matrizAdj.length;
		Object[][] matrizAux = new Object[tam+1][tam+1];
		for(int i=0; i < matrizAdj.length; i++){
			for(int j=0; j < matrizAdj.length; j++){
				matrizAux[i][j] = matrizAdj[i][j];
			}
		}
		matrizAdj = matrizAux;
	}

	public ArrayList vertices(){
		vertices = new ArrayList();
		for(int i=0; i < matrizAdj.length; i++){
			for(int j=0; j < matrizAdj.length; j++){
				if(matrizAdj[i][j] != null){
					vertices.add(i);
					vertices.add(j);
				}
			}
		}
		return vertices;
	}

	public ArrayList arestas(){
		arestas = new ArrayList();
		for(int i=0; i < matrizAdj.length; i++){
			for(int j=0; j < matrizAdj.length; j++){
				if(matrizAdj[i][j] != null){
					arestas.add(matrizAdj[i][j]);
				}
			}
		}
		return arestas;
	}

	public void imprimirGrafo(){
		for(int i=0; i < matrizAdj.length; i++){
			for(int j=0; j < matrizAdj.length; j++){
				System.out.print(matrizAdj[i][j]+" ");
			}
			System.out.println();			
		}
		System.out.println("Tamanho do grafo: "+matrizAdj.length+"\n");	
	}


	public ArrayList arestasIncidentes(int v){
		ArrayList incidentes = new ArrayList<>();
		for(int i=0; i < matrizAdj.length; i++){
			if(matrizAdj[v][i] != null){
				incidentes.add(matrizAdj[v][i]);
			}
		}
		return incidentes;
	}//vertice linha
	
	public boolean eAdjacente(int v1, int v2){
		if(matrizAdj[v1][v2] != null)
			return true;
		else
			return false;
	}//Se no vertice v1 e v2 contem 1 aresta 

	public ArrayList verticesFinais(Object aresta){
		ArrayList vertices = new ArrayList();
		for(int i=0; i < matrizAdj.length; i++){
			for(int j=0; j < matrizAdj.length; j++){
				if(matrizAdj[i][j] == aresta){
					vertices.add(i);
					vertices.add(j);
					break;
				}
			}
		}
		return vertices;
	}//Se na aresta contem v1 e v2 (Vertices finais)
}