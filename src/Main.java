import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(53);
        list.add(12);
        list.add(31);
        list.add(8);

        list.read();

        list.eliminate(53);

        list.read();


    }
}