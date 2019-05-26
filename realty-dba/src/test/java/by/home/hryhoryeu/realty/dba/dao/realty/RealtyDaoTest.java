package by.home.hryhoryeu.realty.dba.dao.realty;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
public class RealtyDaoTest {

    @Autowired
    private IRealtyDao realtyDao;

}
