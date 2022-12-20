package day12;

public abstract class AbstractClass // Only can be used in extended child class 
{
	String name;
	int age;
	// 일반 메소드
	/*
	public void out() 
	{
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	*/
	// 추상 메소드
	public abstract void out(); // Only can be defined in abstract classes.
}
