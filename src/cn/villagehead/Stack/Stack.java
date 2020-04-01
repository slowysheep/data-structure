package cn.villagehead.Stack;

/**
 * @author wxh
 * @date 2018-10-21 10:05
 */
public interface Stack<E> {
	int getSize();
	boolean isEmpty();
	void push(E e);
	E pop();
	E peek();
}
