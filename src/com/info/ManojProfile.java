package com.info;

public class ManojProfile implements IProfile{

	@Override
	public void myBasic() {
		System.out.println(ProfileConstants.FIRST_NAME+" Manoj");
		System.out.println(ProfileConstants.LAST_NAME+" kumar");
		System.out.println(ProfileConstants.Age+" 20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Gardening");
		System.out.println("Net surffing");
		
		
	}
} 
