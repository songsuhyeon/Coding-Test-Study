#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	int t;
	cin >> t;


	while (t--)
	{
		int n, m;   // 모든 닭의 다리수의 합, 닭의 수
		cin >> n >> m;

		int u = 0, T = 0;   // 다리가 잘린 닭의 수, 멀쩡한 닭의 수 
		if (n < m * 2)
		{
			u = m * 2 - n;
			T = m - u;
			cout << u << " " << T << "\n";
		}
		else
		{
			cout << 0 << " " << m << "\n";
		}
	}

	return 0;
}
