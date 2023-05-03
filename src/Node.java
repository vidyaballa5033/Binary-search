
public class Node<T extends Comparable<T>> {
    T data;
    Node<T> NextRN;
    Node<T> NextLN;

    public Node(T data) {
        this.data = data;
    }
}