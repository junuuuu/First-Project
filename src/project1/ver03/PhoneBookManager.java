package project1.ver03;

import java.util.Scanner;





public class PhoneBookManager
{
	public PhoneInfo[] myPhoneInfo;
	public int numOfPhoneInfo;
	

	public PhoneBookManager(int num) {
		 myPhoneInfo = new PhoneInfo[num];
		 numOfPhoneInfo = 0;

	}
	//입력
		public void dataInput(int choice) {
			
		Scanner scan = new Scanner(System.in);
		String name, phoneNumber, birthday;
		System.out.print("이름:"); name = scan.nextLine();
		System.out.print("전화번호:"); phoneNumber = scan.nextLine();
		System.out.print("생년월일:"); birthday = scan.nextLine();
		
		System.out.println("데이터 입력이 완료되었습니다.");
	//객체저장시키기
		if(choice==1) {
			  
			PhoneInfo pInfo = 
					new PhoneInfo(name,phoneNumber,birthday);
			myPhoneInfo [numOfPhoneInfo++] = pInfo;
		}
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

	
