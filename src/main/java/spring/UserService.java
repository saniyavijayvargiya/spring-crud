package spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	public UserRepository userRepo;
	
	public List<User> getAllUsers() {
		
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users :: add);
		return users;
	}
	
	
	public Optional<User> getUserById(Integer id) {
		
		Optional<User> user = userRepo.findById(id);
		return user;
	}
	
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	
	public void updateUser(Integer id, User user) {
		userRepo.deleteById(id);
		userRepo.save(user);
	}
	
	
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}
}
