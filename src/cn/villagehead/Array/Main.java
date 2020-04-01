package cn.villagehead.Array;

/**
 * @author wxh
 * @date 2018-10-08 16:13
 */
public class Main {
	public static void main(String[] args) {

		Array<Integer> arr = new Array<Integer>();
		for (int i = 0; i < 10; i++){
			arr.addLast(i);
		}

		arr.add(1,100 );
		System.out.println(arr);

		arr.addFirst(-1);
		System.out.println(arr);

		arr.remove(2);
		System.out.println(arr);

		arr.removeElement(-1);
		System.out.println(arr);

		arr.removeFirst();
		System.out.println(arr);

		arr.removeLast();
		System.out.println(arr);


	}
}
