import java.util.Iterator;
import java.util.Vector;
import java.lang.Math;
public class ArvoreSimples{
	
	No raiz; //Atributos da Árvore
	int tamanho;
	
	public ArvoreSimples(Object o){ //Construtor
		raiz = new No(null, o);
		tamanho = 1;
	}
	
	public No root(){ /** Retorna a raiz da árvore */
		return raiz;
	}

	public No parent(No v){ /** Retorna o nó pai de um nó */
		return (v.parent()); // ???
	}

	public Iterator children(No v){ /** retorna os filhos de um nó */
		return v.children();
	}
	
	public boolean isInternal(No v){/** Testa se um no é interno */
		return (v.childrenNumber() > 0);
	}
	
	public boolean isExternal(No v){/** Testa se um nó é externo*/
		return (v.childrenNumber() == 0);
	}
	
	public boolean isRoot(No v){/** Testa se um no é a raiz */
		return v == raiz;
	}
	
	public void addChild(No v, Object o){/** Adiciona um filho a um nó */
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	/** Remove um nó
	 *  Só pode remover nós externos e que tenham um pai (não seja raiz)
	*/
	public Object remove(No v){//throws InvalidNoException
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			return "No Invalido";//throw new InvalidNoException();
		Object o = v.element();
		tamanho--;
		return o;
	}
	
	public void swapElements(No v, No w){ //OK
		/*Método que serve de exercício
		 * Este método deverá fazer com que o objeto
		 * que estava na posição v fique na posição w
		 * e fazer com que o objeto que estava na posição w
		 * fique na posição v 
		 */  
		Object aux = v.element(); 
		v.setElement(w.element());
		w.setElement(aux);
	}
	
	public int depth(No v){/** Retorna a profundidade de um no */
		int profundidade = profundidade(v);
		return profundidade;
	}
	
	private int profundidade(No v){
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}
	
	public int height(){ //Método que serve de exercício
		return aux(raiz); 
	}/** Retorna a altura da árvore */

	public int aux(No v){
		int h;
		if(isExternal(v)){
			return 0;
		}else{
			h = 0;
			Iterator<No> i = v.children();
			while(i.hasNext()){
				h = Math.max(h,aux(i.next()));
			}	
		}
		return h + 1; 
	}
	/** Retorna um iterator com os elementos armazenados na árvore */
	public Iterator elements(){// Método não implementados --- Coleguinha fique a vontade para faze-los
		Vector v = new Vector<Object>();
		preOrderElement(v, raiz);
		return v.iterator();
	}
	
	/** Retorna um iterator com as posições (nós) da árvore */
	public Iterator Nos(){// Método não implementados --- Coleguinha fique a vontade para faze-los
		Vector v = new Vector<No>();
		preOrderNo(v, raiz);
		return v.iterator();
	}
	/** Retorna o número de nós da árvore
	 */
	public int size(){// ok
		return this.tamanho; //return 0; 
	}
	/** Retorna se a ávore está vazia. Sempre vai ser falso, pois não permitimos remover a raiz
	 */
	public boolean isEmpty() {//ok
		return false;
	}

	public Object replace(No v, Object o){// ok
		Object velho = v.element();
		v.setElement(o);
		return velho; //v.element();
	}// Método de exercício

	public void preOrderElement(Vector v, No n){
		v.add(n.element());
		Iterator<No> i = n.children(); 
		while(i.hasNext()){
			preOrderElement(v, i.next());
		}
	}

	public void preOrderNo(Vector v, No n){
		v.add(n);
		Iterator<No> i = n.children(); 
		while(i.hasNext()){
			preOrderElement(v, i.next());
		}
	}
}/*https://docente.ifrn.edu.br/robinsonalves/disciplinas/estruturas-de-dados-2013/ED_Aula08%20-%20ArvoreGenerica_2014_rl.pdf*/