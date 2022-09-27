package com.example.todos.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data //Lombok - geters, seters, contrutores obrigatórios, toString, equals. 
@AllArgsConstructor //Lombok - monta o contrutor com todos os atributos
@NoArgsConstructor //Lombok - monta o contrutor sem argumentos
@EqualsAndHashCode //Lombok - monta os métodos Equals e HashCode
@Entity
@Table(name = "users")
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	//esse campo é único no banco...
	@Column(name = "email", nullable = false, unique=true)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@Transient //atributo não será persistido
	private String token;

	public Long getId() {
		return id;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getPassword() {
		return password;
	}
	
}

