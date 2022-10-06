#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;
	cin.ignore();

	while (n--)
	{
		string s;
		getline(cin, s);

		if (s == "*")
			break;
	
		int check = 0;
		int arr[26] = { 0 };
		for (int i = 0; i < s.size(); i++)
		{
			if (s[i] >= 'a' && s[i] <= 'z')
			{
				arr[s[i] - 'a']++;
			}
			if (s[i] >= 'A' && s[i] <= 'Z')
			{
				arr[s[i] - 'A']++;
			}
		}

		for (int i = 0; i < 26; i++)
		{
			if (arr[i] == 0)
				check++;
		}

		if (check == 0)
			cout << "pangram\n";
		else
		{
			cout << "missing ";
			for (int i = 0; i < 26; i++)
			{
				if (arr[i] == 0)
					cout << (char)(i + 97);
			}
			cout << "\n";
		}
	}

	return 0;
}
