#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main()
{
    int sum1 = 0, sum2 = 0;
    int score;
    for (int i = 0; i < 4; i++)
    {
        cin >> score;
        sum1 += score;
    }
    for (int i = 0; i < 4; i++)
    {
        cin >> score;
        sum2 += score;
    }

    if (sum1 < sum2)
        cout << sum2;
    else
        cout << sum1;

    return 0;
}