package spring;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Integer> {
	
}
