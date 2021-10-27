package project1.ver05;

import java.util.Scanner;


public class PhoneBookManager
{
	public PhoneInfo[] myPhoneInfo;
	public int numOfPhoneInfo;
	

	public PhoneBookManager(int num) {
		 myPhoneInfo = new PhoneInfo[num];
		 numOfPhoneInfo = 0;

	}
	//메뉴출력
	
	public void menuShow() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력 ");
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
		if(select==1) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			
			myPhoneInfo[numOfPhoneInfo++] = new PhoneInfo(name, phoneNumber);
		}
		else if(select==2) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			System.out.println("전공:"); major=scan.nextLine();
			System.out.println("학년:"); grade=scan.nextLine();

			myPhoneInfo[numOfPhoneInfo++] = new PhoneSchoolInfo(name, phoneNumber, major, grade);
		}
		else if(select==3) {
			System.out.println("이름:"); name = scan.nextLine();
			System.out.println("전화번호:"); phoneNumber = scan.nextLine();
			System.out.println("회사명:"); companyName =scan.nextLine();
			
			myPhoneInfo[numOfPhoneInfo++] = new PhoneCompanyInfo(name, phoneNumber, companyName);
		}
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	//검색
	public void dataSearch() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색할 이름을 입력하세요:");
		
		String searchName = scan.nextLine();
		
		for(int i=0 ; i<numOfPhoneInfo; i++) {
			if(searchName.compareTo(myPhoneInfo[i].name)==0) {
				myPhoneInfo[i].showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다.");
				isFind = true;
			}
			if(isFind == false)
				System.out.println("찾는 정보가 없습니다.");
		}
	}
	//삭제
	public void dataDelete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		
		for(int i=0 ; i<numOfPhoneInfo ; i++) {
			if(deleteName.compareTo(myPhoneInfo[i].name)==0) {
				myPhoneInfo[i] = null;
				deleteIndex = i;
				numOfPhoneInfo--;
				break;
			}
		}
		if(deleteIndex==-1) {
			System.out.println("삭제할 데이터가 없습니다.");
		}
		else {
			for(int i=deleteIndex ; i<numOfPhoneInfo ; i++) {
				 myPhoneInfo[i] = myPhoneInfo[i+1];
			}
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	}
	//주소록 출력
	public void dataAllshow() {
		for(int i=0 ; i<numOfPhoneInfo ; i++) {
			myPhoneInfo[i].showPhoneInfo();
		}
		System.out.println("주소록이 출력되었습니다.");
		
	}
}

	
