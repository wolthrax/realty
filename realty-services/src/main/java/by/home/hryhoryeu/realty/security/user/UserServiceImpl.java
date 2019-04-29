package by.home.hryhoryeu.realty.security.user;

import by.home.hryhoryeu.realty.dba.dao.user.IUserDao;
import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.security.role.IRoleService;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Scope("singleton")
@Transactional
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;
    private final BCryptPasswordEncoder passwordEncoder;
    private final IRoleService roleService;

    public UserServiceImpl(IUserDao userDao, BCryptPasswordEncoder passwordEncoder, IRoleService roleService) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Override
    public Long setUser(User user) {
        Role role = roleService.findByName(Roles.USER.getRoleName());
        List<Role> roleList = Arrays.asList(role);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(roleList);

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
        return userDao.findByLogin(login);
    }
}
