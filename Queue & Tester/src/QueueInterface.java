/*
Ismat Syah Imran
Mr. Tully Period 4
 */

public interface QueueInterface<E> {

    public String toString();
    public boolean offer(E item);
    public boolean add(E item);
    public E peek();
    public E element();
    public E poll();
    public E remove();
    public boolean empty();
    public int size();
    public E get(int x);
}
