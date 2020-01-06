package linkedlist;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //判断是否有环并返回相遇的节点
    public static ListNode hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return fast;
            }
        }
        return null;
    }

    //找入口节点
    public static ListNode entryOfLoop(ListNode head) {
        ListNode meetNode = hasCycle(head);
        if (meetNode == null) {
            return null;
        }
        //计算环中节点数
        int n = 1;
        ListNode p = meetNode;
        while (p.next != meetNode) {
            ++n;
            p = p.next;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        //p1先走n步
        while (n-- != 0) {
            p1 = p1.next;
        }
        //p2, p1再一起走，直到相遇，相遇点即为环的入口节点
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;//返回入口节点
    }

    public static void main(String[] args) {
        ListNode entryNode = null;
        ListNode head = null, tail = null;
        for (int i = 0; i < 6; i++) {
            ListNode newNode = new ListNode(i+1);
            if (i == 0) {
                head = newNode;
                tail = newNode;
            } else {
                if (i == 2) entryNode = newNode;
                tail.next = newNode;
                tail = newNode;
            }
        }
        tail.next = entryNode;//尾节点与入口节点相连形成环
        System.out.println(entryOfLoop(head).val);//打印第三个节点的值
    }
}
