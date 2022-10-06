#include<iostream>

using namespace std;

int main() 
{
    int t;
    cin >> t;

    int num[80];
    string s[80];
    for (int i = 0; i < t; i++)
    {
        cin >> num[i];
        cin >> s[i];
    }

    for (int i = 0; i < t; i++)
    {
        for (int j = 0; j < s[i].size(); j++)
        {
            if (j != num[i] - 1)
            {
                cout << s[i][j];

            }
        }
        cout << endl;
    }

    return 0;
}