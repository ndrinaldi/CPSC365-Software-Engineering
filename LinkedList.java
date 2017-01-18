public class LinkedList {

    public static void main(String[] args){}

    private int size; // number of elements in List
    private ListNode currNode; // the ListNode that is the 'current Object'
    private ListNode firstNode; // the first ListNode in the LinkedList
    private ListNode lastNode; // the last ListNode in the LinkedList

    //
    public LinkedList(){
	size = 0;
	currNode = null;
	firstNode = null;
	lastNode = null;
    }

    //
    public void AddToEnd(Object newData) {
	ListNode newNode(newData);
	
	if (firstNode != null){
	    lastNode.setNext(newNode);
	}else {
	    firstNode = currNode = lastNode = newNode;
	}

	lastNode = newNode;
	size += 1;
    }

    //
    public void Print() {
	String temp = "[";
	
	
	while 






    
    //
    class ListNode {

	private Object data; // the data held in this node
	private ListNode nextNode; // the next node in the List

	//
	public ListNode(Object newData) {
	    data = ob;
	    nextNode = null;
	}

	//
	public setNext(ListNode newNode) { nextNode = NewNode; }

	//
	public Object getData(){ return(data); }

	//
	public ListNode getNext(){ return(nexNode); }
	
    }

    
