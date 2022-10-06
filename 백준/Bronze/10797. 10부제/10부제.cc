#include <iostream>

using namespace std;

int main()
{
    int d, c[5];
    int cnt = 0;

    cin >> d;

    for (int i = 0; i < 5; i++)
    {
        cin >> c[i];
    }
    for (int i = 0; i < 5; i++)
    {
        if (c[i] == d)
        {
            cnt++;
        }
    }
    cout << cnt << endl;

    return 0;
}
