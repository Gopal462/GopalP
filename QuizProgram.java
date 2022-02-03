import java.util.Scanner;
public class QuizProgram {
	public static void main(String[]args) {
		int n;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Prime Minister Of India?");
		System.out.println("1.Narendra Modi");
		System.out.println("2.Rahul Gandhi");
		System.out.println("3.Arvind Kejriwal");
		System.out.println("4.Mamata Benerjee");
		n=sc.nextInt();
		
		if(n==1) {
			System.out.println("Cogratulation!!!!!You have Choosed Correct....");
			
			}
		else {
			System.out.println("OOPS!!!!\nTry Again");
		}
		
		
	}

	}
}
