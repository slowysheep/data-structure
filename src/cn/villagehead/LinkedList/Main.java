package cn.villagehead.LinkedList;

/**
 * @author wxh
 * @date 2018-10-24 11:19
 */
public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < 5; i ++){
			linkedList.addFirst(i);
			System.out.println(linkedList);
		}

		linkedList.add(2, 666);
		System.out.println(linkedList);

		linkedList.remove(2);
		System.out.println(linkedList);

		linkedList.removeFirst();
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println(linkedList);
	}
}
