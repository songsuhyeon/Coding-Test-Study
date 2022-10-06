#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    vector<int> v;

    vector<int> x;  // 가장 높은 점수
    vector<int> y;  // 가장 낮은 점수
    vector<int> w;  // 가장 큰 인접한 점수 차이

    int k; // 반의 수 
    cin >> k;

    int n, math;  // 학생수, 수학 성적

    for (int i = 0; i < k; i++)
    {
        cin >> n;
        for (int j = 0; j < n; j++)
        {
            cin >> math;
            v.push_back(math);
        }

        sort(v.begin(), v.end(), greater<int>());
        x.push_back(v[0]);
        y.push_back(v[v.size() - 1]);

        // 가장 큰 인접한 점수 차이
        int g, max = 0;
        for (int j = 0; j < n - 1; j++)
        {
            g = v[j] - v[j + 1];
            if (max < g)
            {
                max = g;
            }
        }
        w.push_back(max);

        v.clear();
    }  

    // 출력
    for (int i = 0; i < k; i++)
    {
        cout << "Class " << i + 1 << endl;

        cout << "Max " << x[i] << ", Min " << y[i] << ", Largest gap " << w[i] << endl;

    }

    return 0;
}
