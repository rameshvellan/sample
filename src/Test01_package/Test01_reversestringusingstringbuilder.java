package Test01_package;

public class Test01_reversestringusingstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input = "Yaalini";
    StringBuilder input1= new StringBuilder();
    input1.append(input);
    input1 =input1.reverse();
    System.out.println(input1);
	}
 
}
