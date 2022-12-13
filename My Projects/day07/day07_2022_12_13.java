package day07;

public class day07_2022_12_13 
{
	public static void main(String[] args) 
	{
		Method1 mthd = new Method1();
		//innerMthd();
		//mthd1.outerMthd();
		//mthd1.name();
		//mthd.THIS();
		//mthd.space();
		//int sum = mthd.add();
		//System.out.println("Sum of a+b+c: "+sum);
		//String lunch = mthd.lunch();
		//mthd.printStr(lunch);
		//mthd.space();
		//mthd.printInt(mthd.num);
		//mthd.space();
		//mthd.space();
		//mthd.printStr("특정 메소드한테 이름을 넘겨받아서 5번 출력\n\n");
		//for(int i=0;i<5;i++)
			//mthd.printStr(mthd.name+"\n");
		//mthd.space();
		//mthd.plainMethod();
		//mthd.space();
		//mthd.printChar(mthd.Char); // only get char type of values.
		//mthd.space();
		//mthd.printDouble(mthd.dnum); // only get double type of values.
		//mthd.space();
		//mthd.space();
		//  1. 인수가 없고 리턴값 없음
		//mthd.test1();
		//  2. 인수가 있고 리턴값 없음
		//String test2Text = "2. No return value, Yes Parameter";
		//mthd.test2(test2Text);
		//  3. 인수가 없고 리턴값 있음
		//String test3 = mthd.test3();
		//mthd.printStr(test3);
		// 4. 인수가 있고 리턴값도 있음
		//mthd.printStr(mthd.test4(null));
		//--------------------------------------
		Score scr = new Score();
		scr.scoreCalc();
		scr.scorePrint();
	}
	public static void innerMthd()
	{
		System.out.println("Class1\n{\npublic static void main(String args[])\n{\n\n}\n\t"
				+ "I am inner method of the class.\n}");
	}
}
class Score
{
	ScoreVars scv = new ScoreVars();
	void scoreCalc()
	{
		scv.total = (double)(scv.kor+scv.eng+scv.math+scv.french+scv.history);
		scv.average = (double)(scv.total / scv.subCount);
		if(scv.average >= 90)
			scv.grd = 'A';
		else if(scv.average >= 80 && scv.average < 90)
			scv.grd = 'B';
		else if(scv.average >= 70 && scv.average < 80)
			scv.grd = 'C';
		else if(scv.average >= 60 && scv.average < 70)
			scv.grd = 'D';
		else
			scv.grd = 'F';
	}
	void scorePrint()
	{
		System.out.println("----------------------");
		System.out.println("Name: "+scv.name);
		System.out.println("----------------------");
		System.out.println("Korean: "+scv.kor);
		System.out.println("English: "+scv.eng);
		System.out.println("Math: "+scv.math);
		System.out.println("History: "+scv.history);
		System.out.println("----------------------");
		System.out.printf("Total Score: %.0f\n",scv.total);
		System.out.printf("Average Score: %.1f\n", scv.average);
		System.out.println("Grade: "+scv.grd);
		System.out.println("----------------------");
	}
}
class ScoreVars
{
	String name;
	char grd;
	int kor;
	int eng;
	int math;
	int french;
	int history;
	int subCount;
	double total, average;
	ScoreVars()
	{
		name="Jordan";
		kor=85;
		eng=100;
		math=65;
		french=78;
		history=98;
		subCount=5;
		total=0.0;
		average=0.0;
	}
}
class Method1
{
	String var;
	String name;
	String sentence;
	int num;
	int a,b,c;
	double dnum = 4.88;
	char Char = 'A';
	Method1()
	{
		var = "this.Variable: I am field variable and must be initialized in the constructor!";
		a=10;
		b=11;
		c=12;
		name = "Jordan";
		num = 3000;
	}
	void space()
	{
		System.out.println();
	}
	void outerMthd()
	{
		System.out.println("Class2\n{\n\tI am outer method of the class.\n}");
	}
	void name()
	{
		String Name = "Jordan";
		System.out.println(Name);
	}
	void THIS()
	{
		String var = "Variable: I am variable in the method! You should use 'this' "
				+ "method to call other me in the field!";
		System.out.println(this.var); // Calling field variable.
		System.out.println(var);
	}
	void printStr(String str) // Parameter; Getting String type of value and returning it.
	{
		System.out.println(str);
	}
	void printInt(int num) // Parameter; Getting Integer type of value and returning it.
	{
		System.out.print(num);
	}
	void printDouble(double dnum)
	{
		System.out.print(dnum);
	}
	void printChar(char Char)
	{
		System.out.print(Char);
	}
	int add() // Returning sum of a+b+c
	{
		int result=this.a+this.b+this.c;
		return result; // Returned result will be the value of add() method.
	}
	String lunch()
	{
		String foods = "Spam, Noodle, Rice, Bread, Soup";
		return foods;
	}
	void plainMethod()
	{
		printStr("I am just a method.");
	}
	void test1()
	{
		System.out.println("1. No return value, no parameter.");
	}
	void test2(String param)
	{
		System.out.println(param);
	}
	String test3()
	{
		String text = "3. Yes return value, No parameter.";
		return text;
	}
	String test4(String param2)
	{
		param2 = "4. Yes return value, yes parameter";
		return param2;
	}
}
