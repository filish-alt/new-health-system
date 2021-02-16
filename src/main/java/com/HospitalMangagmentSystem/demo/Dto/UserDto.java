package com.HospitalMangagmentSystem.demo.Dto;

import com.HospitalMangagmentSystem.demo.domain.Role;
import org.hibernate.annotations.NaturalId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class UserDto {
    private String username;
    private String address;
    private String department;
    private String designation;
    private String dob;
    private String education;
    private String password;
    private String first;
    private String gender;
    private String last;
    private String mobile;
    private String email;
    private Set<Role> roles = new HashSet<>();


    public String getUsername() {
        return username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDob() {
        return dob;
    }

    public String getEducation() {
        return education;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst() {
        return first;
    }

    public String getGender() {
        return gender;
    }

    public String getLast() {
        return last;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
