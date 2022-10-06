#include <iostream>
#include <string>

using namespace std;

int main(void) 
{
	string v;
	long long m = 0;

	for (int i = 0; i < 3; i++)
	{
		string s;
		cin >> s;
	
		if (i < 2)
		{
			if (s == "black")
				v += '0';
			else if (s == "brown")
				v += '1';
			else if (s == "red")
				v += '2';
			else if (s == "orange")
				v += '3';
			else if (s == "yellow")
				v += '4';
			else if (s == "green")
				v += '5';
			else if (s == "blue")
				v += '6';
			else if (s == "violet")
				v += '7';
			else if (s == "grey")
				v += '8';
			else if (s == "white")
				v += '9';
		}
		else
		{
			if (s == "black")
				m = 1;
			else if (s == "brown")			
				m = 10;			
			else if (s == "red")			
				m = 100;			
			else if (s == "orange")			
				m = 1000;			
			else if (s == "yellow")			
				m = 10000;
			else if (s == "green")			
				m = 100000;			
			else if (s == "blue")			
				m = 1000000;			
			else if (s == "violet")
				m = 10000000;
			else if (s == "grey")
				m = 100000000;
			else if (s == "white")
				m = 1000000000;
		}	
	}
	cout << stoll(v) * m;

	return 0;
}
