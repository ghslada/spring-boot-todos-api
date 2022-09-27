package com.example.todos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.todos.dto.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Long> {


    // montando querie utilizando JPQL
	@Query(nativeQuery = true, value="SELECT * FROM users u WHERE u.email =:email ORDER BY u.id DESC")
	public UserDTO findByEmail(@Param("email") String email);

	// montando querie utilizando implementações prontas do Spring DATA
	// pesquisa no campo name o que contem
	public List<UserDTO> findByNameContaining(String name);

}
