package cn.villagehead.Set;

/**
 * @author wxh
 * @date 2018-11-04 16:29
 */
public interface Set<E> {

	void add(E e);
	void remove(E e);
	boolean contains(E e);
	int getSize();
	boolean isEmpty();
}
