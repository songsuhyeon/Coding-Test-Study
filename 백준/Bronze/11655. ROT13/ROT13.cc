#include<iostream>
#include<string>

using namespace std;

int main()
{
    string s;
    getline(cin, s);

    string tmp;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] >= 'a' && s[i] <= 'z')
        {
            if (s[i] <= 'm')
            {
                s[i] += 13;
                cout << s[i];
            }
            else
            {
                s[i] -= 13;
                cout << s[i];
            }
        }
        else if (s[i] >= 'A' && s[i] <= 'Z')
        {
            if (s[i] <= 'M')
            {
                s[i] += 13;
                cout << s[i];
            }
            else
            {
                s[i] -= 13;
                cout << s[i];
            }
        }
        else
        {
            cout << s[i];
        }

    }

    return 0;
}
