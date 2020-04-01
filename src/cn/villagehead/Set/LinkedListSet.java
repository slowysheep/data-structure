package cn.villagehead.Set;

import cn.villagehead.LinkedList.LinkedList;

import java.awt.*;

/**
 * @author wxh
 * @date 2018-11-04 20:49
 */
public class LinkedListSet<E> implements Set<E> {

	private LinkedList<E> list;

	public LinkedListSet(){
		list = new LinkedList<E>();
	}

	@Override
	public int getSize(){
		return list.getSize();
	}

	@Override
	public boolean isEmpty(){
		return list.isEmpty();
	}

	@Override
	public boolean contains(E e){
		return list.contains(e);
	}

	@Override
	public void add(E e){

		if (!list.contains(e))
			list.addFirst(e);

	}

	@Override
	public void remove(E e){
		list.removeElement(e);
	}
}
