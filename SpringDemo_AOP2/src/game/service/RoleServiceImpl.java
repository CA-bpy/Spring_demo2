package game.service;

import game.pojo.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("id = " + role.getId() + "\n"
                + "roleName = " + role.getRoleName() + "\n"
                + "note = " + role.getNote() );
    }
}
