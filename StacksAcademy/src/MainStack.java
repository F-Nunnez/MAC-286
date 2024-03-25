
public class MainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));
        
        //stack.printStack();
        
        System.out.println(stack.peek());
        //stack.printStack();
        
        System.out.println("Pooped: "+stack.pop());
        System.out.println(stack.peek());

	}

}
