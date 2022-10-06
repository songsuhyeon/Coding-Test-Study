#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main() {
    
    vector<int> v;
    int x;

    for (int i = 0; i < 7; i++)
    {
        cin >> x;
        if (x % 2 == 1)
        {
            v.push_back(x);
        }
    }

    int sum = 0;
    for (int i = 0; i < v.size(); i++)
    {
            sum += v[i];
    }

    if (v.size() == 0)
    {
        cout << -1 << endl;
    }
    else
    {
        cout << sum << endl;
        // 오름차순으로 정렬
        sort(v.begin(), v.end());
        // 최소값 출력
        cout << v[0] << endl;
    }

    return 0;
}
