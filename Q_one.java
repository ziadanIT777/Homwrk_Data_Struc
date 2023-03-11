public class Q_one {
    public void signatureTransfer(LinkedStack x ,LinkedStack y){
        while (!x.isEmpty())
            y.push(x.pop());
    }
}
