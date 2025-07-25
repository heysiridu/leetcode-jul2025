import static java.lang.reflect.Array.getLength;

// 定义测试结构
public class LinkedListMain {
    public static void main(String[] args) {
        // create a Linked List with 1 > 2 > 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("1. 初始链表:");
        LinkedListOps.printList(head);

        System.out.println("\n2. 遍历 - 长度: " + LinkedListOps.getLength(head));

        System.out.println("\n3. 查找值为3的节点:");
        ListNode found = LinkedListOps.findValue(head, 3);
        if (found != null) {
            System.out.println("找到了! 值为: " + found.val);
        }

        System.out.println("\n4. 在值为2的节点后插入值5:");
        ListNode nodeTwo = LinkedListOps.findValue(head, 2);
        LinkedListOps.insertAfter(nodeTwo, 5);
        LinkedListOps.printList(head);

        System.out.println("\n5. 在头部插入值0:");
        head = LinkedListOps.insertAtHead(head, 0);
        LinkedListOps.printList(head);

        System.out.println("\n6. 删除值为3的节点:");
        head = LinkedListOps.deleteValue(head, 3);
        LinkedListOps.printList(head);

        System.out.println("\n7. 反转链表:");
        head = LinkedListOps.reverseList(head);
        LinkedListOps.printList(head);

        System.out.println("\n=== 测试完成 ===");


    }
}
