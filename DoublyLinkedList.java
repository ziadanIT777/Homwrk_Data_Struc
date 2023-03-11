public
class DoublyLinkedList <T> {

    private Node<T>header;
    private Node<T>trailer;
    private int size=0;


    public DoublyLinkedList()
    {
        header  = new Node<> ( null ,null,null);
        trailer = new Node<> ( null,header,null );
        header.setNext(trailer);
    }
    private static class Node <T>
    {
        T element;
        Node<T>prev;
        Node<T>next;



        public Node ( T element , Node<T> prev , Node<T> next ) {
            this.element = element;
            this.prev = prev;
            this.next = next;

        }
    }
}
