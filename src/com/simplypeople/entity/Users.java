package com.simplypeople.entity;
// Generated 4 May, 2019 10:08:30 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u ORDER BY u.fullname"),
	@NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email"),
	@NamedQuery(name = "Users.countAll", query = "SELECT Count(*) FROM Users u"),
	@NamedQuery(name = "Users.checkLogin", query = "SELECT u FROM Users u WHERE u.email = :email AND password = :password")
})
@Table(name = "users", catalog = "simplypeople")
public class Users implements java.io.Serializable {

	private Integer usersId;
	private String email;
	private String password;
	private String fullname;

	public Users() {
	}
	
	public Users(Integer userId, String email, String fullName, String password) {
		this(email, fullName, password);
		this.usersId = userId;
	}
	

	public Users(String email,String fullname,String password) {
		super();
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "users_id", unique = true, nullable = false)
	public Integer getUsersId() {
		return this.usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	@Column(name = "email", nullable = false, length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 15)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullname", nullable = false, length = 30)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
