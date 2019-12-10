package Lab06;


public class List<T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;

    public ListNode<T> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(ListNode<T> firstNode) {
        this.firstNode = firstNode;
    }

    public ListNode<T> getLastNode() {
        return lastNode;
    }

    public void setLastNode(ListNode<T> lastNode) {
        this.lastNode = lastNode;
    }

    public List() {
        this.firstNode = null;
        this.lastNode = null;
    }

    public List(ListNode<T> firstNode, ListNode<T> lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    public void insertAtFront(T item){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<T>(item);
        }
        else{
            firstNode = new ListNode<T>(item, firstNode);
        }
    }

    public void insertAtBack(T item){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<T>(item);
        }
        else{
            ListNode<T> newNode = new ListNode<T>(item);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }

    }

    public T removeFromFront(){
        if(isEmpty()){
            System.err.println("The list is Empty!");

        }
        T rItem = firstNode.getData();
        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else{
            firstNode = firstNode.getNext();
        }
        return rItem;
    }

    public T removeFromBack(){
        if(isEmpty()){
            System.err.println("The list is Empty!");
        }
        T rItem = firstNode.getData();
        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else{
            ListNode<T> tempNode = firstNode;
            while(tempNode.getNext() != lastNode){
                tempNode = tempNode.getNext();
            }

            lastNode = tempNode;
            lastNode.setNext(null);

        }
        return rItem;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("The list is Empty");
        }
        ListNode<T> temp = firstNode;

        while(temp != null){
            System.out.print(temp.toString());
            temp = temp.getNext();
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public List<T> concate(List<T> list1, List<T> list2){
        List<T> list = list1;
        while(!list2.isEmpty()){
            list.insertAtBack(list2.removeFromFront());
        }
        return list;
    }
}
