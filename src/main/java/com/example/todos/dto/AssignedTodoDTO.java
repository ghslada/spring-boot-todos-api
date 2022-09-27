package com.example.todos.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data //Lombok - geters, seters, contrutores obrigatórios, toString, equals. 
@AllArgsConstructor //Lombok - monta o contrutor com todos os atributos
@NoArgsConstructor //Lombok - monta o contrutor sem argumentos
@EqualsAndHashCode //Lombok - monta os métodos Equals e HashCode
@Entity
@Table(name = "assigned_todo")
public class AssignedTodoDTO implements Serializable {

	@Id
	@ManyToOne // definindo a relação um-para-muitos
	@JoinColumn(name = "assigned_user_id", nullable = false)
//	@PrimaryKeyJoinColumn(name = "assigned_user_id")
	private UserDTO assignedTo;
	
	@Id
	@ManyToOne // definindo a relação um-para-muitos
	@JoinColumn(name = "todo_id", nullable = false)
//	@PrimaryKeyJoinColumn(name = "todo_id")
	private UserDTO todo;

	@Column(name = "created_at")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Column(name = "updated_at")
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@ManyToOne //definindo a relação um-para-muitos
	@JoinColumn(name = "created_by", nullable = false)
	private UserDTO createdBy;

	@ManyToOne //definindo a relação um-para-muitos
	@JoinColumn(name = "updated_by", nullable = false)
	private UserDTO updatedBy;

}
