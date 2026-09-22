//  Implement Stack using Queues
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designStack{
    public static void main(String[] args){
        MyStack mystack = new MyStack<>();
        mystack.push(1);
        mystack.push(2);
        mystack.top();
        mystack.pop();
        mystack.empty();
    }
}
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();

    public MyStack(){};

    public void push(int x){
        q1.add(x);
        int size = q1.size();
        for(int i = 0;i < size - 1; i++){
            q1.add(q1.poll());
        }
    }
    public int pop(){
        return q1.poll();
    }
    public int top(){
        return q1.peek();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
}