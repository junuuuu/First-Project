package project1.ver07;



public class PhoneInfo
{
	
	String name; //이름 
	String phoneNumber; //전화번호
	String major;
	String grade;
	String companyName;
	
	//기본생성자
	public PhoneInfo() {
			
	}
	
	//2개의 매개변수를 가진 생성자 오버로딩
	public PhoneInfo(String name, String phoneNumber)
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		
	}
	//5개의 매개변수를 가진 생성자 
	public PhoneInfo(String name, String phoneNumber, String major, String grade, String companyName)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.companyName = companyName;
	}
	
	
	public void showPhoneInfo() {
		
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+phoneNumber);
	}
	
	public int hashCode() {
		
		//각 멤버변수의 hashCode값을 얻어온다. 반환타입은 int형이다.
		int nameHCode = this.name.hashCode();
		return nameHCode ;
		
	}
	
	public boolean equals(Object obj) {
		
		//매개변수로 전달된 객체를 Avengers타입을 다운캐스팅한다.
		PhoneInfo pi5 = (PhoneInfo)obj;
		System.out.println("equals()메서드 호출됨:");
		
		if(pi5.name.equals(this.name)) {
			return true; //값이 동일할때 true반환
		}
		else {
			return false;
		}
	}

	
	
	


	

	
	
	
	
}
