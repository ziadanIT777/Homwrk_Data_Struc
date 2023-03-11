public class Array_Stack <E> implements stack<E>{

    public static final int CAPACITY=1000;
    private E[] data;
    private int t = -1;
    public Array_Stack(){this(CAPACITY);}
    public Array_Stack(int capacity){
        data = (E[]) new  Object[capacity];
    }

    @Override
    public boolean isEmpty() {return (t==-1);}

    @Override
    public int size() {return (t+1);}

    @Override
    public E Top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E el)  throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is fill");
        data[++t] = el;
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E answer = data[t];
        t--;
        return answer;
    }

    public void signatureTransfer(Array_Stack x, Array_Stack y){
        while (!x.isEmpty())
            y.push(x.pop());
    }

    public void removeAll(){
        while (!isEmpty())
            pop();
    }

    public void clone(Array_Stack Array){
        Array_Stack array=new Array_Stack();
        while (!Array.isEmpty())
            array.push(Array.pop());
        while (!array.isEmpty())
            push((E)array.pop());
    }

}
