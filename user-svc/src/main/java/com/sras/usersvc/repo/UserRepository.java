package com.sras.usersvc.repo;

import com.sras.usersvc.model.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	@Query(value = "select * from public.user where email =:email", nativeQuery = true)
	List<User> getByEmail(String email);
	
	@Query(value = "select * from public.user", nativeQuery = true)
	List<User> getAll();	
}
