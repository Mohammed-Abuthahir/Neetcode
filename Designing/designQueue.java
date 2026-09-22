// Implement Queue using Stacks
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designQueue{
    public static void main(String[] args){
        MyQueue myqueue = new MyQueue();
        myqueue.push(1);
        myqueue.push(2);
        System.out.println(myqueue.peek());
        System.out.println(myqueue.pop());
        System.out.println(myqueue.empty());
    }
}

class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue(){

    }
    public void push(int x){
        s1.push(x);
    }
    public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek(){
        if(!s2.isEmpty()) return s2.peek();
        else {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}