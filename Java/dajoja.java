
import java.util.Stack;
 
public class dajoja {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();
		
 
 
        // Push elements onto the stack
        stack.push(10);
        stack.push(5);
        stack.push(7);
		System.out.print(stack.pop()+"\n");
		stack.push(13);
		stack.push(4);
		System.out.print(stack.pop()+"\n");
		System.out.print(stack.pop()+"\n");
		System.out.print(stack.pop()+"\n");
		stack.push(1);
		System.out.print(stack.pop()+"\n");
		System.out.print(stack.pop()+"\n");
        // Pop elements from the stack
        
    }
}