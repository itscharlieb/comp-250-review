class Link {
    public int data;;
    public Link next;

    //Link constructor
    public Link(int d) {
	    data = d;
    }

    //Print Link data
    public void printLink() {
	    System.out.print("{" + data + "}");
    }
}

public class MyLinkedList {
    private Link head;

    //LinkList constructor
    public MyLinkedList() {
	    head = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
	    return head == null;
    }

    //Inserts a new Link at the head of the list
    public void inserthead(int d) {
	    Link link = new Link(d);
	    link.next = head;
	    head = link;
    }

    //Deletes the link at the head of the list
    public Link deletehead() {
	    Link temp = head;
	    head = head.next;
	    return temp;
    }
    
    //removes element
    public Link remove(int d){
    	if(isEmpty()) return null;
    	
    	Link ret;
    	Link tmp = head;
    	
    	//if node to return is head node
    	if(this.head.data == d){
    		this.head = this.head.next;
    		return tmp;
    	}
    	
    	//
    	while(tmp.next != null){
    		if(tmp.next.data == d){
    			ret = tmp.next;
    			tmp.next = tmp.next.next;
    			return ret;
    		}
    		tmp = tmp.next;
    	}
    	
    	return null;
    }

    //Prints list data
    public void printList() {
	    Link currentLink = head;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.next;
	    }
	    System.out.println("");
    }
}  