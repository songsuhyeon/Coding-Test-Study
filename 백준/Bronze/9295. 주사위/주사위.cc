#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<pair<int, int>> v;

    int t;
    cin >> t;

    int a, b;
    for (int i = 0; i < t; i++)
    {
        cin >> a >> b;
        v.push_back(pair<int, int>(a, b));
    }
    for (int i = 0; i < t; i++)
    {
        cout << "Case " << i + 1 << ": " << v[i].first + v[i].second << endl;
    }

    return 0;
}
