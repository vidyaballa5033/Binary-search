
import java.util.Arrays;

public class BinarySearch <T extends Comparable<T>>{
    Node<T> root;
    Node<T> currentPointer;
    //uc1
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(root == null) {
            root = newNode;
            return;
        }
        Node<T> currentPointer= root;
        while(currentPointer.NextRN != null && currentPointer.NextLN != null) {
            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.NextLN;
            } else {
                currentPointer = currentPointer.NextRN;
            }
        }
        if(data.compareTo(currentPointer.data) < 0)
            currentPointer.NextLN= newNode;
        else
            currentPointer.NextRN= newNode;
    }

    public void search(T data){


        while(currentPointer!=null) {
            int value= data.compareTo(currentPointer.data);
            switch (value){
                case -1:
                    currentPointer = currentPointer.NextLN;
                    break;
                case 1:
                    currentPointer = currentPointer.NextRN;
                    break;
                default:
                    System.out.println("Element Found!!!");
                    return;
            }
        }
        System.out.println("Element Not Found!!!");
    }

}
