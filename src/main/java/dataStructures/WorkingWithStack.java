package dataStructures;

import java.util.Stack;

public class WorkingWithStack
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(8);
        stack.push(15);
        stack.push(3);
        System.out.println("Peek " + stack.peek());
        System.out.println("Size " + stack.size());
        System.out.println("Pop or Delete " + stack.pop());
        System.out.println("Size " + stack.size());
        System.out.println("Peek " + stack.peek());
        System.out.println("Is empty? " + stack.empty());
        System.out.println("Search position " + stack.search(1));

    }
}
