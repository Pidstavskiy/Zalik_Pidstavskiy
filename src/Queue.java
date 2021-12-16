import java.util.ArrayList;

class Queue<T> {

    private int maxSize;
    private int nElem;
    private int front;
    private int rear;
    private ArrayList<T> list;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        list = new ArrayList<>();
        rear = -1;
        front = 0;
        nElem = 0;
    }

    private void delete(Integer elem) {
        list.remove(elem);
    }

    public void insert(Integer elem) {
        if (rear == (maxSize - 1)) {
            rear = -1;
        }
        list.add(++rear, (T) elem);
        nElem++;
    }

    public void insertList(ArrayList<Integer> group) {
        for (Integer integer : group) {
            insert(integer);
        }
        ;
        System.out.println("Початкова група: " + list);

        for (int i = 0; i < group.size(); i++) {
            if (group.get(i) % 2 != 0) {
                delete(group.get(i));
            }
        }
        System.out.println("Редагована група без непарних елементів: " + list);

    }

    public T remove() {
        if (front == maxSize) {
            front = 0;
        }
        T temp = list.get(front++);
        nElem--;
        return temp;
    }

    public T getFront() {
        return list.get(front);
    }

    public T getRear() {
        return list.get(rear);
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }

    public void getList() {
        System.out.println(list);
    }
}
