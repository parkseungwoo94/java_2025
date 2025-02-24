package Mini_Project;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/////////변수
		int num, balance= 0;
		char id = ' ', pass=' ';
		
		
		//입력+처리+출력
		//step1.
		for(;;) {  // #무한반복
			System.out.println("\n==========bank===========");
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			num = scanner.nextInt();
			if(num==9) {System.out.println("종료합니다"); break;}
			
			
			//step2.
			switch(num) {
				 case 1: System.out.println("추가기능입니다.");
				 //step3
				 //*ID : _입력받기 ㅁ
				 //*PASS : _입력받기 ㅁ
				 //*BALANCE :_입력받기 10000
				 System.out.println("ID: ");   id=scanner.next().charAt(0);//정수는 nextInt() // 문자는 next().charAt(0);				 
				 System.out.println("PASS: ");   pass = scanner.next().charAt(0);
				 System.out.println("BALANCE: ");  balance = scanner.nextInt();
				 break; // end case1
				 case 2: System.out.println("조회기능입니다.");
				 //step4
				 // 위에서 추가한데이터가 맞는지 확인
				 // 
				 //변수 - 임시변수 temp_id, 임시변수 temp_pass
				 //입력 - 임시변수 temp_id, temp_pass 입력받기
				 //처리 - if(temp_id 와 id가 같고 temp_pass와 pass가 같다면) {사용자정보출력}
				 //      else{아니라면 비밀번호 확인해주세요}
				 char temp_id = ' ', temp_pass =' ';
					 System.out.println("* ID : "); temp_id=scanner.next().charAt(0);
					 System.out.println("* PW : "); temp_pass=scanner.next().charAt(0);
				 if(temp_id == id && temp_pass == pass) {
					 System.out.println("id:>" + id);
					 System.out.println("pw:>" + pass);
					 System.out.println("balance:>" + balance);
				 }else {System.out.println("비밀번호를 체크하세요.");}
				 
				 break; // end case2
				 case 3: System.out.println("입금기능입니다.");
				 break; // end case3
				 case 4: System.out.println("출금기능입니다.");
				 break; // end case4
				 case 5: System.out.println("삭제기능입니다.");
				 break; // end case5
				 case 9: System.out.println("종료기능입니다.");
				 break; // end case9
			
			
				 
			
			
			
			
			
			
			}
		}//end for
		
		
	}//end main
}//end class
/*Step1.Q1. 메뉴판 무한반복
for(){ // 1-1무한반복
if(num==1) {System.out.println("추가기능입니다");}
else if(num==2) {System.out.println("조회기능입니다");}
else if(num==3) {System.out.println("입금기능입니다");}
else if(num==4) {System.out.println("출금기능입니다");}
else if(num==5) {System.out.println("삭제기능입니다");}

  // 1-2 빠져나올조건 9일때
}
 */
