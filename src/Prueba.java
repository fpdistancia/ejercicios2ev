import java.util.ArrayList;

public class Prueba {

	static class A {
		int n;
		public A(int n) {
			this.n = n;
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<A> lista = new ArrayList<>();
		A a1 = new A(1);
		A a2 = new A(1);
		lista.add(a1);
		System.out.println(lista.contains(a2));
		
		ArrayList<String> lista2 = new ArrayList<>();
		String s1 = new String("abc");
		String s2 = new String("abc");
		lista2.add(s1);
		System.out.println(lista2.contains(s2));
	}

}
