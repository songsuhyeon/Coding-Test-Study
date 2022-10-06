#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int cnt = 0;     // 동전의 개수
    int n, k;        // 동전의 종류, 가치의 합
    cin >> n >> k;

    int ai;          // 동전의 가치
    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        cin >> ai;
        v.push_back(ai);
    }

    for (int i = n - 1; i >= 0; i--)
    {
        while (v[i] <= k && k >= v[i - 1])
        {
            cnt++;
            k = k - v[i];
        }
    }

    cout << cnt;

    return 0;
}
