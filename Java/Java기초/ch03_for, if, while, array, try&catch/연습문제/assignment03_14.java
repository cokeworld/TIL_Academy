package 연습문제;

import java.util.Scanner;

public class assignment03_14 {
	public static void main(String[] args) 
	{
		String course [ ] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [ ] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목을 입력하세요>>>");
			String major = sc.next();
			
			if(major.equals("그만"))
			{
				System.out.println("끝");
				break;
			}

//			boolean bSame=false;
			
			//int last_index=0;
			//예:컴퓨터 구조?
			int i=0;
			for(i=0; i<course.length;++i)
			{
//				if(course[i].equals(major))
				
				//last_index = i;
				
				if(major.equals(course[i]))
				{
					System.out.println(major + "점수는" + score[i]);
//					bSame = true;
					break;
				}		
			}
			
//			if(!bSame)//배열안에 있는 과목을 다 검사를 했는데, 없을 경우!
			if(i == score.length)
				System.out.println("해당 과목이 없습니다");
			
		}

	}
}
