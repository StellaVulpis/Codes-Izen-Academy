package day11;
import java.util.ArrayList;
public class ArrayList_DAO 
{
	ArrayList<ArrayList_Data> list = new ArrayList<ArrayList_Data>();
	ArrayList_Data ard = new ArrayList_Data();
	ArrayList_Scanner in = new ArrayList_Scanner();
	public void In()
	{
		ard.setName(in.scanfStr("이름을 입력"));
		ard.setKor(in.scanfInt("국어 점수를 입력"));
		ard.setEng(in.scanfInt("영어 점수를 입력"));
		ard.setMath(in.scanfInt("수학 점수를 입력"));
		ard.setTotal((double)(ard.kor+ard.eng+ard.math));
		ard.setAvrg((ard.total/3));
		if(ard.avrg>=90 && ard.avrg<=100)
			ard.setGrade("A");
		else if(ard.avrg>=80 && ard.avrg<90)
			ard.setGrade("B");
		else if(ard.avrg>=70 && ard.avrg<=80)
			ard.setGrade("C");
		else if(ard.avrg>=60 && ard.avrg<70)
			ard.setGrade("D");
		else if(ard.avrg<60)
			ard.setGrade("F");
		else
			ard.setGrade("NULL");
		list.add(ard);
	}
	public void Out()
	{
		System.out.print("이름\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("총점\t");
		System.out.print("평균\t");
		System.out.println("학점\t");
		for(ArrayList_Data a:list)
			{
				System.out.print(a.getName()+"\t");
				System.out.print(a.getKor()+"\t");
				System.out.print(a.getEng()+"\t");
				System.out.print(a.getMath()+"\t");
				System.out.print(a.getTotal()+"\t");
				System.out.print(a.getAvrg()+"\t");
				System.out.println(a.getGrade()+"\t\n");
			}
	}
	public void answer()
	{
		ard.setAns(in.scanfStr("Yes / No"));
	}
	public void MAIN_Loop()
	{
		int count=0;
		while(true)
		{
			if(count>0)
			{
				System.out.println("계속?");
				answer();
			}
			if(ard.ans.equals("NO")||ard.ans.equals("No")||ard.ans.equals("no")
				|| ard.ans.equals("아니요") || ard.ans.equals("아니오"))
			{
				System.out.println("종료되었습니다.");				return;
			}
			else
			{
				System.out.println("서비스를 선택해주세요.");
				ard.setAns(in.scanfStr("1. 입력\n2. 출력\n3. 종료"));
				for(;;)
				{
					if(ard.ans.equals("1") || ard.ans.equals("입력"))
						In();
					else if(ard.ans.equals("2") || ard.ans.equals("출력"))
						Out();
					else if(ard.ans.equals("3") || ard.ans.equals("종료"))
					{
						System.out.println("종료되었습니다.");
						return;
					}
					else
					{
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
					count++;
				}
			}
                  // Preventing value of previous answer(selection)
                  // to be maintained on next loop.
                  count=0;
                  ard.ans=" "; // or null
		}// end of while
	}
}

