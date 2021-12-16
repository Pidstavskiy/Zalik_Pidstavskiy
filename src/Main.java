import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>(6);
        myQueue.getSize();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(50);
        list1.add(65);
        list1.add(20);
        list1.add(41);
        list1.add(40);
        myQueue.insertList(list1);


    }
}
