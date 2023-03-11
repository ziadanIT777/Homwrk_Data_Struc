
public class Q_Five {
    public void oneSentin(){
        trailer.setNext(header.getNext());
        header.getNext().setprev(trailer);
        header.setNext(null);
    }
}
