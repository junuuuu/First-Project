package project1;

import project1.ver01.PhoneInfo;

public class PhoneBookVer01
{

	public static void main(String[] args)
	{
		
		PhoneInfo pi1 = new PhoneInfo("유비", "010-1111-1111", "1980-10-10");
		pi1.showPhoneInfo();
		
		//오버로딩 되어있으니 객체생성됨
		PhoneInfo pi2 = new PhoneInfo("손오공", "010-2222-3333");
		pi2.showPhoneInfo();
		

	}

}
