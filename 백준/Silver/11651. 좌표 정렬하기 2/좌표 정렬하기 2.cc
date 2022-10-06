#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

bool compare(const pair<int, int>& x, const pair<int, int>& y)
{
    if (x.second == y.second)
    {
        return x.first < y.first;
    }
    else
        return x.second < y.second;
}

int main()
{
    vector<pair<int, int>> v;

    int n;
    cin >> n;

    int x, y;
    for (int i = 0; i < n; i++)
    {
        cin >> x >> y;
        v.push_back(pair<int, int>(x, y));
    }

    sort(v.begin(), v.end(), compare);

    for (int i = 0; i < n; i++)
    {
        cout << v[i].first << " " << v[i].second << "\n";
    }

    return 0;
}