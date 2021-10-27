package project1;

import java.util.Scanner;

import project1.ver06.PhoneBookManager;
import project1.ver06.PhoneInfo;
import project1.ver06.MenuSelectException;


public class PhoneBookVer06 
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
