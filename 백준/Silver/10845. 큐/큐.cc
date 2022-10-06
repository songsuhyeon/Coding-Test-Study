#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main()
{
    queue<int> myqueue;

    // 명령의 수 N (1 ≤ N ≤ 10,000)
    int n;
    cin >> n;

    string s;   // 명령

    for (int i = 0; i < n; i++)
    {
        cin >> s;

        //push X: 정수 X를 스택에 넣는 연산
        if (s == "push")
        {
            int num;    // 입력될 숫자
            cin >> num;
            myqueue.push(num);
        }
        // pop: 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력
        else if (s == "pop")
        {
            if (!myqueue.empty())
            {
                cout << myqueue.front() << "\n";
                myqueue.pop();
            }
            // 스택에 들어있는 정수가 없는 경우 -1을 출력
            else
            {
                cout << -1 << "\n";
            }
        }
        // size: 스택에 들어있는 정수의 개수를 출력
        else if (s == "size")
        {
            cout << myqueue.size() << "\n";
        }      
        // empty: 스택이 비어있으면 1, 아니면 0을 출력
        else if (s == "empty")
        {
            if (!myqueue.empty())
            {
                cout << 0 << "\n";
            }
            else
            {
                cout << 1 << "\n";
            }
        }
        else if (s == "front")
        {
            if (!myqueue.empty())
            {
                cout << myqueue.front() << "\n";
            }
            else
            {
                cout << -1 << "\n";
            }
        }
        else if (s == "back")
        {
            if (!myqueue.empty())
            {
                cout << myqueue.back() << "\n";
            }
            else
            {
                cout << -1 << "\n";
            }
        }        
    }

    return 0;
}