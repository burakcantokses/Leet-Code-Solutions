public class Main {
    public static void main(String[] args) {
        // İlk bağlı liste: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // İkinci bağlı liste: 1 -> 3 -> 5
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(5)));

        ListNode mergedList = mergeTwoLists(l1, l2);

        // Birleştirilmiş bağlı listenin elemanlarını yazdır
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}