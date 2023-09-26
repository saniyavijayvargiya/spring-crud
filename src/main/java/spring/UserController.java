package spring;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {		
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id) {
		return new ResponseEntity<Optional<User>>(userService.getUserById(id), HttpStatus.OK);
	}
	
	
	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "You have successfully signed up";
	}

	
	@PutMapping("/users/{id}")
	public String updateUser(@PathVariable Integer id, @RequestBody User user) {
		userService.updateUser(id, user);
		return "User details updated successfully";
	}
	
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "User record deleted successfully";
	}
}
