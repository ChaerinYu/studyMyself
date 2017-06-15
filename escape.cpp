//https://www.acmicpc.net/problem/1085
// if you input x y w h, then it prints the shortest length to escape the rectangle.
// 1 <= x <= w - 1 and 1 <= y <= h - 1
// w, h <= 1000
#include <iostream>
#include <math.h>
int main(void)
{
	int x, y, w, h;
	float w_x, h_y, y_, x_, w_x_h_y;

	std::cin >> x >> y >> w >> h;
//	std::cin >> x;
//	std::cin >> y;
//	std::cin >> w;
//	std::cin >> h;

	if (w<=1000&& h <= 1000 &&!(x<1 || x>w - 1 || y < 1 || y>h - 1)) {
		w_x = w - x;
		h_y = h - y;
		y_ = y;
		x_ = x;
		
//		std::cout << "w-x: " << w_x <<std::endl;
//		std::cout << "h-y: " << h_y << std::endl;
//		std::cout << "y: " << y_ << std::endl;
//		std::cout << "x: " << x_ << std::endl;

		//w-x
		if (w_x < h_y && w_x < y && w_x < x) {
			std::cout << w_x << std::endl;
		} else if (h_y < w_x && h_y < y_ && h_y < x_) { //h-y
			std::cout << h_y << std::endl; 
		} else if (y_ < w_x && y_ < h_y && y_ < x_) { //y_
			std::cout << y_ << std::endl;
		} else { //x_
			std::cout << x_ << std::endl;
		}
	}
}