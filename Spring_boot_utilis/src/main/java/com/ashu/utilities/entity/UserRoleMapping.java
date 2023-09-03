package com.ashu.utilities.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class UserRoleMapping {

	@Entity
	class UserDetailsEntity {

		@Id
		Long id;
		@ManyToMany
		Set<RoleDetailsEntity>likeusers;

	}

	@Entity
	class RoleDetailsEntity {

		@Id
		Long Id;
		@ManyToMany
		Set<UserDetailsEntity>likerole;
	}
}