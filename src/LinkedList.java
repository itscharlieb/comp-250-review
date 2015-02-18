/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */

public class LinkedList {
	private ListNode head;
	
	public LinkedList(){
		head = null;
	}
	
	public void addFirst(Object data){
		ListNode newNode = new ListNode(data);
		newNode.next = this.head;
		this.head = newNode;
		
	}
	
	public void addLast(Object data){
		ListNode tmp = head;
		while(tmp != null){
			tmp = tmp.next;
		}
		tmp.data = data;
	}
	
	public Object removeFirst(Object data){
		ListNode tmp = head;
		Object toReturn = null;	
		while(tmp.next != null){
			
		}
	}
	
	public Object remove(int index){
		
	}
}

class ListNode{
	Object data;
	ListNode next;
	
	public ListNode(Object data){
		this.data = data;
		this.next = null;
	}
}
