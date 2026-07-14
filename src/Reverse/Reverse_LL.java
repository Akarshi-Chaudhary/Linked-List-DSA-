package Reverse;

public class Reverse_LL {
    
    public static class ListNode{
        int val;
        ListNode next;
        
        ListNode(int value){
            this.val = value;
            this.next = null;
        }
    }
    public static ListNode reverse(ListNode head){
//        ListNode temp = head;
//        ListNode prev = null;
//        ListNode front = null;
//        
//        if(temp == null) return temp;
//        while(temp != null){
//            front = temp.next;
//            temp.next = prev;
//            prev = temp;
//            temp = front;
//        }
//        return prev; //iteration

//recursn
  if(head == null || head.next == null){
        return head;
    }//base case

    //revrse remain links
    ListNode newhead = reverse(head.next);

    //revrse curr link
    head.next.next = head;
    head.next = null;

    return newhead;
    }
    
//    public static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(50);
        
//        System.out.println("Original List:");
//        printList(head);
//        
//       head = reverse(head);
//
//        System.out.println("Reversed List:");
//        printList(head);
//      

        head = reverse(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
  
}
