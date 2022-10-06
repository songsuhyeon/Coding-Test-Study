#include<iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main() 
{
    vector<pair<int, int>> v;
    int out, in;

    for (int i = 0; i < 4; i++)
    {
        cin >> out >> in;
        v.push_back(pair<int, int>(out, in));
    }

    int total = 0;
    vector<int> t; // 기차 안에 탄 사람 수 저장
    for (int i = 0; i < 4; i++)
    {
        total += v[i].second;
        total -= v[i].first;

        t.push_back(total);
    }

    sort(t.begin(), t.end());
    cout << t[3] << endl;

    return 0;

}


