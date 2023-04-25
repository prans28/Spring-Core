package Demo1;

public class A {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public A(int age) {
		super();
		this.age = age;
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [age=" + age + "]";
	}

}
