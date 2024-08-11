package demo0;

public class Sorting {

	public static void main(String[] args) {
      int a[] =	{2,1,3,4};
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			int temp=0;
			if(a[j] <a[i]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		
		}
		System.out.println(a[i] +" ");
	}
			
	}
	
}

