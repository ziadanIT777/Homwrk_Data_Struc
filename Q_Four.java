
public class Q_Four {
    //Josephus
    public static <E> E Q_Four(CircularQueue<E> queue,int k){
        if(queue.isEmpty()) return null;
        while (queue.size() >1){
            for (int i = 0; i < k; i++)
                queue.rotate();
                System.out.println(" "+e +"is out");
                System.out.println(queue.size);

        }
            return queue.dequeue();
    }
    public static <E> CircularQueue<E> buildQueue(E a[]){
        CircularQueue<E> queue = new CircularQueue<>();
        for (int i = 0; i < a.length; i++)
            queue.enqueue(a[i]);
        return queue;
    }

    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","6","7"};
        System.out.println("First winner is "+Q_Four(buildQueue(arr),1));
    }
}
