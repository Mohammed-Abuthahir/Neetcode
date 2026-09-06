// Number of Students Unable to Eat Lunch
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countStudents{
    public static int countstudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for(int num : students) queue1.add(num);
        for(int num : sandwiches) queue2.add(num);
        int count = 0;
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            int student = queue1.poll();
            int sandwich = queue2.peek();
            if(student == sandwich){
                queue2.poll();
                count = 0;
            }
            else {
                queue1.add(student);
                count++;
            }
            if(count == queue1.size()) break;
        }
        return queue1.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Students Count : ");
        int size1 = scan.nextInt();
        System.out.println("Enter the Students ");
        int[] students = new int[size1];
        for(int i = 0;i < students.length; i++){
            students[i] = scan.nextInt();
        }
        System.out.println("Enter the sandwiches count :");
        int size2 = scan.nextInt();
        System.out.println("Enter the Sandwiches :");
        int[] sandwiches = new int[size2];
        for(int i = 0;i < sandwiches.length; i++){
            sandwiches[i] = scan.nextInt();
        }
        int result = countstudents(students, sandwiches);
        System.out.println(result);
    }
}