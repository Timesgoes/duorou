package fuXiTi;
public class Text{
	public static void main(String[] args){
		F a = new Orange();
		
		if(a instanceof Apple)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
 class F{
	public F(){
		
	}

}

class Apple extends F{
	public Apple(){
		
	}
}

class Orange extends Apple{
	public Orange(){
		
	}
}