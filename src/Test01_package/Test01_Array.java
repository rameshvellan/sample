package Test01_package;

public class Test01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      	
		int c[][]=new int[2][2];
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=30;
		c[1][1]=40;
		
		System.out.println(c[1][1]);
		
		for(int row=0;row<c.length;row++) {
			
			for(int col=0;col<c[row].length;col++) {
				System.out.print(c[row][col]+" ");
		    //System.out.print(c[row][col]+" ");
		}
		
		 System.out.println(""); 
				
				
      }
      
      
}

}


