package com.wolken.caar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="registrationentity")
@NamedQueries({
	@NamedQuery(name="getByemail", query="from LoginEntity where email=:email"),
	@NamedQuery(name="deleteData", query="delete from LoginEntity where email=:email"),
	@NamedQuery(name="updatePassword",query="update LoginEntity set password=:password where email=:email")
})
public class LoginEntity {
	@Id
	private String email;
	private String password;
}
