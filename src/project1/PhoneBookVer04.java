package project1;

import java.util.Scanner;

import project1.ver04.PhoneBookManager;
import project1.ver04.PhoneInfo;


public class PhoneBookVer04
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		PhoneBookManager pi4 = new PhoneBookManager(100);
		while(true) {
			
			pi4.menuShow();
			int choice = scanner.nextInt(); 
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.println("데이터 입력을 시작합니다..");
				System.out.println("1.일반2.동창3.회사");
				
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
