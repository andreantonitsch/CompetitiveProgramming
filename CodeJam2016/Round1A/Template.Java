import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.



public class Answer {
	
	
	public static void main(String[] args){
		
		
		 Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 
		 int problemcount  = scan.nextInt();
		 int i = 1;
		 
		 while(i <= problemcount)
		 {
			String entry = scan.readLine();
			
			int index  = 1;
			
			char highest = entry.charAt(0);
			
			String winningword = "" + entry.charAt(0);
			
			
			while(index < entry.length()){
				
				if(entry.charAt(index)>= highest)
					winningword = highest + winningword;
				else
					winningword+= highest;
				
			}
			
			 System.out.println("Case #" + i + ": " + winningword);
			 
			 i++;
		 }
		
		
	}
	
	
}
