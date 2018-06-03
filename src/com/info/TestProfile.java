package com.info;

public class TestProfile {
public static void PrintProfile(IProfile Profile){
	Profile.myBasic();
	Profile.myHobbies();
}
public static void main(String[]args) {
	IProfile myProfile = new ManojProfile();
	TestProfile.PrintProfile(myProfile);
	IProfile myProfile1 = new RameshProfile();
	TestProfile.PrintProfile(myProfile1);
}

}