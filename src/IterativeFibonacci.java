
/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */

public class IterativeFibonacci {
	public static int getFib(int n){
		
		//we'll call fib(0) = 0 and fib(1) = 1
		int curFib = 0; 
		int nextFib = 1; 
		int tmp;
		
		for(int i = 0; i < n; i++){
			tmp = nextFib;
			nextFib = curFib + nextFib;
			curFib = tmp;
		}
		
		return curFib;
	}
	
	public static void main(String[] args){
		System.out.println(getFib(4));
	}
}
