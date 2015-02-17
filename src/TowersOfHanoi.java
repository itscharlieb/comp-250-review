import java.util.Stack;

/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */
public class TowersOfHanoi {
	
	/*
	 * Here we declare three Stacks, each one representing a pole on which we can stack
	 * our Hanoi disks. Stacks are abstract data types - they provide us with the ability
	 * to "push" and "pop" elements, just like a stack of disks for Towers of Hanoi!
	 */
	private Stack<Integer> startPole;
	private Stack<Integer> endPole;
	private Stack<Integer> tempPole;
	
	public TowersOfHanoi(int numDisks){
		startPole = new Stack<Integer>();
		endPole = new Stack<Integer>();
		tempPole = new Stack<Integer>();
		
		setupStartPole(numDisks);
	}
	
	private void setupStartPole(int numDisks){
		for(int i = numDisks; i > 0; i--){
			/*implicit coversion of i from primitive int type to Integer
			 * We need to push the largest item first so we decrement through the 
			 * for loop.
			 */
			startPole.push(i);
		}
	}
	
	public void solveTowersOfHanoi(){
		
	}
}
