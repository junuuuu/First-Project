package project1;

import java.util.Scanner;
import project1.ver02.PhoneInfo;


public class PhoneBookVer02
{
	public static void menuShow() {
		System.out.println("선택하세요");
		System.out.println("1.데이터입력 ");
		System.out.println("2.프로그램 종료");
	}
	
	

	public static void main(String[] args)
	{
		
		PhoneInfo pi1 = new PhoneInfo("유비", "010-1111-1111", "1980-10-10");
		//pi1.showPhoneInfo(1);
		
		//오버로딩 되어있으니 객체생성됨
		PhoneInfo pi2 = new PhoneInfo("손오공", "010-2222-3333");
		//pi2.showPhoneInfo(1);
		
		
		PhoneInfo pi3 = new PhoneInfo();
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			
			menuShow();
			
			int choice = scanner.nextInt(); 
			switch(choice) {
			case 1:
				pi3.showPhoneInfo(choice);
				
				break;
				
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	
//		실행결과>
//		선택하세요...
//		1. 데이터 입력
//		2. 프로그램 종료
//		선택: 1`
//		이름: 성낙현
//		전화번호: 010-7906-3600
//		생년월일: 75.11.30
//		 
//		입력된 정보 출력...
//		name: 성낙현
//		phone: 010-7906-3600
//		birth: 75.11.30
//		 
//		선택하세요...
//		1. 데이터 입력
//		2. 프로그램 종료
//		선택: 2
//		프로그램을 종료합니다.


		
		
		
		
		
		
		

	}

}
