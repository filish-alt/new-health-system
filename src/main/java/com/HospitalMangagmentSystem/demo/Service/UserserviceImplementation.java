package com.HospitalMangagmentSystem.demo.Service;

import com.HospitalMangagmentSystem.demo.Dto.AddressDto;
import com.HospitalMangagmentSystem.demo.Dto.UserDto;
import com.HospitalMangagmentSystem.demo.Exception.DataNotFoundException;

import com.HospitalMangagmentSystem.demo.domain.Address;
import com.HospitalMangagmentSystem.demo.domain.Role;
import com.HospitalMangagmentSystem.demo.domain.Rolename;
import com.HospitalMangagmentSystem.demo.domain.User;
import com.HospitalMangagmentSystem.demo.repository.RoleRepository;
import com.HospitalMangagmentSystem.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserserviceImplementation implements UserService{
    @Autowired
    UserRepository userep;

    @Autowired
RoleRepository rolrep;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public List<User> getalluser() {
        return userep.findAll();
    }

    @Override
    public User getoneuser(int id) {
        User use=userep.findById(id).orElseThrow(()->
                new DataNotFoundException("patient with id " + id + " not found") );

        return use;
    }

    @Override
    public List<User> getbyrole() {
        Set<Role> roles = new HashSet<>();
        Role role = new  Role();
        role.setName(Rolename.ROLE_ADMIN);
        roles.add(role);
        Long l = 3L;

        return userep.findUserByRoles(rolrep.findByName(Rolename.ROLE_DOCTOR).orElse(null));
    }


    @Override
    public void delteuser(int id) {

            // TODO Auto-generated method stub
        User use=userep.findById(id).orElseThrow(()->
                new DataNotFoundException("patient with id " + id + " not found") );
            userep.delete(use);
        }

    @Override
    public User updateUser(UserDto useDto, int id) {
        // TODO Auto-generated method stub
        User use;
        use = userep.findById(id).orElseThrow(()->
                new DataNotFoundException("Address with id " + id + " not found") );
        use.setFirst(useDto.getFirst());
        use.setLast(useDto.getLast());
        use.setGender(useDto.getGender());
        use.setMobile(useDto.getMobile());
        encoder.encode(useDto.getPassword());
        use.setDesignation(useDto.getDesignation());
        use.setDepartment(useDto.getDepartment());
        use.setAddress(useDto.getAddress());
        use.setEmail(useDto.getEmail());
        use.setDob(useDto.getDob());
        use.setEducation(useDto.getEducation());
        return this.userep.save(use);
    }
}
