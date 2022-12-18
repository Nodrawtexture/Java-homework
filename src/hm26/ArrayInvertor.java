package hm26;

import java.util.Stack;

public class ArrayInvertor {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < 10; i++){
            stack.add(i+1);
        }
        System.out.println("Initial stack");
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i) + " ");
        }

        for(int i = 0; i<(Integer)stack.size()/2; i++){
            int container = stack.get(i);
            stack.set(i, stack.get(stack.size() - i - 1));
            stack.set(stack.size()-i-1, container);

        }
        System.out.println("\nModified Stack");
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i) + " ");
        }
    }
}

