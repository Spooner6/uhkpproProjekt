package com.spring.dto;

import com.spring.data.Authorities;
import com.spring.data.User;

import javax.validation.Valid;
import java.util.List;

public class UserDto {

    @Valid
    List<Authorities> authorities;
    User user;

    public UserDto(List<Authorities> authorities, User user) {
        this.authorities = authorities;
        this.user = user;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public User getUser() {
        return user;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public UserDto(){

    }
}
