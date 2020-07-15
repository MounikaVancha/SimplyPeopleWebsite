package com.simplypeople.entity;
// Generated 6 May, 2019 11:09:10 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Projectmanager generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Projectmanager.findAll", query = "SELECT u FROM Projectmanager u ORDER BY u.fullname"),
	@NamedQuery(name = "Projectmanager.findByEmail", query = "SELECT u FROM Projectmanager u WHERE u.email = :email"),
	@NamedQuery(name = "Projectmanager.countAll", query = "SELECT Count(*) FROM Projectmanager u"),
	@NamedQuery(name = "Projectmanager.checkLogin", query = "SELECT u FROM Projectmanager u WHERE u.email = :email AND password = :password")
})
@Table(name = "projectmanager", catalog = "simplypeople")
public class Projectmanager implements java.io.Serializable {

	private Integer pmid;
	private int pid;
	private String email;
	private String password;
	private String fullname;

	public Projectmanager() {
	}
	
	public Projectmanager(Integer pmid, int pid, String email,String fullname, String password ) {
		this(pid,email, fullname, password);
		this.pmid = pmid;
	}

	public Projectmanager(int pid, String email, String fullname, String password) {
		this.pid = pid;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pmid", unique = true, nullable = false)
	public Integer getPmid() {
		return this.pmid;
	}

	public void setPmid(Integer pmid) {
		this.pmid = pmid;
	}

	@Column(name = "pid", nullable = false)
	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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
