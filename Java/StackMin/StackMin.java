import java.util.Stack;

class StackMin {
	private static Stack<Integer> populateStack(int[] inputValues) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<inputValues.length; i++) {
			stack.push(inputValues[i]);
		}
		
		return stack;
	}
	
	private static int findMinValue(Stack<Integer> stack) {
		int result = stack.pop();
		
		while(stack.size() > 1) {
			if(result > stack.peek()) {
				result = stack.pop();
			} else if(result < stack.peek()) {
				stack.pop();
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] inputValues = new int[]{9, 6, 0, 4, 7, 3};
		Stack<Integer> stack = populateStack(inputValues);
		System.out.println("The minimum value is: "+ findMinValue(stack));
	}
}