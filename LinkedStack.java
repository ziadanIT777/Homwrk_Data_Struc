
public class LinkedStack<E>  implements stack<E>{
    private SinglyLinkedList<E>  list = new SinglyLinkedList<>();

    public LinkedStack() {}

    @Override
    public boolean isEmpty() {return list.isEmpty();}
    @Override
    public int size() {return list.size();}
    @Override
    public E Top() {return list.first();}
    @Override
    public void push(E el) {list.addFirst(el);}
    @Override
    public E pop() {return list.removeFirst();}
    public void signatureTransfer(LinkedStack x , LinkedStack y){
        while (!isEmpty())
            y.push(x.pop());
    }
    public void removeAll(){
        while (!isEmpty())
            pop();
    }
}
