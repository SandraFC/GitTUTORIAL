package tema7;

public class cincuenta {

	public static void main(String[] args) {
		
		int [] cincuenta =new int[50];
		
		
		
		for (int i=0; i<50; i++){
			cincuenta[i]=i+1;
			
			System.out.print(cincuenta[i] + ", ");
		}
		
		System.out.println(" ");
		
		for (int i=0; i<cincuenta.length; i++){
			
			if (i%10==0) {
				
				System.out.println(cincuenta[i]);
				
			}
		
			
		}
		
	}

}
