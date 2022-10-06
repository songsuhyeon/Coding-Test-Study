#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main()
{
    deque<int> mydeque;

    // 명령의 수 N (1 ≤ N ≤ 10,000)
    int n;
    cin >> n;

    string s;   // 명령

    for (int i = 0; i < n; i++)
    {
        cin >> s;

        // push_front X: 정수 X를 덱의 앞에 넣는다.
        if (s == "push_front")
        {
        int num;    // 입력될 숫자
        cin >> num;
        mydeque.push_front(num);
        }
        // push_back X: 정수 X를 덱의 뒤에 넣는다
        else if (s == "push_back")
        {
            int num;    // 입력될 숫자
            cin >> num;
            mydeque.push_back(num);
        }

        // pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력
        else if (s == "pop_front")
        {
            if (!mydeque.empty())
            {
                cout << mydeque.front() << "\n";
                mydeque.pop_front();
            }
            // 스택에 들어있는 정수가 없는 경우 -1을 출력
            else
            {
                cout << -1 << "\n";
            }
        }
        // pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력
        else if (s == "pop_back")
        {
            if (!mydeque.empty())
            {
                cout << mydeque.back() << "\n";
                mydeque.pop_back();
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
            cout << mydeque.size() << "\n";
        }    

        // empty: 스택이 비어있으면 1, 아니면 0을 출력
        else if (s == "empty")
        {
            if (!mydeque.empty())
            {
                cout << 0 << "\n";
            }
            else
            {
                cout << 1 << "\n";
            }
        }

        // front: 덱의 가장 앞에 있는 정수를 출력
        else if (s == "front")
        {
            if (!mydeque.empty())
            {
                cout << mydeque.front() << "\n";
            }
            // 덱에 들어있는 정수가 없는 경우에는 -1을 출력
            else
            {
                cout << -1 << "\n";
            }
        }
        // back: 덱의 가장 뒤에 있는 정수를 출력
        else if (s == "back")
        {
            if (!mydeque.empty())
            {
                cout << mydeque.back() << "\n";
            }
            // 덱에 들어있는 정수가 없는 경우에는 -1을 출력
            else
            {
                cout << -1 << "\n";
            }
        }        
    }

    return 0;
}