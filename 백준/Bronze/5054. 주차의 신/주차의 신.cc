#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    vector<int> v;
    vector<int> r;
    int t, n, xi;
    
    cin >> t;   // 테스트 개수

    for (int i = 0; i < t; i++)
    {
        cin >> n;   // 방문할 상점의 수

        for (int j = 0; j < n; j++)
        {
            cin >> xi;  // 상점의 위치
            v.push_back(xi);
        }

        sort(v.begin(), v.end());

        int res = 0;
        res = (v[v.size() - 1] - v[0]) * 2;
        r.push_back(res);

        v.clear();
    }

    for (int i = 0; i < t; i++)
    {
        cout << r[i] << endl;
    }

    return 0;
}