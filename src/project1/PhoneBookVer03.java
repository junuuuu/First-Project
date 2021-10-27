package project1;

import java.util.Scanner;

import project1.ver03.PhoneBookManager;
import project1.ver03.PhoneInfo;






public class PhoneBookVer03
{
	public static void menuShow() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력 ");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램 종료");
	}
	
	

	public static void main(String[] args)
	{
		PhoneInfo pi3 = new PhoneInfo();
		Scanner scanner = new Scanner(System.in);
		
		
		
		PhoneBookManager pi4 = new PhoneBookManager(100);
		
	
		while(true) {
			
			menuShow();
		
			int choice = scanner.nextInt(); 
			switch(choice) {
			case 1:
				System.out.println("데이터 입력을 시작합니다.");
				pi4.dataInput(choice);
				
				break;
			case 2:
				pi4.dataSearch();
				
				break;
			
			case 3:
				pi4.dataDelete();
				
				break;
			case 4:
				pi4.dataAllshow();
				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
		

	}

}
