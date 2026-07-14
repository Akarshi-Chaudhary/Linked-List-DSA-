package basic;

public class LinkedListBasics {
    
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}                      // Constructor 1

        ListNode(int val) {                // Constructor 2
            this.val = val;
        }

        ListNode(int val, ListNode next) { // Constructor 3
            this.val = val;
            this.next = next;
        }
    }
    
    public static void main(String[] args) {
        
        //creation
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        
        System.out.println(head.val);
        
         //traversal
        ListNode temp = head;
        while(temp != null){
         System.out.print(temp.val + " -> ");
         temp = temp.next;
        }
     System.out.print("null ");
    }
    
}

/*ListNode is a non-static inner class, you first need an object of the outer class.
 like in main class have to write  --> 
         LinkedListDsa obj = new LinkedListDsa();
         ListNode head = obj.new ListNode(10);
         head.next = obj.new ListNode(20);
         head.next.next = obj.new ListNode(30);
*/
 
