public class Test {
    public static void main ( String[] args ) {

        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        System.out.println (list.isEmpy ());
        System.out.println (list.Size ());
        list.addFirst ( "A" );
         list.addLast ( "C" );
        list.addFirst ( "E" );
        list.addLast ( "g" );
        for (int i = 0; i <list.Size () ; i++) {
            System.out.print (list.first ()+"\t");
            list.rotate ();
        }
        System.out.println ();
        System.out.println(list.Size ());

    }
}
