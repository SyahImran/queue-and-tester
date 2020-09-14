/*
Ismat Syah Imran
Mr. Tully
Period 4
 */

import java.util.ArrayList;

public class MyQueue<E> implements QueueInterface<E> {

    private ArrayList<E> queue = new ArrayList<>();

    @Override
    public boolean offer(E item) {
        return queue.add(item);
    }

    @Override
    public boolean add(E item) {
        return queue.add(item);
    }

    @Override
    public E peek() {
        return queue.get(0);
    }

    @Override
    public E element() {
        return queue.get(0);
    }

    @Override
    public E poll() {
        return queue.remove(0);
    }

    @Override
    public E remove() {
        return queue.remove(0);
    }

    @Override
    public boolean empty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public E get(int x) {
        return queue.get(x);
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
