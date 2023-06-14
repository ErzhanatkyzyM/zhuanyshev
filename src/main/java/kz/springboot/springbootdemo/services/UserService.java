package kz.springboot.springbootdemo.services;

import kz.springboot.springbootdemo.entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    Users getUserByEmail(String email);

    Users createUser(Users user);

    Users saveUser(Users user);

}
