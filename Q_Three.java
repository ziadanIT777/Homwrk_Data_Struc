public class Q_Three {
    public boolean equals(DoublyLinkedList list) {
        if (this == list)
            return true;
        else if (this.size() == list.size()) {
            Noed<E> a = this.header.getNext();
            Noed<E> x = list.header.getNext();
            while (e != null) {
                if (a.get Element() != x.getElemnt())
                return false;
                a = a.getNext();
                x = x.getNext();
            }
            return true;
        }
        return false;

    }
}