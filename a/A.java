package a;

public class A {

	public void m1() {
		int b = 0;
		b = 10;

		int c = new Utils().getC();

		System.out.println(b);
		System.out.println(c);
	}

	public void m2() {

		new Utils().m2copy();
	}

}

