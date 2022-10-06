import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream(""));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        MinHeap mh = new MinHeap();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                System.out.println(mh.delete());
            } else {
                mh.insert(input);
            }
        }
    }
}

class MinHeap {
    List<Integer> list;
    
    public MinHeap() {
        list = new ArrayList<>();
        list.add(0);  // 0을 추가해두어야 1번 인덱스 부터 사용 가능
    }
    
    public void insert(int val) {
        // 1. leaf 마지막에 삽입
        list.add(val);

        int current = list.size() - 1;
        int parent = current/2;
        // 2. 부모와 비교 후 조건에 맞지 않으면 Swap : size - 1 = last
        // 3. 조건이 만족되거나 root 까지 반복
        while(true) {
            if(parent == 0 || list.get(parent) <= list.get(current)) { // 조건 만족
                break;
            }
            // Swap
            int temp = list.get(parent);
            list.set(parent, list.get(current));
            list.set(current, temp);

            current = parent;
            parent = current / 2;
        }
    }
    
    public int delete() {
        if(list.size() == 1) { // 비어 있는 경우
            return 0;
        }
        int top = list.get(1);

        // 1. Root 에 leaf 마지막 데이터 가져옴
        list.set(1, list.get(list.size()-1)); // last 를 1에 넣기
        list.remove(list.size() -1); // leaf 지우기

        // 2. 자식과 비교 후 조건이 맞지 않으면 Swap
        // 3. 조건이 만족되거나 leaf 까지 반복
        int currentPos = 1;
        while(true) {
            int leftPos = currentPos * 2;
            int rightPos = currentPos * 2 + 1;

            // 자식 조냊 유무 확인
            if(leftPos >= list.size()) {
                break;
            }

            // 왼쪽 먼저 확인
            int minValue = list.get(leftPos);
            int minPos = leftPos;

            // 오른쪽 자식 먼저 확인
            if(rightPos < list.size() && list.get(rightPos) < minValue) {
                minValue = list.get(rightPos);
                minPos = rightPos;
            }

            // Swap
            if(list.get(currentPos) > minValue) {
                int temp = list.get(currentPos);
                list.set(currentPos, list.get(minPos));
                list.set(minPos, temp);
                currentPos = minPos;
            } else { // 조건을 만족할 경우
                break;
            }
        }
        return  top;
    }
}
