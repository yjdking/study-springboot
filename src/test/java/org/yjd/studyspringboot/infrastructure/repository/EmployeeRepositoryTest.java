package org.yjd.studyspringboot.infrastructure.repository;

import org.yjd.studyspringboot.domain.EmployeeRepository;
import org.yjd.studyspringboot.infrastructure.persistence.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryTest {

    private ApplicationContext ctx = null;
    private EmployeeRepository employeeRepository = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
        employeeRepository = ctx.getBean(EmployeeRepository.class);

        // studentDAO = (StudentDAO)ctx.getBean("studentDAO");
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void testFindByName() { //throws Exception {
        Employee employee = employeeRepository.findByName("yjd");

        if (employee != null) {
            System.out.println("id: " + employee.getId() + "name: " + employee.getName() + "age: " + employee.getAge());
        }
    }

    @Test
    public void findByNameInOrAgeLessThan() {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("test1");
        nameList.add("test2");
        nameList.add("test3");

        List<Employee> employeeList = employeeRepository.findByNameInOrAgeLessThan(nameList, 21);
        if (employeeList != null) {
            for (Employee employeeTmp : employeeList) {
                System.out.println("id: " + employeeTmp.getId() + " , name: " + employeeTmp.getName() + " , age: " + employeeTmp.getAge());
            }
        }
    }

    @Test
    public void testGetEmployeeByMaxId() {
        Employee employee = employeeRepository.getEmployeeByMaxId();

        if (employee != null) {
            System.out.println("id: " + employee.getId() + "name: " + employee.getName() + "age: " + employee.getAge());
        }
    }

    @Test
    public void queryParams1() { //throws Exception {
        List<Employee> employeeList = employeeRepository.queryParams1("test1", 20);

        if (employeeList != null) {
            for (Employee employeeTmp : employeeList) {
                System.out.println("id: " + employeeTmp.getId() + " , name: " + employeeTmp.getName() + " , age: " + employeeTmp.getAge());
            }
        }
    }

    @Test
    public void queryLike1() { //throws Exception {
        List<Employee> employeeList = employeeRepository.queryLike1("test");

        if (employeeList != null) {
            for (Employee employeeTmp : employeeList) {
                System.out.println("id: " + employeeTmp.getId() + " , name: " + employeeTmp.getName() + " , age: " + employeeTmp.getAge());
            }
        }
    }
    //错误的实例
    /*@Test
    public void findName() { //throws Exception {
        Employee employee = employeeRepository.findName("yjd");

        if(employee != null) {
            System.out.println("id: " + employee.getId() + "name: " + employee.getName() + "age: " + employee.getAge());
        }
    }*/
}