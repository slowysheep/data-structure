package cn.villagehead.Array;

/**
 * @author wxh
 * @date 2018-10-19 16:21
 */
public class Student {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString(){
		return String.format("Student(name: %s,score: %d)",name,score);
	}

	public static void main(String[] args) {
		Array<Student> arr = new Array<Student>();
		arr.addLast(new Student("Alice",100 ));
		arr.addLast(new Student("Bob",66 ));
		arr.addLast(new Student("Charlie",88 ));
		System.out.println(arr);
	}
}
