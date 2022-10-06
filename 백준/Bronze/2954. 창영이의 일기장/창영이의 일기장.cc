#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	char arr[5] = { 'a','e','i','o','u' };

	string s;
	getline(cin, s);

	for (int i = 0; i < s.length(); i++)
	{
		cout << s[i];
		for (int j = 0; j < 5; j++)
		{
			if (s[i] == arr[j] && s[i + 1] == 'p' && s[i] == s[i + 2])
			{
				i = i + 2;
			}
		}
	}

	return 0;
}
