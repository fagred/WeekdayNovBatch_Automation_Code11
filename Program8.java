package assignment;

public class Program8 {

	public static void main(String[] args) {
		int n=5;
		for(int i =1; i<=n; i++) {
			
	       for(int j=i; j<=n; j++) {
				
	   System.out.print("  ");
				
			}
			for(int j=2;j<=i;j++)  {   
		   
	System.out.print("* ");
			     }
		
	System.out.println();
		}
	for(int i =5; i>=1; i--) {
		
		   for(int k=n-i; k>0; k--) {
		   
		   System.out.print("  ");
					
				}
				     
		   for(int j=i; j>0; j--)  {
			   
		System.out.print("* ");
				     }
			
		System.out.println();
}
}

}

		     





