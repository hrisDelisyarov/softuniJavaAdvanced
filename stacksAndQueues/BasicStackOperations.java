package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
/*
You will be given an integer N representing the number of elements to push onto the stack,
an integer S representing the number of elements to pop from the stack and finally an integer X,
an element that you should check whether is present in the stack. If it is, print true on the console.
If it’s not, print the smallest element currently present in the stack.

*/
public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nsx=sc.nextLine().split(" ");
        int n = Integer.parseInt(nsx[0]);
        int s = Integer.parseInt(nsx[1]);
        int x = Integer.parseInt(nsx[2]);
        String[] numbers=sc.nextLine().split(" ");
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i <s ; i++) {
            stack.pop();

        }
        if (stack.contains(x))
        {
            System.out.println("true");
        }
        else if (stack.isEmpty())
        {
            System.out.println("0");
        } else
        {
            int min=stack.pop();
            for (int i=0;i<stack.size();i++)
            {
                if (stack.peek()<min)
                {
                    min=stack.peek();
                }
                stack.pop();
            }
            System.out.println(min);
        }
    }
}
