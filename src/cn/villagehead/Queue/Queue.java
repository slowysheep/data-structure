package cn.villagehead.Queue;

/**
 * @author wxh
 * @date 2018-10-22 16:03
 */
public interface Queue<E> {
	int getSize();
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}
