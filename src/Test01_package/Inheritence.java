package Test01_package;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i = 10;
     int j =40;
     System.out.println(i+j);
     add();
     Inheritence R = new Inheritence();
      R.sub();	 
     
	}
	public static int add() {
    int a=30;		
	int b=79;
	int i = a+b;
	   System.out.println(i);	
	return i;

   
   
	}
	
	public void sub() {
	int m =90;
	int n =60;
	System.out.println(m-n);
		
		
	}
	
}



