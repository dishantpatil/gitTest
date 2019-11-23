package simple;

public class A {
	public static void main(String[] args) {
		int i;
		for( i=1;i<=5;i++){
			for(int j=1;j<=5;j--){
				System.out.print(" ");
			}
		}
		for(int k=1;k<=5;k++){
			System.out.print("* ");
		}
		System.out.println();
	}
}
