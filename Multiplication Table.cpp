//https://www.acmicpc.net/problem/2739

#include <iostream>
int main(void)
{
	int num = 1;

	std::cin >> num;

	for (int i = 1; i<10; i++) {
		std::cout << num << " * " << i << " = " << num*i << std::endl;
	}
}