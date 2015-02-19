import java.util.LinkedList;


/**
 * @author Charlie Bloomfield
 * Feb 18, 2015
 */

public class StackExample {

}

class ArrayStack{
	private int[] a;
	private int head;

	public ArrayStack(){
		a = new int[10];
		head = 0;
	}

	public void push(int x){
		a[head] = x;
		head++;
	}

	public int pop(){
		int toReturn = a[head];
		a[head] = 0;
		head--;
		return toReturn;
	}
}

class LinkedListStack{
	private LinkedList<Integer> a = new LinkedList<Integer>();
	
	public void push(Integer x){
		a.add(x);
	}
	
	public Integer pop(){
		return a.remove();
	}
}
