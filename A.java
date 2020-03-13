package a;

class Utils {
        public int getC() {
                int c = 0;
                c = c + 1;
                c = c + 2;
                return c;
        }
}


class A {

	public void m1() {
		int b = 0;
		b = 10;

		int c = new Utils().getC();

		System.out.println(b);
		System.out.println(c);
	}

}

