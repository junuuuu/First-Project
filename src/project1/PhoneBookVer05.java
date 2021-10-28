package project1;

import java.util.Scanner;

import project1.ver05.MenuItem;
import project1.ver05.PhoneBookManager;
import project1.ver05.PhoneInfo;


public class PhoneBookVer05
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
			case MenuItem.INPUT:
				pi4.dataInput(choice);
				
				break;
			case MenuItem.SEACRH:
				pi4.dataSearch();
				
				break;
			case MenuItem.DELETE:
				pi4.dataDelete();
				
				break;
			case MenuItem.PRINT:
				pi4.dataAllshow();
				
				break;
			case MenuItem.EXIT:
				System.out.println("프로그램을 종료합니다.");
				
				return;
			}
		
		}
	}
}
