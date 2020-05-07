public class Stack extends TransferFromStacktoStack implements QueueAndStack {
    private int n;
    private int[] stackValues;
    public static int pushedItem;


    public Stack() {

        n = 0;
        stackValues = new int[n];


    }

    @Override
    public void push(int pushedItem) {

        n++;
        int[] auxiliar = new int[n];
        auxiliar[0] = pushedItem;
        for (int i = 0; i < n - 1; i++)
            auxiliar[i + 1] = stackValues[i];
        stackValues = auxiliar;

        this.pushedItem = pushedItem;

    }
    @Override
    public int pop() {
        if (n > 0) {
            int poppedItem = stackValues[0];
            n--;
            int[] auxiliar = new int[n];
            for (int i = 0; i < n; i++) {
                auxiliar[i] = stackValues[i + 1];
            }
            stackValues = auxiliar;
            return poppedItem;
        } else System.out.println("You can not pop from an empty stack");

        return 0;
    }

    public void view() {
        for (int i = 0; i < n; i++)
            System.out.println("The element at index " + i + " is " + stackValues[i]);
    }
}
