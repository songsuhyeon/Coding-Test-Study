#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() 
{
    int x;
    vector<int> v;  // 정렬될 벡터
    vector<int> w; 
    for (int i = 0; i < 9; i++)
    {
        cin >> x;
        v.push_back(x);
        w.push_back(x);
    }

    sort(v.begin(), v.end());

    for (int i = 0; i < 9; i++)
    {
        if (w[i] == v[8])
        {
            cout << v[8] << endl;
            cout << i + 1 << endl;

        }
    }

    return 0;

}


