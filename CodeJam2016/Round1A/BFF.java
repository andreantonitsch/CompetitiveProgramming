import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BFF {
		
		
	public static void main(String[] args){
		
		
		 Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 
		 int problemcount  = Integer.parseInt(scan.nextLine());
		 int i = 1;
		 
		 while(i <= problemcount)
		 {

			int count = Integer.parseInt(scan.nextLine());
			
			String entry = scan.nextLine();
			
			int[] bffs = new int[count+1];
			
			int biggestCircle = 0;
			
			
			String[] auxsplit = entry.split(" ");
			
			for(int k = 0; k< count; k++){
				
				if(auxsplit[k] != "")
					bffs[k+1] = Integer.parseInt(auxsplit[k]);
				
			}
			
			int repeat = count;
			/*
			while(repeat >0){
				
				ArrayList<Integer> currentList = new ArrayList<Integer>();
				
				int currentKid = repeat;
				
				
				//while(true){
					
				while(!currentList.contains(currentKid)){
					System.out.println(repeat + " : " +currentKid);
					
					currentList.add(currentKid);
					currentKid = bffs[currentKid];

					
				}
				if(bffs[currentList.get(currentList.size()-1)] != currentList.get(0) || bffs[currentList.get(currentList.size()-1)] != currentList.get(currentList.size()-2))
					currentList.clear();
				//}
				
				
				if(currentList.size() > biggestCircle)
					biggestCircle = currentList.size();
				
				repeat--;
			}
			*/
			
			 System.out.println("Case #" + i + ": " + biggestCircle );
			 
			 i++;
		 }
		
	}

}
