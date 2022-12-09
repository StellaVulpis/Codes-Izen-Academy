package day05;
import java.util.Scanner;
public class day05_2022_12_09 
{
	public static void main(String args[])
	{
		Test te = new Test();
	    //te.pyramidPractice();
		//te.score();
		//te.scoreWhile();
		//te.forWhile();
		//te.addNums();
		//te.onlyEven();
		//te.evenCount();
		//te.countSum();
		//te.Sum01();
		//te.comparingNumbers();
		//te.twoNums();
	}
}
class Test
{
	Scanner sc = new Scanner(System.in);
	Test()
	{
		
	}
	void pyramidPractice()
	{
		// i = 3, a = 11, b = (i*2)-1
		// Max loop range will be shorter every time it is excuted(A/B).
		for(int i = 1; i<=10;i++) // size
		{
			if(i>=5) // Start of triangle | 1 3 5 7 9
			{
				for(int a=1; a<=22-(i*2); a++) // margin-left, spaces | big num >> small num
					System.out.print(" ");
				for(int b=1;b<=(i*2)-1;b++) // Pyramid | small num >> big num
					System.out.print(" *");
			}
			else// Start of reverse triangle right after the triangle | 9 7 5 3 1
			{ // *의 시작포인트에서 9개로 시작을 해야함.
				for(int e=1;e<=(i*2);e++) // margin-left, spaces | small num >> big num
					System.out.print(" "); 
				for(int f=1;f<=22-(i*2)-1;f++) // Pyramid | big num >> small num
					System.out.print(" *");
			}
		System.out.println();
		}
	}	
    void score()
	{
		// 학점을 입력해서 A->
		String msgA = "You did perfect!!";
		String msgB = "You did very good. :)";
		String msgGrdMismatchException = "Grade you entered was incorrect, try again.";
		char grd;
		for(int i = 0; i<5;i++)
		{
		System.out.print("학점을 입력하세요: ");
		grd = sc.next().charAt(0);
		if(grd == 'A' || grd == 'a')
			System.out.println(msgA);
		else if(grd == 'B' || grd == 'b')
			System.out.println(msgB);
		else
			System.out.println(msgGrdMismatchException);
		}
	}
    void scoreWhile()
	{
		String msgA = "You did perfect!!";
		String msgB = "You did very good. :)";
		String msgGrdMismatchException = "Grade you entered was incorrect, try again.";
		String grd;
		int count = 0;
		while(true)
		{
			if(count > 0)
			{
				System.out.println("-------------------------------------\n");
				System.out.printf("Do you want to exit?\n");
				System.out.println("Type [Y / N] or 'exit' to exit.");
				System.out.println("\n-------------------------------------");
			}
			System.out.print("Enter your grade: ");
			grd = sc.nextLine();		
				if(grd.equals("exit")||grd.equals("EXIT")||grd.equals("Exit")||
						grd.equals("y")||grd.equals("Y"))
				{
					System.out.println("Program was terminated, Goodbye!");
					sc.close(); // If it is infinite loop, you should only close Scanner 
								//	under specific condition of program termination in loop.
					return;
				}
				else
				{
					if(grd.equals("A") || grd.equals("a"))
						System.out.println(msgA);
					else if(grd.equals("B") || grd.equals("b"))
						System.out.println(msgB);
					else
							System.out.println(msgGrdMismatchException);
				}
		++count;
		}
	}
    void forWhile()
    {
    	int l=0, L = 0, Ll = 0;
    	System.out.print("For loop: ");
    	for(int i=0;i<5;i++)
    		System.out.printf("%d ",i+1);
    	System.out.println();
    	System.out.print("While loop: ");
    	while(l<5)
    	{
    		System.out.printf("%d ", l+1);
    		l++;
    	}
    	System.out.println();
    	System.out.print("For infinite loop: ");
    	// For Infinite Loop
    	for(;;)
    	{
    	if(L==5)
    		break;
    	System.out.printf("%d ",L+1);
    	L++;
    	}
    	System.out.println();
    	// While Infinite Loop
    	System.out.print("While infinite loop: ");
    	while(true)
    	{
    		if(Ll==5)
    		return;
    		System.out.printf("%d ",Ll+1);
    		Ll++;
    	}
    }
    void addNums()
    {	
    	int sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		sum+=i;
    		if(i<10)
    			System.out.print(i+" + ");
    		else
    			System.out.print(i+" = "+sum);
    	}
    }
    void onlyEven()
    {
    	int odd[] = new int[16];
    	System.out.print("1~16 짝수만 출력: ");
    	
    	for(int i=1;i<=16;i++)
    	{
    		if(i%2==0)
    			System.out.print((i)+" ");
    		else if(i%2==1)
    			odd[i] += i;
    	}
    	System.out.println();
    	System.out.print("홀수(배열): ");
    	for(int t = 1;t<=16;t++)
    	{
    		if(t%2==1)
    			System.out.print(odd[t]+" ");
    	}
    	System.out.println();
    }
    void evenCount()
    {
    	// 1~16까지에서 짝수의 갯수 count, 1씩 증가
    	int count = 0;
    	System.out.print("짝수: ");
    	for(int i = 1;i<16;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.print(i+" ");
    			count+=1;
    		}
    	}
    	System.out.println("짝수의 갯수: "+count);
    }
    void countSum()
    {
    	int count=0, sum = 0;
    	// 1-100까지의 홀수의 갯수와 그 수들의 합을 구하시오
    	for(int i =1;i<100;i++)
    	{
    		if(i%2==1)
    		{
    			count+=1;
    			sum+=i;
    		}
    	}
    	System.out.println("홀수의 합: "+sum);
    	System.out.println("홀수의 갯수: "+count);
    }
    void Sum01()
    {
    	// 1-100까지에서의 합, 그 합이 3000을 넘는 최초의 수를 구하시오
    	int sum = 0;
    	for(int i=1;i<=100;i++)
    	{
    		sum+=i;
    		if(sum >= 3000)
    		{
    			System.out.println("반복 횟수에서 1~100의 합이 3000을 넘는건 "+i+"번째 입니다.");
    			break;
    		}
    	}
    	System.out.println("전체 합: "+sum);
    }
    void comparingNumbers()
    {
    	// 두 수를 입력받아 큰 수, 작은 수를 출력
    	int n01=0, n02=0;
    	System.out.print("비교할 첫번째 수를 입력하세요: ");
    	n01=sc.nextInt();
    	System.out.print("비교할 두번째 수를 입력하세요: ");
    	n02=sc.nextInt();
    	System.out.println("-------------------------------");
    	System.out.println("[결과]\n");
    	if(n01 > n02)
    	{
    		System.out.println("첫번째 수가 두번째 수보다 큽니다.\n");
    		System.out.println("입력받은 수: "+n01+" | "+n02);
    	}
    	else
    	{
    		System.out.println("두번째 수가 첫번째 수보다 큽니다.\n");
    		System.out.println("입력받은 수: "+n01+" | "+n02);
    	}
    }
    void twoNums()
    {
    	// 두 수를 입력받아 몫과 나머지를 구하는 프로그램을 작성하시오
    	int num1=0, num2=0, quo=0, remain=0;
    	double result=0.00;
    	System.out.print("첫번째 수: ");
    	num1=sc.nextInt();
    	System.out.print("두번째 수: ");
    	num2=sc.nextInt();
    	result=(double)num1/(double)num2;
    	quo=(int)result;
    	remain=num1%num2;
    	System.out.println("첫 번째 수("+num1+")와 두번째 수("+num2+")의 나눈 값은 "+result+" 입니다.");
    	System.out.println("몫은 "+quo+"이며 나머지는 "+remain+" 입니다.");
    }
}