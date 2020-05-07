public class TransferFromQueuetoStack extends TransferFromStacktoStack {

    public static int stop;

    public void transfer() {
        QueueAndStack D = new Stack();
        D.push(Queue.pushedItem);
        System.out.println("The item " + Queue.pushedItem + " has been sent to D stack.");
        D.view();
        super.transfer();

    }
}
