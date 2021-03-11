package com.itstep.restserver.model;

import java.util.Set;

public class User {
    Long id;
    String email;
    String password;
    String fullname;
    Set<Role> roles;
}
