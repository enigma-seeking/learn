class MyLinkedList {

    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
        }
    }

    private int size;
    private ListNode dummyHead, dummyTail, current;


    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode(0);
        dummyTail = new ListNode(0);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode prevNode = getPrevNode(index);
        return prevNode.next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode prevNode = getPrevNode(index);
        ListNode newNode = new ListNode(val);
        newNode.next = prevNode.next;
        prevNode.next.prev = newNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode prevNode = getPrevNode(index);
        prevNode.next = prevNode.next.next;
        prevNode.next.prev = prevNode;
        size--;
    }

    private ListNode getPrevNode(int index) {
        ListNode prevNode = dummyHead;
        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                prevNode = prevNode.next;
            }
        } else {
            prevNode = dummyTail;
            for (int i = 0; i <= size - index; i++) {
                prevNode = prevNode.prev;
            }
        }
        return prevNode;
    }

    public void print() {


        current = dummyHead.next;
        while(current != dummyTail) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public int get_length(ListNode head) {
        if (head == null) {
            return -1;
        }

        int length = 0;
        current = head;
        while(current != dummyTail) {
            length++;
            current = current.next;
        }

        return length;
    }

    public static void main(String[] args) {
        MyLinkedList L1 = new MyLinkedList();
        L1.addAtTail(7);
        L1.addAtHead(9);
        L1.addAtIndex(1,2);
        L1.addAtIndex(2,3);
        L1.addAtIndex(3,4);
        L1.addAtIndex(4,5);
        L1.addAtIndex(5,6);
        System.out.println(L1.get_length(L1.dummyHead.next));
        System.out.println(L1.size);
        L1.print();
    }
}