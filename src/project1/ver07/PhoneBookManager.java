package project1.ver07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import project1.ver07.SubMenuItem;
import project1.ver07.PhoneInfo;



public class PhoneBookManager
{
	public PhoneInfo[] myPhoneInfo;
	public int numOfPhoneInfo;
	
	HashSet<PhoneInfo> set = new HashSet<PhoneInfo>();
	
	
	
	

	public PhoneBookManager(int num) {
		 myPhoneInfo = new PhoneInfo[num];
		 numOfPhoneInfo = 0;

	}
	//메뉴출력
	
	public void  menuShow() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("선택:");
	}
	
	//입력
	public void dataInput(int choice) {
			int select;
			Scanner scan = new Scanner(System.in);
			System.out.println("데이터 입력을 시작합니다.");
			System.out.println("1.일반 2.동창 3.회사");
			System.out.println("선택>>"); select = scan.nextInt();
			scan.nextLine();
	
		
		String name, phoneNumber, major, grade, companyName;
		
		
		if(select==SubMenuItem.NOMAL) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			
			PhoneInfo nomalInfo = new PhoneInfo(name, phoneNumber);
			equal(name);
			set.add(nomalInfo);
			
			
		}
		else if(select==SubMenuItem.SCHOOL) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			System.out.println("전공:"); major=scan.nextLine();
			System.out.println("학년:"); grade=scan.nextLine();
			
			
			PhoneInfo schoolInfo = new PhoneSchoolInfo(name, phoneNumber, major, grade);
			
			equal(name);
			set.add(schoolInfo);
			
		}
		else if(select==SubMenuItem.COMPANY) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			System.out.println("회사명:"); companyName =scan.nextLine();
			
			
			PhoneInfo companyInfo = new PhoneCompanyInfo(name, phoneNumber, companyName);
			equal(name);
			set.add(companyInfo);
			
		}
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public boolean equal(String name) {
		Iterator<PhoneInfo> itr = set.iterator();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(itr.hasNext()) {
			PhoneInfo pi5 = itr.next();
			
			if(name.equals(pi5.name)) {
				
					while(true) {
						System.out.println("이미 저장된 데이터입니다"
							+"덮어쓸까요? Y(y) / N(n)");
				
					
					String answer = scan.nextLine();
					
					
					if("y".equalsIgnoreCase(answer)) {
						
						itr.remove();
						
						System.out.println("덮어썼습니다.");
						break;
						
						
					}
					else if("n".equalsIgnoreCase(answer)) {
						pi5.showPhoneInfo();
						System.out.println("저장하지 않습니다.");
						break;
					}
					else { 
						System.out.println("잘못 입력하였습니다.");
						
					}
					
			}
				
		}
	}
		return false;
	}
		
	//검색
	public void dataSearch() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색할 이름을 입력하세요:");
		
		String searchName = scan.nextLine();
		
		Iterator<PhoneInfo> itr = set.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo pi5 = itr.next();
			
			if(searchName.equals(pi5.name)) {
				pi5.showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다.");
				isFind = true;
			}
		}
		if(isFind == false) {
			System.out.println("찾는 정보가 없습니다.");
		}
		
	}
	//삭제
	public void dataDelete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		
		boolean nameDelete = false;
		
		Iterator<PhoneInfo> itr = set.iterator();
		while(itr.hasNext()) {
			
			PhoneInfo pi5 = itr.next();
			
			if(deleteName.equals(pi5.name)) {
				System.out.println(deleteName+"데이터 삭제가 완료되었습니다");
				itr.remove();
				nameDelete = true;
			}
		}
	}
	//주소록 출력
	public void dataAllshow() {
		for(PhoneInfo pi5 : set) {
			pi5.showPhoneInfo();
		}
		System.out.println("주소록이 출력되었습니다.");
		
	}
}

	
