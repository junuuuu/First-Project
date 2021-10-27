package project1.ver06;



public class PhoneInfo
{
	
	String name; //이름 
	String phoneNumber; //전화번호
	String major;
	String grade;
	String companyName;
	
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
	//기본생성자
	public PhoneInfo() {
		
	}
	
	public void showPhoneInfo() {
		
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+phoneNumber);
	}
	
	
}
