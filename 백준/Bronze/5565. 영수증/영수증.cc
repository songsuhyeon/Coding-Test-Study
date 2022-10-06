#include<iostream>

using namespace std;

int main() {
	
	int total;     // 전체 책 값
	int price;     // 각각의 책 값
	int sum = 0;   // 9권의 책 값

	cin >> total;

	for (int i = 0; i < 9; i++)
	{
		cin >> price;
		sum += price;
	}

	cout << total - sum << endl;

	return 0;
}
