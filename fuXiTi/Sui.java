package fuXiTi;

public class Sui {
	public static void main(String[] args){
		A a = new A(3);
	}
}

class A extends B{
	public A(int t){
		System.out.println("A" );
	}
	
	
}

class B{
	public B(){
		System.out.println("B");
	}
}
