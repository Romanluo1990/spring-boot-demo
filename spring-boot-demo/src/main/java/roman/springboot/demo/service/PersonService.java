package roman.springboot.demo.service;


import roman.springboot.demo.domain.Person;

/**
 * Created by roman.luo on 2016/11/17.
 */
public interface PersonService {

    Person queryById(String id);

}
