package week4;

/***
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 */
public class minStack {
    Node head;
    class Node{
        int val, min;
        Node next;
        Node(int v, int m, Node next){
            val = v;
            min = m;
            this.next = next;
        }
    }
    public void push(int val){
        if(head == null){
            head = new Node(val, val, null);
        }else{
            head = new Node(val, Math.min(head.min, val), head);
        }
    }

    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val;
    }

    public int getMin(){
        return head.min;
    }


}
