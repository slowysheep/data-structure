package cn.villagehead.BST;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wxh
 * @date 2018-10-30 16:46
 */
public class Main {
	public static void main(String[] args) {

		BST<Integer> bst = new BST<Integer>();
		Random random = new Random();

		int n = 1000;

		for (int i = 0;i<n;i++){
			 bst.add(random.nextInt(10000));
		}

		System.out.println(bst);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (!bst.isEmpty())
			nums.add(bst.removeMin());


		System.out.println(nums);

		for (int i = 1;  i < nums.size(); i++)
			if (nums.get(i - 1) > nums.get(i))
				throw new IllegalArgumentException("Error");

			System.out.println("removeMin test completed");

		for (int i = 0; i < n; i ++)
			bst.add(random.nextInt(10000));

		nums = new ArrayList<Integer>();
		while (!bst.isEmpty())
			nums.add(bst.removeMax());

		System.out.println(nums);

		for (int i = 1 ; i < nums.size() ; i ++)
			if (nums.get(i - 1) < nums.get(i))
				throw new IllegalArgumentException("Error");
		System.out.println("RemoveMax test completed");


	}
}
