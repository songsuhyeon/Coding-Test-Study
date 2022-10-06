#include<iostream>

using namespace std;

class Y
{
public:
    int n[4];
    int sum[3] = { 0 };
};
int main() 
{
    Y y[3];

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            cin >> y[i].n[j];
            y[i].sum[i] += y[i].n[j];
        }
    }

    for (int i = 0; i < 3; i++)
    {
        if (y[i].sum[i] == 3)
            cout << "A" << endl;
        if (y[i].sum[i] == 2)
            cout << "B" << endl;
        if(y[i].sum[i] == 1)
            cout << "C" << endl;
        if (y[i].sum[i] == 0)
            cout << "D" << endl;
        if (y[i].sum[i] == 4)
            cout << "E" << endl;

    }
    return 0;

}


