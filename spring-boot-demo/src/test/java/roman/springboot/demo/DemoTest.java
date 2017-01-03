package roman.springboot.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import roman.springboot.demo.service.PersonService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by roman.luo on 2016/12/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 指定测试用例的运行器 这里是指定了Junit4
@SpringBootTest
public class DemoTest {

    @Autowired
    private PersonService personService;

    @Autowired
    private DataSource dataSource;

    @Before
    public void initDataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.prepareStatement("create table person(id int primary key, name varchar(255), age int)").execute();
        connection.prepareStatement("insert into person VALUES (1,'Tom',18)").execute();
        connection.close();
    }

    @Test
    public void testPersonService(){
        Assert.assertTrue("Tom".equals(personService.queryById("1").getName()));
    }
}
