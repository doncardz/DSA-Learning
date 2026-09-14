package Linear_Data_Structure;

import java.util.Stack;

public class stack{
    public static void main(String[] args){

        //stack = Last-In First-Out, LIFO

        Stack<String> stack = new Stack<String>();

        stack.push("Lenovo");
        stack.push("Asus");
        stack.push("Acer");
        stack.push("MSI");


        /*
            stack.push = add to stack
            stack.push("MSI");

            stack.pop = hides upper stack
            stack.pop();

            stack.peek = display the upper stack
            System.out.println(stack.peek());

            stack.search = finds stack
            System.out.println(stack.search("MSI"));
        */

        System.out.println(stack);
        
    }
}