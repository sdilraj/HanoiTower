import java.util.Stack;

public class Hanoi { // Implement Tower of Hanoi using Stack

	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public Hanoi(int size) {
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = -1;
	}
	
	public void push(int entry) //throws Exception 
		{
		if (this.isStackFull()) {
			//throw new Exception ("Stack is already full");
		}
		System.out.println("Adding: " + entry);
		this.stackArray[++top] = entry;
	}
	
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception ("Stack is empty");
		}
		int entry = this.stackArray[top--];
		System.out.println("Removed: " + entry);
		return entry;
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	
	
	
	/*
	public static void main(String[] args) {
		Hanoi stack = new Hanoi(5); // stack
		
		for(int i = 1; i < 10; i++) {
			stack.push(i);
		}
		
		for(int i = 1; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	*/
	
	

}
