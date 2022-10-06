#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int t;
	cin >> t;

	while (t--)
	{
		int arr[26] = { 0 };

		string s;
		cin >> s;

		for (int i = 0; i < s.size(); i++)
		{
			arr[(int)s[i] - 65]++;
		}

		int sum = 0;
		for (int i = 0; i < 26; i++)
		{
			if (arr[i] == 0)
				sum += i + 65;
		}

		cout << sum << "\n";
	}
	
	return 0;
}
