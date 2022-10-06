#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int x;
    vector<int> v;
    vector<pair<int,int>> w;  // 결과 저장
    int t;
    cin>>t;
    for(int j=0;j<t;j++)
    {
        for(int i=0;i<7;i++)
        {
            cin>>x;
            if(x%2==0)
            {
                v.push_back(x);
            }
        }
        
        int sum=0;
        for(int i=0;i<v.size();i++)
        {
            sum +=v[i];
        }
        
        sort(v.begin(),v.end());

       w.push_back(pair(sum, v[0]));
        
        v.clear();
    }
    
    for(int j=0;j<t;j++)
    {
        cout<< w[j].first <<" "<< w[j].second<<endl;
    }
    
    return 0;
}