package pack1;

public class A {
	private int m1;
	int m2; // package level access (default access)
	protected int m3;
	public int m4;
	
	public void test() {
		m1 = 100;
		m2 = 200;
		m3 = 300;
		m4 = 400;
		
		A a1 = new A();
		a1.m1 = 100;
		a1.m2 = 200;
		a1.m3 = 300;
		a1.m4 = 400;
		
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		System.out.println("m3 = " + m3);
		System.out.println("m4 = " + m4);
	}
}
