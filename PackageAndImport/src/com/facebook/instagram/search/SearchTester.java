package com.facebook.instagram.search;


//Import to get the visibility of the class from diff package
import com.facebook.instagram.login.LoginValidation;
import com.facebook.instagram.login.*;//To import all the classes in that package

public class SearchTester {

	public static void main(String[] args) {
		
		
		//use fully qualified class name when class names are same but in different packages
		
		com.facebook.instagram.login.User user = new com.facebook.instagram.login.User();
		
		com.facebook.instagram.stories.User user2 = new com.facebook.instagram.stories.User();

	}

}
