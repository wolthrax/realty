package by.home.hryhoryeu.realty.services.user;

import by.home.hryhoryeu.realty.dba.dao.user.IUserDao;
import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.enums.Status;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.services.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Scope("singleton")
@Transactional
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;
    private final IRoleService roleService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(IUserDao userDao,
                           IRoleService roleService,
                           PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    @Override
    public Long setUser(User user) {
        Role role = roleService.findByName(Roles.USER.getRoleName());
        List<Role> roleList = Collections.singletonList(role);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(roleList);
        user.setStatus(Status.ACTIVE);

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