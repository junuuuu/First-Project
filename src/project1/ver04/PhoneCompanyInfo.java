package project1.ver04;

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
		
		System.out.println(companyName);
		super.showPhoneInfo();
	}
	
	 
	 
	 
}
