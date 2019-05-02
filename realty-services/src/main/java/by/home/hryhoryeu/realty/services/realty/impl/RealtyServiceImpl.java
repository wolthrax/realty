package by.home.hryhoryeu.realty.services.realty.impl;

import by.home.hryhoryeu.realty.services.realty.IRealtyService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope("singleton")
@Transactional
public class RealtyServiceImpl implements IRealtyService {
}
