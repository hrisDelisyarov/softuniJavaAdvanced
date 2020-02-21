package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] commands=sc.nextLine().split(" ");
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        String[] numbers=sc.nextLine().split(" ");
        int number=Integer.parseInt(commands[2]);
        for (int i = 0; i <Integer.parseInt(commands[0]) ; i++) {
            queue.add(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i <Integer.parseInt(commands[1]) ; i++) {
            queue.remove();
        }
        if (queue.contains(number))
        {
            System.out.println("true");
        } else
        {


            if(!queue.isEmpty())
            {
                int min= Collections.min(queue);
                System.out.println(min);
            }else
            {
                System.out.println("0");
            }


        }
    }
}
