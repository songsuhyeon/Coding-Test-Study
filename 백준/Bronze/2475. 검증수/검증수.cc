#include <iostream>

using namespace std;

int main()
{
    int n[5];
    int x;

    for (int i = 0; i < 5; i++)
    {
        cin >> x;
        n[i] = x;
    }

    int tmp = 0;
    for (int i = 0; i < 5; i++)
    {
        tmp = tmp + (n[i] * n[i]);
    }

    cout << tmp % 10 << endl;

    return 0;
}
