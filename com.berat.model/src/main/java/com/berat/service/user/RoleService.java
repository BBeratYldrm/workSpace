package com.berat.service.user;

import java.util.List;

import com.berat.domain.user.Role;

public interface RoleService {

	Role saveRole(Role role);

	Role updateRole(Role role);

	Role deleteRole(Role role);

	Role findRoleById(long id);

	Role findRoleByName(String roleName);

	List<Role> findAllRoles();

}
