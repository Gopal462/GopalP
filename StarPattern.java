
public class StarPattern {
	int i,j;
	void pattern() {
		for(i=0;i<=9;i++) {
			
			for(j=0;j<=i;j++) {
				
				System.out.println("*");
				
				
				
			}
			System.out.println("");
		}
	}
	public static void main(String[]args) {
		StarPattern t=new StarPattern();
		t.pattern();
	}
	
	

}
