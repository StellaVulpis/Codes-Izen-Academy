package day06;
import java.util.Scanner;
//import java.util.ArrayList;
public class day06_2022_12_12 
{
	public static void main(String[] args) 
	{
		ClassD06 cls = new ClassD06();
		//cls.Test();
		//cls.arr01();
		//cls.arr02();
		//cls.arr03();
		//cls.arr04();
		cls.arr05();
	}
}// end of class day06~
class ClassD06
{
		Scanner ctnu = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in); // InputMismatchException >> Exception occur when inputting 
											  // different types into one Scanner. Use another Scanner for 
		                                      // two different types of arrays.
		ClassD06()
		{
		}
		void Test()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(j==i)
						break;
					else
						System.out.print(j+" ");
				}
				System.out.println();
			}// end of for(i)
		}// end of void arrTest()
		void arr01()
		{
			String name1, name2, name3, name4, name5;
			name1 = "한라산";
			name2 = "칠보산";
			name3 = "백두산";
			name4 = "설악산";
			name5 = "광교산";
			String[] mountainNames = {"한라산", "칠보산", "백두산", "설악산", "광교산"}; // 선언+초기화
			String[] names =  new String[5]; // 선언
			String[] arrayNames = new String[5];
			names = new String[]{"한라산", "칠보산", "백두산", "설악산", "광교산"}; // 초기화
			int numbers[] = {1,2,3,4,5};
			System.out.println();
			for(int i=0;i<5;i++) // 반복문 초기화
				arrayNames = new String[]{"Name"};
			for(int j=0;j<5;j++) // 반복문에서 출력
				System.out.println(mountainNames[j]+" Array ["+j+"]");
			System.out.println();
			for(int t=0;t<5;t++) // 배열에 입력받기
			{
				System.out.print((t+1)+" 번째 문자를 입력해주세요: ");
				names[t] = sc.nextLine();
			}
			System.out.println();
			for(int t2=0;t2<5;t2++) // 입력받아 출력하기
			{
				System.out.println(names[t2]);
				System.out.println(arrayNames[t2]);
			}
			System.out.println();
			//------------------------------------------------------
			// 빠른 for >> for(자료형 변수:객체명) { System.out.println(변수); } 
			for(String PrintStrings:mountainNames) // 빠르게 배열의 내용물을 출력할 수 있다. (단점은 상세한 지정이 불가능)
				System.out.println(PrintStrings);
			System.out.println();
			for(int PrintNumbers:numbers)
				System.out.println(PrintNumbers);
			System.out.println();
			//------------------------------------------------------
			/*
			 * String[] name = {10,34,45,56,67,78};
			 * System.out.println("빠른 for 출력");
			 * for(String names:name)
			 * 	  System.out.println(names);
			 * */
			// 에러 해결:
			int name[] = {10,34,45,56,67,78};
			System.out.println("빠른 for 출력");
			for(int NAMES:name)
				System.out.println(NAMES);
			// 일반 for문에서 출력
			for(int a=0;a<6;a++)
				System.out.println(name[a]);
			// 일반 for문에서 배열의 길이만큼만 자동으로 출력
			for(int b=0;b<name.length;b++)
				System.out.println(name[b]);
		}// end of arr01
		void arr02()
		{
			// 정수 7개를 입력받아 출려하는 프로그램
			int nums[] = new int[7]; // 기억장소 확보
			for(int i=0;i<7;i++)
			{
				System.out.print((i+1)+" 번째 숫자를 입력하세요: ");
				nums[i] = sc.nextInt(); // 확보된 기억장소에 값을 입력
			}
			System.out.print("입력결과: ");
			System.out.println();
			for(int j=0;j<nums.length;j++)
				System.out.print(nums[j]+" "); // 출력
			System.out.println();
			/*
			 * for(int NUM:nums) >> NUM: 입력한 숫자 5개 저장됨 == (int NUM=0;NUM<nums.length;NUM++)
			 *   System.out.print(NUM+" "); 출력 결과: 입력숫자 입력숫자 입력숫자 입력숫자 입력숫자
			 * */
		}// end of arr02()
		void arr03()
		{
			// 5명의 이름과 나이를 입력 
			// 이름 나이 
			// =======
			// 한라산 33
			// 백두산 25
			String NAME[] = new String[5];
			int ages[] = new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.print((i+1)+" 번째 이름을 입력하세요.");
				NAME[i] = sc.nextLine();
				System.out.print((i+1)+" 번째 나이를 입력하세요.");
				ages[i] = sc2.nextInt();
			}
			for(int t=0;t<5;t++)	
			{
				System.out.print("이름  나이 \n");
				System.out.println("========================");
				System.out.print(NAME[t]+"  "+ages[t]+"\n");
			}
		}
		void arr04()
		{
			// 키보드로 입력시 짝수만 입력받아 5개만 입력받아 출력
			int num[] = new int[5];
			int NUM[] = new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.print("수를 입력하세요: ");
				num[i] = sc.nextInt();
				if(num[i]%2==0)
					NUM[i] = num[i];
			}
			System.out.println("\n[입력결과]");
			for(int t=0;t<5;t++)
			{
				if(NUM[t]%2==0 && NUM[t]>0)
					System.out.println(NUM[t]);
			}
		}
		void arr05()
		{
			 // 5명의 학생 성적 결과를 만들기
			 // 이름, 국어, 영어, 수학 >> 총점, 평균, 학점 출력
			 // 평균은 소수점 이하 2자리까지
			String names[] = new String[5]; // sc
			int kor[] = new int[5], eng[] = new int[5], math[] = new int[5]; // sc2
			double scoreSum[] = new double[5];
			double average[] = new double[5];
			char grade[] = new char[5];
			String endPoint = "";
			int count = 0;
			while(true)
			{
				if(count > 0)
				{
					System.out.println("계속하시겠습니까?");
					System.out.print("Y / N: ");
					endPoint = ctnu.nextLine();
				}
				if(endPoint.equals("N") || endPoint.equals("n") || endPoint.equals("NO")
						|| endPoint.equals("No") || endPoint.equals("no"))
				{
					System.out.println("\n종료되었습니다.");
					return;
				}
				else
				{
					for(int i=0;i<names.length;i++)
					{
						System.out.print("학생의 이름을 입력해주세요: ");
						names[i] = sc.nextLine();
						System.out.print("국어 점수를 입력해주세요: ");
						kor[i] = sc2.nextInt();
						scoreSum[i]+=(double)kor[i];
						System.out.print("영어 점수를 입력해주세요: ");
						eng[i] = sc2.nextInt();
						scoreSum[i]+=(double)eng[i];
						System.out.print("수학 점수를 입력해주세요: ");
						math[i] = sc2.nextInt();
						scoreSum[i]+=(double)math[i];
					}
					
					for(int t=0;t<names.length;t++)
					{
						if(kor[t] > 100 || eng[t] > 100 || math[t] > 100)
						{
							System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
							break;
						}
						else if(kor[t] < 0 || eng[t] < 0 || math[t] < 0)
						{
							System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
							break;
						}
						else
						{
						average[t]=scoreSum[t]/3;
						if(average[t] >= 90.00)
							grade[t] = 'A';
						else if(average[t] >= 80)
							grade[t] = 'B';
						else if(average[t] >= 70)
							grade[t] = 'C';
						else if(average[t] >= 60)
							grade[t] = 'D';
						else
							grade[t] = 'F';
						}
					}
					System.out.println("=======================================");
					System.out.println("[입력결과]\n");
					System.out.println("이름\t총점\t평점\t학점");
					System.out.println("=======================================");
					for(int j=0;j<names.length;j++)
					{
						System.out.printf("%s\t%.0f\t%.2f\t%c", names[j], scoreSum[j], average[j], grade[j]);
						System.out.println();
					}
					System.out.println("=======================================");
				}
				count++;
			}
			
		}
}// end of class ClassD06
