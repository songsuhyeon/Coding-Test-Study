#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	int n;
	cin >> n;

	int arr[26] = { 0 };

	while (n--)
	{
		string name;
		cin >> name;

		arr[name[0] - 'a']++;
	}
	
	int check = 0;
	for (int i = 0; i < 26; i++)
	{
		if (arr[i] >= 5)
		{
			cout << (char)(i + 'a');
			check++;
		}
		
	}

	if (check == 0)
		cout << "PREDAJA";

	return 0;
}
