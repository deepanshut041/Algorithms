/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    
}
class DoublyNode<T> implements Comparable<T> {

    private T value;
    private DoublyNode<T> nextRef;
    private DoublyNode<T> prevRef;

    

    public void setValue(T value) {
        this.value = value;
    }

    public void setNextRef(DoublyNode<T> ref) {
        this.nextRef = ref;
    }

    public void setPrevRef(DoublyNode<T> ref){
        this.prevRef = ref;
    }

    public T getValue() {
        return value;
    }

    public DoublyNode<T> getNextRef() {
        return nextRef;
    }

    public DoublyNode<T> getPrevRef() {
        return prevRef;
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