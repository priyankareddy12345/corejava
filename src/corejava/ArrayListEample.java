package corejava;

import java.util.ArrayList;

public class ArrayListEample {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Priya");
		a.add("Reddy");
		a.add("Reddy");
		System.out.println(a);		
        a.add(0, "padigapati");
        System.out.println(a);
        System.out.println(a.contains("Reddy"));
        System.out.println(a.indexOf("Reddy"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        
	}

}
