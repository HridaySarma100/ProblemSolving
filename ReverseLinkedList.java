public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        insertElm(ll,2);
        ll = reverseList(ll);
        while (ll != null){
            System.out.println(ll.val);
            ll = ll.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;

        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private static void insertElm(ListNode ll,int count) {
        if (count == 6)return;
        ll.next = new ListNode(count);
        count++;
        insertElm(ll.next,count);
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}

