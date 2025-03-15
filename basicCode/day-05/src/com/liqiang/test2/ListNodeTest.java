package com.liqiang.test2;

public class ListNodeTest {
    public static void main(String[] args) {
        ListNode p = new ListNode();
        p.val = 1;
        p.next = new ListNode();
        p.next.val = 2;

        ListNode q = p;
        while(q != null){
            System.out.println(q.val);
            q = q.next;
        }
    }
}
