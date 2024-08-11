package corejava;

public class ExceptionDemo {
		public static void main(String[] args) {
			int a=4;
			int b=7;
			int c=0;
		   try {
			   
		    	int arr[] =new int[5];
		    		System.out.println(arr[7]);
		    	}
		   catch(ArithmeticException  et)
		   {
    	 System.out.println("i catch the arthmetic exception");
		   }
        catch(IndexOutOfBoundsException ets )
		   {
       	 System.out.println("i catch the Index/exception");

		   }
     catch(Exception e)
		   {
    	 System.out.println("i catch the error/exception");
		   }

	}

}
