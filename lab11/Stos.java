public class Stos<T> {


    private Node<T> head;

    public Stos(){
        head = null;
    }

    void push(T value){
        if(head != null){
            Node<T> tmp = head;
            head = new Node<T>(value, tmp);

        }
        else
            head = new Node<T>(value, null);
    }

    void pop(){
        if(head != null){
            Node<T> newHead = head.next;
            head = newHead;
        }
    }

    public String toString(){
        String toRet = "";
        Node<T> tmp = head;
        while(tmp != null){
            toRet += "{" + tmp.value + "} ";
            tmp = tmp.next;
        }
        return toRet;
    }
}