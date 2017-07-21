package coding;

import java.util.Scanner;
/**
*
*   @description : 팬들에게 둘러싸인 사람
* @author : Chaerin Yu
* @address : https://www.acmicpc.net/problem/14581
*/
public class SurroundingFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		Scanner scan = new Scanner(System.in);
		
		do{
			id = scan.nextLine();	
			
			if(id.length()>20) continue;
			
			for(int i=0; i<3; i++){
				for(int j=0;j<3;j++){
					if(i==1 && j==1){
						System.out.print(":"+id+":");
					} else {
						System.out.print(":fan:");
					}
				}
				System.out.println();
			}
		} while (id.length()>20);
	}

}
