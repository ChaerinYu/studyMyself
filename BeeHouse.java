package coding;

import java.util.Scanner;
/**
* @description : 2292번 벌집
* @author : Chaerin Yu
* @address : https://www.acmicpc.net/problem/2292
*/
public class BeeHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int cal = 0, cal2 = 0;
		
		if(N>=1 && N <=1000000000) {
			if(N==1) System.out.println(1);
			else { // N >= 2
				for(int n=2;n<333333333;n++){
					cal = 3 * n * n - 9 * n + 8;
					cal2 = 3 * (n+1) * (n+1) - 9 * (n+1) + 8;
					if(cal<=N && cal2 > N){
						System.out.println(n);
						break;
					}
				}
			}
		}
	}
}
