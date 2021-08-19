public class SListIterator <T> {
    Node<T> currentNode;

    SListIterator(Node<T> Node) {
        currentNode = Node;
    }

    public boolean hasNext() {
        return currentNode.next != null;
    }

    public Node<T> next() {
        currentNode = currentNode.next;
        return currentNode;
    }

    public void add(T data) {
        currentNode.next = new Node<T>(data, currentNode.next);
        currentNode = currentNode.next;
    }

    public void remove(T data) {
        Node temp;
        while (currentNode.next != null) {
            temp = currentNode;
            currentNode = currentNode.next;
            if (currentNode.data == data) {
                temp.next = currentNode.next;
                break;
            }
        }
    }

    public void pop() {
        Node temp;
        while (currentNode.next.next != null) {
            currentNode=currentNode.next;
        }
        currentNode.next = null;


    }
}