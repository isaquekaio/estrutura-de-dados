class Main {
    public static void main(String[] args) {
		tad_sequencia t = new tad_sequencia(); 
		t.insertFirst(7);
		t.insertFirst(8);
		t.insertLast(9);
		t.insertLast(10);
		System.out.println(t.first().getElemento());
		t.insertBefore(t.atRank(0), 15);
		System.out.println(t.first().getElemento());
		t.replaceAtRank(0, 18);
		System.out.println(t.first().getElemento());
		t.remove(t.atRank(0));
		System.out.println(t.first().getElemento());
		System.out.println(t.size());
    }
}
