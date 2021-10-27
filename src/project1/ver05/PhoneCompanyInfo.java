package project1.ver05;

 class PhoneCompanyInfo extends PhoneInfo
{
	 String companyName;

	public PhoneCompanyInfo(String name, String phoneNumber, String companyName)
	{
		super(name, phoneNumber);
		this.companyName = companyName;
		
		
	}
	@Override
	public void showPhoneInfo()
	{
		
		System.out.println("=====회사친구=====");
		super.showPhoneInfo();
		System.out.println("회사명:"+companyName);
	}
	
	 
	 
	 
}
