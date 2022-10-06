#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	while (1)
	{
		string s;
		getline(cin, s);

		if (s == "*")
			break;
	
		int check = 0;
		int arr[26] = { 0 };
		for (int i = 0; i < s.size(); i++)
		{
			arr[s[i] - 'a']++;
		}
		for (int i = 0; i < 26; i++)
		{
			if (arr[i] == 0)
				check++;
		}

		if (check == 0)
			cout << "Y\n";
		else
			cout<<"N\n";
	}

	return 0;
}
