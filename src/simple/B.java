package simple;

public class B {	
	
	public static void main(String[] args) {
		String s1 = "testing";
		
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
		
		System.out.println("program complete");
	}
}
