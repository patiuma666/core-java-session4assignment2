package Sess4Assignment2;

public class Patternabc {
	public static void main(String []args){
		
		int  j, d, x = 0;//here we are taking 4 variables
		char k;
		int i=1;
		while ( i<= 5) {//rows
			k = 'a';
			
			
			for (j=1,d=0;j<=5;j++){ //cols
				// increasing
				if (i < 4) {
					
					
				
					if (j >= 4 - i && j <= 2 + i) {
						System.out.print(k);
						if (j < 3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
					}
				
					
					// decreasing					
					if (j>i-3 && j <= 5-d) {
						
						System.out.print(k);
						if (j<3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
						d++;
					}
				}

			}

			System.out.println();
		}

	}
}


