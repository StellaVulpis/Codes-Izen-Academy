package day16_test_feedback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test 
{
	public static void main(String args[])
	{
		int po=0;
		try
		{
			FileReader file = new FileReader("C:/Data/12261.txt");
			BufferedReader bf = new BufferedReader(file); 
			String name[] = new String[1000];
			int score[][] = new int[1000][7];
			while(true)
			{
				String str=bf.readLine();
				if(str==null)
					break;
				String na=str.substring(0,3);
				name[po]=na;
				int kor=Integer.parseInt(str.substring(3,6));
				int eng=Integer.parseInt(str.substring(6,9));
				int math=Integer.parseInt(str.substring(9,12));
				score[po][0]=kor;
				score[po][1]=eng;
				score[po][2]=math;
			    score[po][3]=kor+eng+math;
			    score[po][4]=score[po][3]/3;
				if(score[po][4] >= 90)
					score[po][5]=65; // A
				else if(score[po][4]>=80)
					score[po][5]=66; // B
				else if(score[po][4]>=70)
					score[po][5]=67; // C
				else if(score[po][4]>=60)
					score[po][5]=68; // D
				else
					score[po][5]=70; // F
				po++; // 8줄을 읽어들일때까지 1씩 증가 >> po==8
			}
			rank(name,score,po);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	static void rank(String name[], int score[][], int po)
	{
		for(int i=0;i<po;i++)
		{
			score[i][6]=1;
			for(int t=0;t<po;t++)
			{
				if(score[i][3]<score[t][3])
					score[i][6]+=1;
			}
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t석차");
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<po;i++)
		{
			for(int t=0;t<7;t++)
			{
				if(t==5) // >> score[po][5](ASCII)
					System.out.print((char)score[i][t]+"\t");
				else
					System.out.print(score[i][t]+"\t"); // [po][0]-[1]-[2]-[3]-[4]-[5]-[6]
			}
			System.out.println();
		}
	}
}
