public class Triangle{
	
	
private Point a;
private Point b;
private Point c;

public Triangle(Point a ,Point b,  Point c){
   this.a =a ;
   this.b =b ;
   this.c =c;
	
}


	public void  setA(Point a ){
		this.a = a ;
	}
	
	public Point getA(){
		return a ;
	}
	
	public void setB(Point b){
		this.b = b ;
	}
	public Point getB(){
		return b ;
	}
	
	public void setC(){
		this.c = c;
	}
	public Point getC(Point c ){
		return c ;
	}
	
		public void displayTriangle(){
			System.out.println( a.getX() );
			System.out.println( a.getY());
			
		}
		
		
		
    
	
	
	
	
}


