#include <iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main() {
    
    int x;
    vector<int> v;
    
    for(int i=0;i<3;i++)
    {
       cin>>x; 
       v.push_back(x);
    }
    sort(v.begin(),v.end());
    for(int i=0;i<3;i++)
    {
        cout<<v[i]<<endl;
    }
    
    
    
    return 0;
}