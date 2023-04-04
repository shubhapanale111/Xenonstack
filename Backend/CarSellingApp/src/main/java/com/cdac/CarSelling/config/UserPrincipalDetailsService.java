package com.cdac.CarSelling.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cdac.CarSelling.model.User;
import com.cdac.CarSelling.repository.UserRepository;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        System.out.println("User: "+ user.toString());
        return new UserPrincipal(user);
    }
}
