package org.yjd.studyspringboot.domain;

import org.yjd.studyspringboot.infrastructure.persistence.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository测试
 *
 * @author yjd
 * @time 2019-07-31
 */
@RepositoryDefinition(domainClass = Employee.class, idClass = Integer.class)
public interface EmployeeRepository /*extends Repository<Employee,Integer> */ {

    public Employee findByName(String name);

    //where name like ?% and age <?
    public List<Employee> findByNameStartingWithAndAgeLessThan(String name, Integer age);

    // where name like %? and age <?
    public List<Employee> findByNameEndingWithAndAgeLessThan(String name, Integer age);

    //where name in (?,?....) or age <?
    public List<Employee> findByNameInOrAgeLessThan(List<String> names, Integer age);


    @Query("select o from Employee o where id=(select max(id) from Employee t1)")
    public Employee getEmployeeByMaxId();

    @Query("select e from Employee e where e.name=?1 and e.age=?2")
    //@Query("select o from Employee o where o.name=?1 and o.age=?2")
    public List<Employee> queryParams1(String name, Integer age);
    // 与上述作用相同
    @Query("select o from Employee o where o.name=:name and o.age=:age")
    public List<Employee> queryParams2(@Param("name") String name, @Param("age") Integer age);

    @Query("select o from Employee o where o.name like %?1%")
    public List<Employee> queryLike1(String name);

    @Query("select o from Employee o where o.name like %:name%")
    public List<Employee> queryLike2(@Param("name") String name);

    @Query(nativeQuery = true, value = "select count(1) from employee")
    public long getCount();

    @Modifying
    @Query("update Employee o set o.age = :age where o.id = :id")
    public void update(@Param("id") Integer id, @Param("age") Integer age);

}
