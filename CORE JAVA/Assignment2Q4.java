package Assignment;
abstract class assign{
}
 abstract class assignment{  
	public void show() {			
	System.out.println("Hello");
	}
	public abstract void method();  
}
class abst extends assignment{
	public void method() {		
	}	
}
class Assignment2Q4{
	public static void main(String[] args) {
		assignment a = new assignment();  
			a.show();
	}
}
