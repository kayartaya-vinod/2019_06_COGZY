package pack2;

import pack1.A;

public class D extends A {
	public void test() {
		// m1 = 100; // private in A; cannot access outside of class A
		// m2 = 200; // package-level access in A; cannot access outside of pack1
		m3 = 300; // protected member inherited from class A; CAN be accessed from subclass
		m4 = 400;
		
		A a1 = new A(); // object of class A; nothing to do with class D
		// a1.m1 = 100; // private in A; cannot access outside of class A
		// a1.m2 = 200; // package-level access in A; cannot access outside of pack1
		// a1.m3 = 300; // member of a1 and nothing to do with class D; same as package-level
		a1.m4 = 400;
		
	}
}
