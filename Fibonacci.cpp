//https://www.acmicpc.net/problem/1003
//When calling fibonacci (N), write a program to calculate the number of times of 0 and 1 that appear.

#include <iostream>
int cnt0 = 0, cnt1 = 0;
int fibonacci(int n) {
	if (n == 0) {
		cnt0++;
		return 0;
	}
	else if (n == 1) {
		cnt1++;
		return 1;
	}
	else {
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
int main(void)
{
	int caseNum;
	int num=0;
	
	std::cin >> caseNum;
	for (int i = 0; i < caseNum; i++) {
		std::cin >> num;
		fibonacci(num);
		std::cout << cnt0 << " " <<cnt1 << std::endl;
		cnt0 = 0; cnt1 = 0;
	}
}
