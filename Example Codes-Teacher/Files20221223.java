package day15_TotalScore;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreDAO {
	ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();
//입력기능
	Input in = new Input();
	public void  insert() {		
			
			String name =in.munja("이름");
			int kor = in.number("국어");
			int eng = in.number("영어");
			int mat = in.number("수학");
			int tot=kor+eng+mat;
			ScoreDTO dto = new ScoreDTO();
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			dto.setTot(tot);
			double avg = (double) tot/3;
			dto.setAvg(avg);
			char hak;
			if(avg>=90)hak='A';
			else if(avg>=80)hak='B';
			else if(avg>=70)hak='C';
			else if(avg>=60)hak='D';
			else hak='F';
			dto.setHak(hak);
			list.add(dto);		
	}
//출력기능
	public void  out() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.print("이름"+"\t");
		System.out.print("국어"+"\t");
		System.out.print("영어"+"\t");
		System.out.print("수학"+"\t");
		System.out.print("총점"+"\t");
		System.out.print("평균"+"\t");
		System.out.print("학점"+"\t");
		System.out.println();
		System.out.println("========================================+=======");
		for(ScoreDTO aa:list) {
			System.out.print(aa.getName()+"\t");
			System.out.print(aa.getKor()+"\t");
			System.out.print(aa.getEng()+"\t");
			System.out.print(aa.getMat()+"\t");
			System.out.print(aa.getTot()+"\t");
			System.out.print(df.format(aa.getAvg())+"\t");
			System.out.print(aa.getHak()+"\t");
			System.out.println();
		}
	}
//검색기능
	public void  select(Scanner sc) {
		int po=-1; //위치값이 -1..없는자료일것
		System.out.print("검색할 이름을 입력하세요?");
		String sname=sc.next();
		//검색하고자 하는 이름을 list객체저장소 에서 찾기
		for(int i =0 ;i<list.size();i++) {
			if(list.get(i).getName().equals(sname)) {
			po=i;//찾는 이름이  존재할떄 존재하는이름의 위치
			}
		}
		
		if(po==-1) {
			System.out.println(sname+"은 없는 자료이다!!");
		}
		else { //검색할 이름이 존재할경우
			System.out.println("총점 : "+list.get(po).getTot());
			System.out.println("평균 : "+list.get(po).getAvg());
			
		}
	}
//삭제기능
	public void  delete(Scanner sc) {
		int  po = -1;
		System.out.print("삭제할 이름을 입력하세요?");
		String dname=sc.next();
		for(int i =0 ;i<list.size();i++) {
			if(list.get(i).getName().equals(dname)) {
			po=i;//삭제 이름이  존재할떄 존재하는이름의 위치
			}
		}		
		if(po==-1) {
			System.out.println(dname+"은 없는 자료이다!!");
		}
		else {//삭제할 이름이 존재!!
			System.out.println(dname+"의 자료 보기");
			System.out.println("총점 :"+list.get(po).getTot());
			System.out.println("평균 :"+list.get(po).getAvg() );
			System.out.println("학점 :"+list.get(po).getHak());
			System.out.print("위의 자료를 삭제할까요?(Y/N)");
			String  qq =  sc.next();
			if(qq.equals("Y") || qq.equals("y") ||  qq.equals("ㅛ"))
			{
				list.remove(po);
			}
		}
	}
//수정기능
	public void  update(Scanner sc) {
		int  po = -1;
		System.out.print("수정할 이름을 입력하세요?");
		String uname=sc.next();
		for(int i =0 ;i<list.size();i++) {
			if(list.get(i).getName().equals(uname)) {
			po=i;//수정할 이름이  존재할떄 존재하는이름의 위치
			}
		}		
		if(po==-1) {
			System.out.println(uname+"은 없는 자료이다!!");
		}
		else { //수정할 이름이 존재...화면에 자료 보이기
			System.out.println(uname+"의 자료보기");
			System.out.print("국어 : "+list.get(po).getKor()+"\t\t");
			System.out.print("영어 : "+list.get(po).getEng()+"\t\t");
			System.out.println("수학 : "+list.get(po).getMat()+"\t\t");
			System.out.print("위의 자료를 수정할까요?(Y/N)");
			String qq =  sc.next();
			if(qq.equals("Y") ||  qq.equals("y") || qq.equals("ㅛ"))
			{
			   int kk = in.number("국어");
			   int ee = in.number("영어");
			   int mm = in.number("수학");
			   int tt =kk+ee+mm;
			   double av = (double)tt/3;
			   char  ha;
			   if(av>=90)ha='A';
			   else if(av>=80)ha='B';
			   else if(av>=70)ha='C';
			   else if(av>=60)ha='D';
			   else ha='F';
			   ScoreDTO dto = new ScoreDTO();
			   dto.setName(uname);
			   dto.setKor(kk);
			   dto.setEng(ee);
			   dto.setMat(mm);
			   dto.setTot(tt);
			   dto.setAvg(av);
			   dto.setHak(ha);
			   list.set(po, dto);
			}	
			
		}
	}
}
