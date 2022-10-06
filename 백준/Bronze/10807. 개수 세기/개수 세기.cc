#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int x[100];
    for(int i=0;i<n;i++)
    {
        cin>>x[i];
    }
    
    int v;
    cin>>v;
    
    int cnt=0;
    for(int i=0;i<n;i++)
    {
        if(x[i]==v)
            cnt++;
    }
    
    cout<<cnt<<endl;
    
    return 0;
}