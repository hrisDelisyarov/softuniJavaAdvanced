package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsNumber=Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <=commandsNumber ; i++) {
            String[] input=sc.nextLine().split(" ");
            if (input[0].equals("1"))
            {
                stack.push(Integer.parseInt(input[1]));


            } else if (input[0].equals("2"))
            {
                stack.pop();

            }else if (input[0].equals("3"))
            {
                int max= Collections.max(stack);
                System.out.println(max);
            }
        }
    }
}
