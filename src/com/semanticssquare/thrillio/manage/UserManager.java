package com.semanticssquare.thrillio.manage;

import com.semanticssquare.thrillio.entites.User;

// this class use the singleton pattern
public class UserManager {
	private static UserManager instance = new UserManager();

	// private constructor
	private UserManager() {
	}

	// there will only be one instance created of this class through this method
	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
}
