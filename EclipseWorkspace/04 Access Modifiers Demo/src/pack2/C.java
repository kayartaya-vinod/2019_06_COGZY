package pack2;

import pack1.A;

public class C {
	public void test() {

		A a1 = new A();
		// a1.m1 = 100; // private member of a1, cannot be accessed outside of class A
		// a1.m2 = 200; // cannot access outside of packagge pack1
		// a1.m3 = 300; // equivalent of package level access; cannot access outside of pack1 
		a1.m4 = 400;

		// System.out.println("m1 = " + a1.m1);
		// System.out.println("m2 = " + a1.m2);
		// System.out.println("m3 = " + a1.m3);
		System.out.println("m4 = " + a1.m4);
	}
}
