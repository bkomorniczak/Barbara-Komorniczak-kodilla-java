package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private Employee johnSmith = new Employee("John", "Smith");
    private Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    private Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    private Company softwareMachine = new Company("Software Machine");
    private Company dataMaesters = new Company("Data Maesters");
    private Company greyMatter = new Company("Grey Matter");

    private int softwareMachineId;
    private int dataMaestersId;
    private int greyMatterId;

    @Before
    public void createCompanies(){
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        softwareMachineId = softwareMachine.getId();
        dataMaestersId = dataMaesters.getId();
        greyMatterId = greyMatter.getId();
    }

    @Test
    public void testFindByLastname() {
        //Given

        //When
        List<Employee> actualEmployee = employeeDao.findByLastname("Smith");

        //Then
        Assert.assertEquals(1, actualEmployee.size());
    }

    @Test
    public void testFindByFirstThreeLetters() {
        //Given

        //When
        List<Company> greyCompany = companyDao.findByFirstThreeLetters("Sof");

        //Then
        Assert.assertEquals(1, greyCompany.size());
    }
    @After
    public void doTheCleanUp() {
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
