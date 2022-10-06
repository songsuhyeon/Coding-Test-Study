#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v;
    int N, M;
    int L = 0, H = 0;
    int num;
    int res = 0;
    cin >> N >> M;
    for (int i = 0; i < N; i++)
    {
        cin >> num;
        v.push_back(num);
    }
    while (H!=v.size())
    {
        int sum = 0;
        if (L == -1 || L >= v.size() || H >= v.size())
        {
            break;
        }
        for (int i = L; i <= H; i++)
        {
            sum += v[i];
        }

        if (sum < M)
        {
            H++;
        }
        else if (sum == M)
        {
            L++;
            res++;
            sum = 0;
        }
        else
        {
            L++;
        }
    }

    cout << res;
}