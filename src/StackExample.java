import java.util.LinkedList;


/**
 * @author Charlie Bloomfield
 * Feb 18, 2015
 */

public class StackExample {
	public static ArrayStack giveMeAnArrayStack(){
		return new ArrayStack();
	}
	
	public static LinkedListStack giveMeALinkedListStack(){
		return new LinkedListStack();
	}
}

class ArrayStack{
	private int[] a;
	private int head;

	/*
	 * Here's a stack implemented with an array. If you try to put an 11th
	 * element in it, the program will crash, but that's beside the point.
	 */
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
	private LinkedList<Integer> a;
	
	public LinkedListStack(){
		a = new LinkedList<Integer>();
	}
	
	public void push(Integer x){
		a.add(x);
	}
	
	public Integer pop(){
		return a.remove();
	}
}
