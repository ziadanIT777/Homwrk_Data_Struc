import org.w3c.dom.Node;

public class QSeven {
    public void clon(DoublyLinkedList x){
        if (!isEmpty() && !x.isEmpty()){
            while (!isEmpty()){
                removeFirst();
            }
            Node<E> m=x.heasder.getNext();
            while (m !=x.trailer){
                addLast(m.getElement());
                m=m.getNext();
            }
        }
    }
}
