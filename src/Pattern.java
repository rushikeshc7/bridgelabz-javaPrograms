
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(int i=0;i<=5;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(" ");
        	}
        
            for(int j=1;j<=5-i;j++)
    	    {
    	     	System.out.print(j);
    	     	
         	}
            System.out.println();
        }
	}

}
