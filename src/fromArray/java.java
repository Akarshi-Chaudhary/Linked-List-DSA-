package fromArray;
public class java {
    
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = next;
        }
    }
    
    public void printList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public ListNode createList(int[] arr){
        if(arr.length == 0) return null;
        
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        
        for(int i = 1; i < arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    
    public static void main(String[] args) {

        java obj = new java();

        int[] arr = {10, 20, 30, 40, 50};

        ListNode head = obj.createList(arr);

        obj.printList(head);
    }
}
