package Week_2.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peek, poll
        // Queue: 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>(); // Queue 선언 및 생성

        intQueue.add(1);
        intQueue.add(12);
        intQueue.add(56);

        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }
        // 추가
        intQueue.add(1);
        intQueue.add(12);
        intQueue.add(56);
        intQueue.add(23);

        //peek
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
