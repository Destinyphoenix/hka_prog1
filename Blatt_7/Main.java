import Blatt_7.ArrayStack;
import Blatt_7.ListStack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ListStack<Integer> stack = new ListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(Integer element : stack){
            System.out.println(element);
        }
    }
}
