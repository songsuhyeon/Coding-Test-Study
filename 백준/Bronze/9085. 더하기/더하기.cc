#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main() {
    
    vector<int> v;
    
    int t;
    cin >> t;

    int n;
    for (int i = 0; i < t; i++)
    {
        cin >> n;

        int sum = 0;
        for (int j = 0; j < n; j++)
        {
            int x;
            cin >> x;
            sum += x;
        }
        v.push_back(sum);
    }

    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << endl;
    }
    return 0;
}
