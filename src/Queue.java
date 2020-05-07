public class Queue extends TransferFromQueuetoStack implements QueueAndStack {
    private int n;
    private int[] queueValues;
    public static int pushedItem;

    public Queue() {
        n = 0;
        queueValues = new int[n];

    }
    @Override
    public void push(int pushedItem) {
        n++;
        int[] auxiliar = new int[n];
        auxiliar[n - 1] = pushedItem;
        for (int i = 0; i < n - 1; i++)
            auxiliar[i] = queueValues[i];
        queueValues = auxiliar;
        this.pushedItem = pushedItem;
       if(stop==0) {
           this.stop=1;
           transfer();
       }
       stop=0;
    }
    @Override
    public int pop() {
        if (n > 0) {
            int poppedItem = queueValues[0];
            n--;
            int[] auxiliar = new int[n];

            for (int i = 0; i < n ; i++)
                auxiliar[i] = queueValues[i + 1];

            queueValues = auxiliar;

            return poppedItem;

        } else System.out.println("You can not pop from an empty queue");

        return 0;
    }

    public void view() {
        for (int i = 0; i < n; i++)
            System.out.println("The element of queue at index " + i + " is " + queueValues[i]);
    }

}
