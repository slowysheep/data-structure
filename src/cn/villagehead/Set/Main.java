package cn.villagehead.Set;

import java.util.ArrayList;

/**
 * @author wxh
 * @date 2018-11-04 16:38
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Pride and Prejudice");

		ArrayList<String> words1 = new ArrayList<String>();
		FileOperation.readFile("D:\\personage\\java\\project\\data-structure\\src\\cn\\villagehead\\Set\\pride-and-prejudice.txt" , words1);
		System.out.println("Total words: " + words1.size());

		BSTSet<String> set1 = new BSTSet<String>();
		for (String word: words1){
			set1.add(word);
		}
		System.out.println("Total diffent words: " + set1.getSize());

		System.out.println("a-tale-of-two-cities");

		ArrayList<String> words2 = new ArrayList<String>();
		FileOperation.readFile("D:\\personage\\java\\project\\data-structure\\src\\cn\\villagehead\\Set\\a-tale-of-two-cities.txt" , words2);
		System.out.println("Total words: " + words2.size());

		BSTSet<String> set2 = new BSTSet<String>();
		for (String word: words2){
			set2.add(word);
		}
		System.out.println("Total diffent words: " + set2.getSize());



	}
}
