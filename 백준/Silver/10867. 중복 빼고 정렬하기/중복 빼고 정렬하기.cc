#include <iostream>
#include<algorithm>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;

	int cnt = 0;
	int num;
	int arr[2002] = { 0 };
	int flag[2002] = { 0 };
	while (n--)
	{
		cin >> num;
		if (num < 0)
		{
			arr[num * (-1)] = num;
			flag[num * (-1)] = 1;
		}
		else
		{
			arr[num + 1001] = num;
			flag[num + 1001] = 1;
		}
	}

	for (int i = 0; i < 2002; i++)
	{
		if (i < 1001)
		{
			for (int j = 1000; j >= 0; j--)
			{
				if (flag[j] == 1)
					cout << arr[j] << " ";
			}
			i = 1000;
		}
		else
		{
			if (flag[i] == 1)
				cout << arr[i] << " ";
		}
		

	}

	return 0;
}
