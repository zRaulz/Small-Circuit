public class TransferFromStacktoStack extends TransferFromStacktoQueue {


    public void transfer() {

        QueueAndStack C = new Stack();
        C.push(Stack.pushedItem);
        System.out.println("The item " + Stack.pushedItem + " has been sent to C stack.");
        C.view();


        super.transfer();
    }
}
