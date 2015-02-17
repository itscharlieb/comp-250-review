import java.util.Stack;

/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */

interface IStringQueue{
	void enqueue(String s);
	String dequeue();
	String peek();
	boolean isEmpty();
	void clear();
}

public class StringQueue implements IStringQueue{
	private Stack<String> inbox;
	private Stack<String> outbox;
	
	public StringQueue(){
		inbox = new Stack<String>();
		outbox = new Stack<String>();
	}

	@Override //O(1)
	public void enqueue(String s) {
		inbox.push(s);
	}

	@Override //O(1), amortized O(n)
	public String dequeue() {
		if(!isEmpty()){
			transferInboxToOutbox();
			return outbox.pop();
		}
		return null;
	}

	@Override //O(1), amortized O(n)
	public String peek() {
		if(!isEmpty()){
			transferInboxToOutbox();
			return outbox.pop();
		}
		return null; 
	}
	
	/**
	 * Helper function that transfers elements from the inbox stack to the outbox stack.
	 * This restores the FIFO ordering of the elements.
	 * O(n)
	 */
	private void transferInboxToOutbox(){
		//if the outbox is empty, we need to put all inbox elements in it
		if(outbox.isEmpty()){
			while(!inbox.isEmpty()){ //while the the inbox is not empty 
				outbox.push(inbox.pop()); //move element to outbox
			}
		}
	}

	@Override //O(1)
	public boolean isEmpty() {
		return inbox.isEmpty() && outbox.isEmpty();
	}

	@Override //O(n) ?
	public void clear() {
		inbox.clear();
		outbox.clear();
	}
}
