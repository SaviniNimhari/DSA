import java.util.Stack;

public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation (O(1))
    public void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue operation (O(n))
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (s1.size() > 1) {
            s2.push(s1.pop());
        }

        int dequeued = s1.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println(queue.dequeue()); // 100
        System.out.println(queue.dequeue()); // 200
    }
}
