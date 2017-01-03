package roman.springboot.demo.dao.sql;


import roman.springboot.demo.domain.Person;

/**
 * Created by roman.luo on 2016/11/17.
 */
public interface PersonDaoSql {

    Person queryById(String id);

}
