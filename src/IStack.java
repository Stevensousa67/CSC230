public interface IStack<T> {

	/**
	 * Places given value on top of a stack
	 * @param value - object of type T put on top of a stack 
	 */
	public void push(T value);

	/**
	 * Removes top value from a stack and returns it.
	 * @throws NoSuchElementException - if stack is empty
	 * @return - object of type T 
	 */
	public T pop();

	/**
	 * Returns top value from a stack without removing it.
	 * @throws NoSuchElementException  - if stack is empty
	 * @return - reference to object of type T on top of a stack 
	 */
	public T peek();

	/**
	 * Returns number of elements in a stack
	 * @return - number of elements on a stack 
	 */
	public int size();
	
	/**
	 * Returns true if a stack has no elements
	 * @return - true if empty, false otherwise
	 */
	public boolean isEmpty();

	/**
	 * Overrides Object toString method.
	 * Uses toString method of objects in stack to 
	 * print the contents of the stack, top to the left.  
	 * @return String representation of contents of stack 
	 */
	public String toString(); 

}