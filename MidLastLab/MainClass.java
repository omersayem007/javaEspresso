public class MainClass {
	
	public static void main (String[] args){
		
		
		Point obj1 = new Point(1,2);
		Point obj2 = new Point(3,4);
		Point obj3 = new Point(4,5);
		
		Triangle t = new Triangle( obj1 ,obj2 ,obj3);
		t.displayTriangle();
		
		
	}
	
}
