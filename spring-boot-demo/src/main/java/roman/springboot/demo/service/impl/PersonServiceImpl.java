package roman.springboot.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roman.springboot.demo.dao.PersonDao;
import roman.springboot.demo.domain.Person;
import roman.springboot.demo.service.PersonService;


/**
 * Created by roman.luo on 2016/11/17.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person queryById(String id) {
        return personDao.queryById(id);
    }
}
