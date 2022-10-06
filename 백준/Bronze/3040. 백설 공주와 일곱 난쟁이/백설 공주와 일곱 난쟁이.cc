#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main()
{
    int num, sum = 0;
    vector<int> v;
    for (int i = 0; i < 9; i++)
    {
        cin >> num;
        sum += num;
        v.push_back(num);
    }
    
    for (int i = 0; i < 9; i++)
    {
        for (int j = i + 1; j < 9; j++)
        {
            if (100 == sum - v[i] - v[j])
            {
                v[i] = -1;
                v[j] = -1;
            }
        }
    }

    for (int i = 0; i < 9; i++)
    {
        if (v[i] != -1)
            cout << v[i] << "\n";
    }

    return 0;
}