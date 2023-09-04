package com.ashu.utilities.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class UserEmpolyesMapping {

	@Entity
	class UserRoleMapping {

		@Id
		Long id;
		@ManyToMany
		Set<UserDetailsEntity> likeusers;
	}

	@Entity
	class UserDetailsEntity {

		@Id
		Long Id;
		@ManyToMany
		Set<UserRoleMapping> likerole;

	}
}