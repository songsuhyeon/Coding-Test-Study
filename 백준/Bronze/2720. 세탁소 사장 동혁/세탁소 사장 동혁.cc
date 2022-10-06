#include <iostream>

using namespace std;

int main(void) 
{
	int t;
	cin >> t;

	int change;
	while (t--)
	{
		cin >> change;

		int c[4] = { 0 };

		while (change > 0)
		{

			if (change >= 25)
			{
				change -= 25;
				c[0]++;
			}
			else if (change >= 10)
			{
				change -= 10;
				c[1]++;
			}
			else if (change >= 5)
			{
				change -= 5;
				c[2]++;
			}
			else if (change >= 1)
			{
				change -= 1;
				c[3]++;
			}
		}

		cout << c[0] << " " << c[1] << " " << c[2] << " " << c[3] << "\n";
		
	}

	

	return 0;
}
