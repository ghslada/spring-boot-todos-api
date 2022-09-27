
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todos.repository;

import com.example.todos.dto.TodoStatusDTO;
import com.example.todos.dto.UserDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabri
 */

public interface TodoStatusRepository  extends JpaRepository<TodoStatusDTO, Long> {
    
	public TodoStatusDTO findByTitle(String title);

	// montando querie utilizando implementações prontas do Spring DATA
	// pesquisa no campo name o que contem
	public List<TodoStatusDTO> findByDescriptionContaining(String description);

        // montando querie utilizando JPQL
//	@Query("SELECT u FROM UserDTO u WHERE u.password =:password ORDER BY u.id DESC")
//	public List<UserDTO> findByPassword(@Param("password") String password);

//	// montando querie utilizando SQL Nativo
//	@Query(nativeQuery = true, value = "select * from tb_user u inner join tb_department d on d.id = u.dpt_id "
//			+ "where u.dpt_id = :dptId order by u.usr_nome asc")
//	public List<UserDTO> findByPorDeptoId(@Param("dptId") Long dptId);

//	// montando querie utilizando SQL Nativo
//	@Query(nativeQuery = true, value = "select * from tb_user u inner join tb_department d on d.id = u.dpt_id "
//			+ "where u.usr_email = :email  AND u.usr_nome = :nome  order by u.usr_nome asc")
//	public UserDTO findByPorNomeEmail(@Param("email") String email, @Param("nome") String nome);

}
