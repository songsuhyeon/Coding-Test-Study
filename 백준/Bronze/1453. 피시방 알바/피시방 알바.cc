#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;

    int arr[101] = { 0 };
    int num;
    int cnt = 0;

    while (n--)
    {
        cin >> num;
        arr[num]++;
    }

    for (int i = 1; i <= 100; i++)
    {
        if (arr[i] > 1)
            cnt += (arr[i] - 1);
    }

    cout << cnt;   
  
    return 0;
}
