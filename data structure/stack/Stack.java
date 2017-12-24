import javafx.scene.chart.StackedBarChart;

/**
 * Stack
 */
public class Stack implements StackInterface{
    
    public static final int CAPACITY = 1024; // Default Capaity of stack

    private int N; // Maximum capacity of stack
    private Object S[]; // S holds the element of stack
    private int t = -1; //the top element of stack


    // Initialize the stack with default capacity
    public Stack(){
        this(CAPACITY);
    }

    // Initialize the stack with given capacity
    public Stack(int cap){
        N = cap;
        S = new Object[N];
    }

    // Returns current stack size
    public int size(){
        return(t + 1);
    }

    // Return empty if stack is empty
    public boolean isEmpty() {
        return (t<0);
    }

    // Push new Element of Stack
    public void push(Object obj) throws StackFullException{
        if(size() == N)
            throw new StackFullException("Stack overflow.");
        S[++t] = obj;    
    }

    //Return Top Stack Element
    public Object top() throws StackEmptyException{
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty");
        return (S[t]);
    }

    //Pop off the top stack element
    public Object pop() throws StackEmptyException{
        Object elem;
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty");
        elem = S[t];
        S[t--] = null; 
        return (elem);
    }

}