class LinkedListt { 
    Node head; 

    
    class Node { 
        int data; 
        Node next; 
        Node(final int d) {
            data = d;
            next = null;
        }
    }

    void printNthFromLast(final int n) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;

        temp = head;

        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    public void push(final int new_data) {
        final Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }

    public static void main(final String[] args) {
        final LinkedListt llist = new LinkedListt();
        llist.push(10); 
        llist.push(8); 
        llist.push(33); 
        llist.push(7); 

        llist.printNthFromLast(2); 
    } 
} 

