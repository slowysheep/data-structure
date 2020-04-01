package cn.villagehead.Set;

import cn.villagehead.BST.BST;

/**
 * @author wxh
 * @date 2018-11-04 16:31
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

	private BST<E> bst;

	public BSTSet(){
		bst = new BST<E>();
	}

	@Override
	public int getSize(){
		return bst.size();
	}

	@Override
	public boolean isEmpty(){
		return bst.isEmpty();
	}

	@Override
	public void add(E e){
		bst.add(e);
	}

	@Override
	public boolean contains(E e){
		return bst.contains(e);
	}

	@Override
	public void remove(E e){
		bst.remove(e);
	}
}
