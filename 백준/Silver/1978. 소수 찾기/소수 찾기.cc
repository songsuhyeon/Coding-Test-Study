#include<iostream>
#include<vector>

using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<int> v;
    int x;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        v.push_back(x);
    }

    int cnt = 0;
    int div = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 1; j <= v[i]; j++)
        {
            if (v[i] % j == 0)
                div++;
        }
        if (div == 2)
            cnt++;
        div = 0;
    }

    cout << cnt << endl;

    return 0;

}
