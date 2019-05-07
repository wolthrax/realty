package by.home.hryhoryeu.realty.services.user;

import by.home.hryhoryeu.realty.dba.dao.user.IUserDao;
import by.home.hryhoryeu.realty.entities.dto.UserDto;
import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.services.converters.UserConverter;
import by.home.hryhoryeu.realty.services.role.IRoleService;
import by.home.hryhoryeu.realty.utils.DateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;

@Service
@Scope("singleton")
@Transactional
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;
    private final IRoleService roleService;
    private final PasswordEncoder passwordEncoder;
    private final UserConverter userConverter;

    @Autowired
    public UserServiceImpl(IUserDao userDao,
                           IRoleService roleService,
                           PasswordEncoder passwordEncoder,
                           UserConverter userConverter) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
        this.userConverter = userConverter;
    }

    @Override
    public Long setUser(UserDto userDto) {
        User user = userConverter.dtoToUser(userDto);
        Role role = roleService.findByName(Roles.ROLE_USER);

        user.setRole(role);
        user.setPassword(passwordEncoder.encode(userDto.getPassword1()));
        try {
            user.setDayOfBirth(DateBuilder.fromString(userDto.getDayOfBirth()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return userDao.set(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User findByLogin(String login) {
        User user = userDao.findByLogin(login);
        return userDao.findByLogin(login);
    }
}
