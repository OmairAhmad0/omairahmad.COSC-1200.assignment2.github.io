public class Two {
    class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(Node head) {
            // The current Node.
            Node current = head;
            // The node two positions ahead of the current node.
            Node future = head.next;
            // While the current node doesn't equal the future node
            while (current != future) {
                // If the fast node which is two positions ahead of the 
                // current node meets the end of the linkedlist, there is no cycle.
                if (future == null || future.next == null) {
                    return false;
                }
                // Moves the nodes along the linked list.
                current = current.next;
                future = future.next.next;
            }
            // Otherwise, if the current node does equal the future node,
            // when the loop stops, there is a cycle since the future node
            // has the same pointer address as the current node.
            return true;
        }
    }
}
