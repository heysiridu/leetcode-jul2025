

// 定义算法逻辑
public class LinkedListOps {

    // printList and transverse, input is head
    public static void printList(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next; // move the pointer to the next node
        }
    }

    // find a certain node, input head and int target
    public static ListNode findValue(ListNode head, int target) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == target) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    // insert after a certain node, input is a node and int val
    // first add new connection, then break the existing one
    public static void insertAfter(ListNode node, int target) {
        ListNode newNode = new ListNode(target);

        newNode.next = node.next;
        node.next = newNode;
    }

    // insert at the head, input is head and val, return newHead
    public static ListNode insertAtHead(ListNode head, int target) {
        ListNode newH = new ListNode(target);
        if (head == null || head.next == null) {
            return newH;
        }

        newH.next = head;
        return newH;
    }

    // delete node with certain value, input is a head and int val
    public static ListNode deleteValue(ListNode head, int target) {
        if (head != null && head.val == target) {
            head = head.next;
        }

        ListNode cur = head;
        while (cur != null && cur.next !=null) {
            if (cur.next.val == target) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    // get the length, input is head
    public static int getLength(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    // reverse LinkedList, input is head
    public static ListNode reverseList (ListNode head) {
        ListNode prev = new ListNode();
        ListNode cur = head;

        while (cur.next != null) {
            ListNode temp = cur;
            cur.next = prev;
            prev = cur;
            cur = temp.next;
        }
        return prev;
    }
}
