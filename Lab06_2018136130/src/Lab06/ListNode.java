package Lab06;

public class ListNode<T> {
    // data members
    private T data;
    private ListNode<T> nextNode;


    // function members
    ListNode(T d, ListNode<T> n){ data = d; nextNode = n;}
    ListNode(T d){this(d, null);}
    ListNode(){this(null, null);}

    public void setData(T d){data = d;}
    public void setNext(ListNode<T> n){nextNode = n;}
    public T getData(){ return data;}
    public ListNode<T> getNext(){return nextNode;}

    @Override
    public String toString() {
        return "{" + data + '}';
    }
}
