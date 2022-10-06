#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        for (int j = i; j < n; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }
        for (int j = n; j > n - i; j--)
        {
            cout << "*";
        }
        cout << endl;
    }

    for (int i = 2; i <= n; i++)
    {
        for (int j = 1; j <= n - i + 1; j++)
        {
            cout << "*";
        }
        for (int j = n - 1; j > n - i; j--)
        {
            cout << " ";
        }
        for (int j = 1; j < i; j++)
        {
            cout << " ";
        }
        for (int j = n - i ; j >= 0; j--)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}
