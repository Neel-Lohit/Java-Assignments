public class Node <T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data=data;
        this.next=null;
    }
    Node(T data, Node<T> nextPointer) {
        this.data = data;
        this.next = nextPointer;
    }
    public T Data(){
        return data;
    }
}
