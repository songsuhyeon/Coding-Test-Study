#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int num;
    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        cin >> num;
        v.push_back(num);
    }

    int sum = 0;
    int add = 0;

    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            if (v[i] == 1)
                sum += 1;
            else
                sum = 0;
        }
        else
        {
            if (v[i - 1] == 1 && v[i] == 1)
            {
                add++;
                sum = sum + add + v[i];
            }
            if (v[i - 1] == 0 && v[i] == 1)
            {
                sum += 1;
            }
            if(v[i]==0)
            {
                add = 0;
            }

        }       
    }

    cout << sum << endl;

    return 0;
}
