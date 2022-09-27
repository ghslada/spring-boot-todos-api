/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabri
 */

@Repository
public abstract class TodoStatusRepositoryImpl implements TodoStatusRepository {
 
	@PersistenceContext	
	private EntityManager em;   
}
