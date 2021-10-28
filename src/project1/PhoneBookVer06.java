package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver06.MenuItem;
import project1.ver06.PhoneBookManager;
import project1.ver06.PhoneInfo;
import project1.ver06.MenuSelectException;


public class PhoneBookVer06
{
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		PhoneBookManager pi4 = new PhoneBookManager(100);
		while(true) 
		{
			
			try 
			{
			pi4.menuShow();
			int choice = scanner.nextInt(); 
			scanner.nextLine();
			
			if(choice < 1 || choice> 5) 
			{
				MenuSelectException imp = new MenuSelectException();
				throw imp;
			}
			
				switch(choice) 
				{
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
			catch(MenuSelectException e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				scanner.nextLine();
				System.out.println("1~5사이의 숫자를 입력하세요.");
			}
			catch(NullPointerException e) {
				System.out.println("검색결과가 없습니다.");
			}	
		}
	}
}

	

	
