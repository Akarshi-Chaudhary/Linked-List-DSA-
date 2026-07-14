package del;

public class LL_Basic {
    
    public class ListNode{
        int val;
        ListNode next;
        
        ListNode(){}
        ListNode(int value){
            this.val= value;
        }
        ListNode(int value, ListNode next){
            this.val = value;
            this.next = next;
        }
    }
        
//    public void Print(ListNode head){
//        // trversal
//        ListNode dummy = head;
//        while(dummy != null){
//            System.out.print(dummy.val + "->");
//            dummy = dummy.next;
//        }
//        System.out.print("null ");
//    }
    
    public ListNode delete(ListNode head){
        if(head == null) return null;
        if(head.val == 20) return head.next;  // head itslf deleted
        
        ListNode temp = head;
        
        while(temp.next != null){
            
            if(temp.next.val == 20){
                temp.next = temp.next.next;
                break;
            }
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    
        return head;
    }
    
    public static void main(String[] args){
        LL_Basic obj = new LL_Basic();
        ListNode head = obj.new ListNode(10);
        head.next = obj.new ListNode(20);
        head.next.next = obj.new ListNode(50);
        head.next.next.next = obj.new ListNode(30);
        
        //call methods
        //obj.Print(head);
        
        head = obj.delete(head); //If your method may change the head,
        obj.delete(head); //If your method only modifies nodes after the head and never changes the first node, you could write:
        
    }
}
