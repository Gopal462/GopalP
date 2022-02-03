import java.util.*;
import java.util.function.*;
import java.util.*;

class MyConsumer<T>implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the Number"+ctask);
		System.out.println("Result After Adding 5 to Given Number is:"+((int)ctask+5));
		
	}
}

public class utilitypackage {
	public static void main(String[]args) {
		ArrayList myList;
		MyConsumer mcons;
		 
		myList =new ArrayList<>(5);
		
		mcons=new MyConsumer();
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		myList.forEach(mcons);
	}

			

}
