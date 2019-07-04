package pack1;

public class B {
	
	public void test() {
		
		A a1 = new A();
		// a1.m1 = 100; // m1 is a private member of a1, cannot be accessed outside of class A
		a1.m2 = 200;
		a1.m3 = 300; // with in the same package where class A is defined, protected members are similar to default members
		a1.m4 = 400;
		
		// System.out.println("m1 = " + a1.m1);
		System.out.println("m2 = " + a1.m2);
		System.out.println("m3 = " + a1.m3);
		System.out.println("m4 = " + a1.m4);
	}
}
