package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Role;

import java.util.List;

public interface RoleService {
    public Role saveRole(Role role);
    public List<Role> getAllRoles();
}
