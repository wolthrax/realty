package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.security.dto.AuthenticationDto;
import by.home.hryhoryeu.realty.security.services.JwtTokenProvider;
import by.home.hryhoryeu.realty.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthenticationRestController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody AuthenticationDto authenticationDto) {

        try {

            String login = authenticationDto.getLogin();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login,
                    authenticationDto.getPassword()));
            User user = userService.findByLogin(login);

            if (user == null) {
                throw new UsernameNotFoundException("User not found");
            }

            String token = jwtTokenProvider.createToken(login, user.getRoles());
            Map<Object, Object> response = new HashMap<>();
            response.put("login", login);
            response.put("token", token);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Bad credentials");
        }
    }

}
