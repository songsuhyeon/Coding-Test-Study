#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    int a, b;
    vector<int> v;  // 상덕버거, 중덕버거, 하덕버거 가격 저장
    vector<int> w;  // 콜라, 사이다 가격 저장

    for (int i = 0; i < 3; i++)
    {
        cin >> a;
        v.push_back(a);
    }

    for (int i = 0; i < 2; i++)
    {
        cin >> b;
        w.push_back(b);
    }

    sort(v.begin(), v.end());
    sort(w.begin(), w.end());

    cout << v[0] + w[0] - 50;

    return 0;
}
