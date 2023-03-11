
public class CircularlyLinkedList<E> {



    private Node<E> tial =null;
    private int size =0;

    public CircularlyLinkedList () {
    }
    public boolean isEmpy(){
        return size==0;
    }
    public int Size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpy ())return null;
        return tial.next.element;
    }
    public E last()
    {
        if (isEmpy ())return null;
        return tial.element;
    }
    public void addFirst(E element)
    {
        if (isEmpy ())
        {
            tial=new Node<E> ( element,null );
            tial.next=tial;
        }
        else {
            Node<E> newest = new Node<E> ( element , tial.next );
            tial.next = newest;
        }
        size++;
    }
    public void addLast(E element){

        if (isEmpy ())
        {
            tial=new Node<E> ( element,null );
            tial.next=tial;
        }
        else {
            Node<E> newest = new Node<E> ( element , tial.next );
            tial.next= newest;
            tial=tial.next;
        }
        size++;
    }
    public E removeFirst()
    {
        if (isEmpy ())return null;
        Node<E> head = tial.next;
        if (head==tial)
            tial=null;
        else
            tial.next=head.next;
        size--;
        return head.element;
    }



    public void rotate(){

        if (tial != null)
         tial=tial.next;
    }


    public static class Node<E>{
        E element;
        Node<E> next;

        public
        Node ( E element , Node<E> next ) {
            this.element = element;
            this.next = next;
        }

        public
        E getElement () {
            return element;
        }

        public
        void setElement ( E element ) {
            this.element = element;
        }

        public
        Node<E> getNext () {
            return next;
        }

        public
        void setNext ( Node<E> next ) {
            this.next = next;
        }
    }




}
