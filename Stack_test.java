
import java.util.Stack;

public class Stack_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> intstack = new Stack<Integer>();
		System.out.println(intstack.empty());
		
		intstack.push(1);
		intstack.push(2);
		intstack.push(3);
		intstack.push(4);
		intstack.push(5);
		System.out.println(intstack);
		intstack.pop();
		System.out.println(intstack);
		System.out.println(intstack.peek());

	}

}
