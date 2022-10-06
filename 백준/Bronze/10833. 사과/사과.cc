#include <iostream>

using namespace std;

int main(void)
{
    int n;     // 학교의 개수
    cin >> n;

    int s, a;
    int temp;
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> s >> a;
        temp = a % s;
        sum += temp;
    }
    cout << sum;

    return 0;
}
