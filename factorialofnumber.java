import java.util.Scanner;
public class factorialofnumber {
	public static void main(String[]args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		x=sc.nextInt();
	    int fact=1;
	    for(int i=1;i<=x;i++) {
	    	fact=fact*i;
	    }
	    System.out.println("Factorial Of Number is  = "+fact);
		
	}

}
