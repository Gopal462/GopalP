
public class overloading {
	void get(int a)
	{
		System.out.println("Argo");
		
	}
	void get()
	{
		System.out.println("My Life");
		
	}
	public static void main(String[]args)
	{
		overloading t=new overloading();
		t.get(10);
		t.get();
	}

}
