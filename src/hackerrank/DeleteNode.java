package hackerrank;
//http://bbs.lechenggu.com/java/5805013f70b970637d07d46a
	
static LinkedListNode removeNodes(LinkedListNode list, int x) {
    LinkedListNode dummy = new LinkedListNode(0);
    dummy.next = list;
    LinkedListNode cur = dummy;
    while (cur.next != null) {
        if (cur.next.val > x) {
            cur.next = cur.next.next;
        }
        else cur = cur.next;
    }
    return dummy.next;
} 



/*
Given array of size n and target integer k, with each substring window size k,
 find the smallest element. Among all these smallest elements, find the largest element.

 */

/*
 
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
  
  */

    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node currentNode = head;
    Node prevNode = null;
    if(head==null) {
        return head;
    }
    else if(position==0) {
        currentNode=currentNode.next;
        return currentNode;
    }
    else {
        int i=0;
        while(position>i) {
            i++;
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        prevNode.next=currentNode.next;
        return head;
    }

}

