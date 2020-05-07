public class TransferFromStacktoQueue {


    public void transfer() {

        QueueAndStack B = new Queue();
        B.push(Stack.pushedItem);
        System.out.println("The item " + Stack.pushedItem + " has been sent to B queue.");
        B.view();


    }
}
