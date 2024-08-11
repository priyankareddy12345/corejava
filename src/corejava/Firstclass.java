package corejava;

public class Firstclass {
	int a=5;
	int b=4;
	public void getData() {
		System.out.println("i am in method");
	}

	public static void main(String[] args) {
		Firstclass Fc=new Firstclass();
		Secondclass Sc=new Secondclass();
		Sc.setData();
		System.out.println(Sc.s);
		Fc.getData();
		
		System.out.println(Fc.a + Fc.b);
				
		
	}
	

}
