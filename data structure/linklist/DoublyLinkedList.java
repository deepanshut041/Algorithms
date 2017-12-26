/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    
}
class DoublyNode<T> implements Comparable<T> {

    private T value;
    private DoublyNode<T> nextRef;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoublyNode<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(DoublyNode<T> ref) {
        this.nextRef = ref;
    }

    @Override
    public int compareTo(T arg) {
        if (arg == this.value) {
            return 0;
        } else {
            return 1;
        }
    }
}