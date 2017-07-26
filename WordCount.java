package coding;

import java.util.Scanner;
/**
* @description : 1152번 단어 개수 세기
* @author : Chaerin Yu
* @address : https://www.acmicpc.net/problem/1152
*/
public class WordCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.split(" ");
		int cnt = 0;
		
		if(str.length()<10000000){
			for(int i=0;i<words.length;i++){
				if(!words[i].equals("")) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
