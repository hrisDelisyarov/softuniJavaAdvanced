package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
/*
Write a program that reads N integers from the console and reverses them using a stack.
Use the ArrayDeque<Integer> class. Just put the input numbers in the stack and pop them. 
*/
public class ReverseNumbersWIthAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers=sc.nextLine().split(" ");
        ArrayDeque<Integer> stack =new ArrayDeque<>();
        for (int i = 0; i <numbers.length ; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i <numbers.length ; i++) {
            if (i < numbers.length - 1) {
                System.out.print(stack.pop() + " ");
            }
            else
            {
                System.out.print(stack.pop());
            }
        }
    }
}
