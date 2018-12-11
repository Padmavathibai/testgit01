
public class reverse {

	public static void main(String[] args) {
		System.out.println("reverse program");
		String input= "Reverse Program";
		StringBuilder rev= new StringBuilder();
		rev.append(input);
		rev=rev.reverse();
		
		for (int i=0;i<rev.length();i++)
		  System.out.print(rev.charAt(i));  
	}
}
