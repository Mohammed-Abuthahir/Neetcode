//  Min Stack
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designminStack{
    public static void main(String[] args){
        MinStacks m1 = new MinStacks();
        m1.push(-2);
        m1.push(0);
        m1.push(-3);
        System.out.println(m1.getMin());
        m1.pop();
        System.out.println(m1.top());
        System.out.println(m1.getMin());
    }
}

class MinStacks{

    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int val){
        s1.push(val);
        if(s2.isEmpty()) s2.push(val);
        else{
            if(s2.peek() >= val){
                s2.push(val);
            }
        }
    }

    public void pop(){
        if(!s1.isEmpty() && !s2.isEmpty() && Objects.equals(s1.peek(), s2.peek())){
            s2.pop(); s1.pop();
        }
        else s1.pop();
    }

    public int top(){
        return s1.peek();
    }

    public int getMin(){
        return !s2.isEmpty() ? s2.peek() : 0;
    }
    
}