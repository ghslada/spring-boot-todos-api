/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.todos.repository;

import com.example.todos.dto.TodoDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author gabri
 */
public interface TodoRepository extends JpaRepository<TodoDTO, Long>{
//    
//    public TodoDTO findById(String id);
    
    //	// montando querie utilizando SQL Nativo;

    @Query(nativeQuery = true, value = "select * from user u join todo t on t.owner_id = u.id inner join assigned_todo asso"
                    + "ON t.id=asso.todo_id OR asso.assigned_user_id = u.id"
			+ "where t.todo_status_id = :todoStatusId AND u.id = :ownerId ORDER BY t.updated_at DESC")
    public List<TodoDTO> findByTodoStatusId(@Param("todoStatusId") Long todoStatusId, @Param("ownerId") Long ownerId);

    @Query(nativeQuery = true, value = "select * from user u join todo t on t.owner_id = u.id inner join assigned_todo asso"
                    + "ON t.id=asso.todo_id OR asso.assigned_user_id = u.id"
			+ "where u.id = :ownerId ORDER BY t.updated_at DESC")    
    public List<TodoDTO> findByOwnerId(@Param("ownerId") Long ownerId);
    
}
