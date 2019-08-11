import java.util.Iterator; 
class Main {
  public static void main(String[] args) {
    ArvoreSimples a = new ArvoreSimples(5);
		a.addChild(a.root(), 7);
		a.addChild(a.root(), 4);
		Iterator it = a.elements();
		System.out.println("Elementos da arvore:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(a.height());
  }
}