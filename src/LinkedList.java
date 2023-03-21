public class LinkedList {
    // Attributes
    Nodo head;

    // Constructors
    LinkedList(){
        head = null;
    }

    // Methods

    // this method is to add a value at the end of the list
    public void add(int value){

        Nodo newNodo = new Nodo(value);

        if(head == null){
            head = newNodo;
        }else{
            Nodo actual = head;
            while(actual.next != null){actual = actual.next;}
            actual.next = newNodo;
        }
    }

    // Eliminate a node of the list

    public void eliminate(int value){
        if(head == null) return;

        if (head.value == value){
            head = head.next;
        }

        Nodo actual = head;
        while (actual.next != null){
            if(actual.next.value == value){
                actual.next = actual.next.next;
                return;
            }
            actual = actual.next;

        }
    }

    // Read all the values in the list

    public void read(){
        Nodo actual = head;
        while(actual != null){
            System.out.println(actual.value);
            actual = actual.next;
        }
    }

}
