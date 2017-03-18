import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Sheep {
	
	
	public static void main(String[] args){
		
		
		 Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 
		 int problemcount  = scan.nextInt();
		 int i = 1;
		 
		 while(i <= problemcount)
		 {
			
			int num = scan.nextInt();
			
			int iteration = 0;
			
			if(num == 0) {System.out.println("Case #"+ i +": INSOMNIA"); i++;continue; }
				
			boolean[] numbers = new boolean[10];
			
			for (int j= 0; j< numbers.length; j++) {	 numbers[j] = false;  	}
			
			
			
			while(!testaNumbers(numbers)){
				
				iteration++;
				
				int aux = num * iteration;
				
				int digit;
				
				while(aux !=0){
					
					
					
					numbers[aux % 10] = true;
					aux = aux /10;
						
						
				}

				
				
			}
			
			
			
		
			 System.out.println("Case #" + i + ": " + num*iteration);
			 
			 i++;
		 }
		
		
	}
	
	
	public static boolean testaNumbers(boolean[] vetor){
		
		boolean flag = true;
		for(int i=0; i<vetor.length; i++)
			flag = flag && vetor[i];
		
		return flag;
	}
	
	
	
}
