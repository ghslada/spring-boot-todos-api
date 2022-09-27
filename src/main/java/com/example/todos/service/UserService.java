package com.example.todos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.todos.dto.UserDTO;
import com.example.todos.repository.UserRepository;

/**
 * Classe responsável por manter os serviços
 * @author jeang
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Método serve para salvar ou atualizar um objeto 
	 * @param dto
	 * @return
	 */
	public UserDTO save(UserDTO dto) {
		return userRepository.save(dto);
	}
	
	public List<UserDTO> findAll(){		
		return userRepository.findAll();
	}
	
	public Optional<UserDTO> findById(Long id) {
		return userRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
	public UserDTO findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public List<UserDTO> findByNameContaining(String name) {
		return userRepository.findByNameContaining(name);
	}
	
}
