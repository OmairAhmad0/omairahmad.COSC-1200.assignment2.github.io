public class Three {
    public class Queue {
        private int maxSize = 9;
        private int[] queueArray;
        private int head, tail;

        // Constructors.
        Queue() {
            head = -1;
            tail = -1;
        }

        Queue(int maxSize) {
            head = -1;
            tail = -1;
            this.maxSize = maxSize;
        }

        // Return True if the Queue is full to its capacity
        Boolean isFull() {
            // If head is at index 0, and tail is at last index, the queue is full.
            if (head == 0 && tail == maxSize - 1) {
                return true;
            }
            return false;
        }

        // Return True if the Queue is empty
        Boolean isEmpty() {
            // If head is null, queue is empty.
            if (head == -1) {
                return true;
            }
            return false;
        }

        // Insert an element in the queue
        void enQueue(int element) {
            if (isFull()) {
                System.out.println("Unable to insert element: the queue is full.");
            } else {
                // If there are no elements in the queue, set the head to the first element.
                if (head == -1) {
                    head = 0;
                }
            }
            // Add the element to the tail.
            tail++;
            queueArray[tail] = element;
        }

        // Remove the head element from the Queue
        int deQueue() {
            if (isEmpty()) {
                System.out.println("Unable to remove element: the queue is empty.");
                return (-1);
            } else {
                // If the queue only has one elemnet, empty the queue.
                if (tail <= head) {
                    head = -1;
                    tail = -1;
                } else {
                    // The next element becomes the first element.
                    head++;
                }
            }
            // Returns the dequeued element.
            return (queueArray[head]);
        }

        // Display the elements of the Queue
        void display() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
            } else {
                System.out.println("Elements: ");
                for (int i = head; i <= tail; i++)
                    System.out.print(queueArray[i] + "  ");
            }
        }
    }
}
