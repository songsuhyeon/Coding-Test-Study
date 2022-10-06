#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(void) 
{
	int n;
	cin >> n;

	int i = 1;
	cin.ignore();

	while (n--)
	{

		string s;
		getline(cin, s);

		cout << i << ". " << s << "\n";
		i++;
	}
	
	

	return 0;
}
