
public class Q_Tow {
public int size(){
    if (tial ==null)
        return 0;
    if (tial.getNext() == tial);
    return 1;
    CircularlyLinkedList.Node<Integer> cont = tial.getNext();
    int i= 1;
    while (cont != tial)
    {
        cont =cont.next;

        i++;
    }
    return i ;
 }

}
