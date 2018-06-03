package com.info;

public class RameshProfile implements IProfile{

	@Override
	public void myBasic() {
		System.out.println(ProfileConstants.FIRST_NAME+"Ramesh");
		System.out.println(ProfileConstants.LAST_NAME+"Aanji");
		System.out.println(ProfileConstants.Age+"20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Watchingmovies");
		System.out.println("Net surffing");
		
	}

}
