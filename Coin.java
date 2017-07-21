package coding;

import java.util.Scanner;

/**
*
*   @description : 동전 0
* @author : Chaerin Yu
* @address : https://www.acmicpc.net/problem/11047
* 이클립스에서 제대로 돌아가지만 이대로도
* 제출할 때는 주석을 지워야 통과가 된다.. ㅠㅠ (런타임 에러 발생)
* 그리고 (오름차순으로 sort) 부분은 입력할 때
* 오름차순으로 입력한다는 가정이 있으므로 지워도 상관없다.
* (오름차순 sort부분도 안지우면 런타임 에러 발생.)
*/
public class Coin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int coinKindNum = scan.nextInt(); //동전 종류 개수 입력
		int account = scan.nextInt(); // 금액
		int[] coinKind = new int[10]; // 동전 종류
		
		int coinNum = 0, totalCoinNum = 0; 
		
		for(int i=0;i<coinKindNum;i++){
			coinKind[i] = scan.nextInt(); //동전 종류 오름차순으로 입력
			if(coinKind[i]<1 || coinKind[i]>1000000) {
				i--;
				continue;
			}
		}
		//오름차순 sort
		for(int i=0;i<coinKindNum;i++){
			for(int j=i;j<coinKindNum;j++){
				if(coinKind[i]>coinKind[j]){
					int temp = coinKind[i];
					coinKind[i] = coinKind[j];
					coinKind[j] = temp;
				}
			}
		}
		
		for(int i=coinKindNum-1;i>=0; i--){
			if(coinKind[i]>account){
				continue;
			} else {
				coinNum = account/coinKind[i];
				totalCoinNum += coinNum;
				account = account - coinNum*coinKind[i];
			}
		}
		
		System.out.println(totalCoinNum); // 필요한 동전 최소 개수
		
	}
}
