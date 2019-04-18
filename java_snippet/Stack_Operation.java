/**
 * Given two sequences pushed and popped with distinct values, return true if and only if this could have been 
 * the result of a sequence of push and pop operations on an initially empty stack.
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * 
 */


//import java.util.Arrays;
import java.util.Stack;

public class Stack_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] pushed = {1,2,3,4,5};
            int[] popped = {4,5,3,1,2};
            boolean var = validateStackOperation(pushed,popped);
            System.out.println(var);
	}

	private static boolean validateStackOperation(int[] pushed, int[] popped) {
		Stack<Integer> stk = new Stack<>();
		int i=0,j=0;
		while(i<pushed.length && j<popped.length) {
			stk.push(pushed[i++]);
		//	System.out.println(Arrays.toString(stk.toArray()));
		while(!stk.isEmpty() && stk.peek()==popped[j]) {
			stk.pop();
			j++;
		}
		}
		
		
		return stk.isEmpty();
	}

}
