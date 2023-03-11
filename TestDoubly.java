
public class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<String> l= new DoublyLinkedList<>();
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        l.addFirst("A");
        l.addLast("B");
        l.addLast("C");
        l.addFirst("Z");
        System.out.println();
        System.out.println(l.isEmpty());
        while (!l.isEmpty())
        {
           System.out.print(l.removeFirst()+"\t");
        }


    }
}
