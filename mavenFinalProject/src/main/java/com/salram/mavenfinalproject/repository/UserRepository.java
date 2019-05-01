package com.salram.mavenfinalproject.repository;
import java.util.List;

import com.salram.mavenfinalproject.model.User;

public interface UserRepository {
	public List<User> getUsers();
	public User getUser(String username);
	public User createUser(String username, String password, String fullName); 
	public boolean login(String username, String password);
	public void deleteUser(String username);
	public User updateUser(User user);
}


