package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee janKowalski = new Employee("Jan", "Kowalski");
        Employee andrzejNowak = new Employee("Andrzej", "Nowak");
        Employee agnieszkaHolland = new Employee("Agnieszka", "Holland");

        Company microsoft = new Company("Microsoft");
        Company ubisoft = new Company("Ubisoft");
        Company blizzard = new Company("Blizzard");

        microsoft.getEmployees().add(janKowalski);
        ubisoft.getEmployees().add(andrzejNowak);
        ubisoft.getEmployees().add(agnieszkaHolland);
        blizzard.getEmployees().add(janKowalski);
        blizzard.getEmployees().add(agnieszkaHolland);

        janKowalski.getCompanies().add(microsoft);
        janKowalski.getCompanies().add(blizzard);
        andrzejNowak.getCompanies().add(ubisoft);
        agnieszkaHolland.getCompanies().add(ubisoft);
        agnieszkaHolland.getCompanies().add(blizzard);

        //When
        companyDao.save(microsoft);
        int microsoftId = microsoft.getId();
        companyDao.save(ubisoft);
        int ubisoftId = ubisoft.getId();
        companyDao.save(blizzard);
        int blizzardId = blizzard.getId();

        //Then
        Assert.assertNotEquals(0, microsoftId);
        Assert.assertNotEquals(0, ubisoftId);
        Assert.assertNotEquals(0, blizzardId);

        //CleanUp
        try {
          companyDao.delete(microsoftId);
           companyDao.delete(ubisoftId);
           companyDao.delete(blizzardId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueries(){

        //Given
        Employee janKowalski = new Employee("Jan", "Kowalski");
        Employee andrzejNowak = new Employee("Andrzej", "Nowak");
        Employee agnieszkaHolland = new Employee("Agnieszka", "Holland");

        Company microsoft = new Company("Microsoft");
        Company ubisoft = new Company("Ubisoft");
        Company blizzard = new Company("Blizzard");

        microsoft.getEmployees().add(janKowalski);
        ubisoft.getEmployees().add(andrzejNowak);
        ubisoft.getEmployees().add(agnieszkaHolland);
        blizzard.getEmployees().add(janKowalski);
        blizzard.getEmployees().add(agnieszkaHolland);

        janKowalski.getCompanies().add(microsoft);
        janKowalski.getCompanies().add(blizzard);
        andrzejNowak.getCompanies().add(ubisoft);
        agnieszkaHolland.getCompanies().add(ubisoft);
        agnieszkaHolland.getCompanies().add(blizzard);

            companyDao.save(microsoft);
            int microsoftId = microsoft.getId();
            companyDao.save(ubisoft);
            int ubisoftId = ubisoft.getId();
            companyDao.save(blizzard);
            int blizzardId = blizzard.getId();

        //When
        List<Employee> lastName = employeeDao.retrieveEmployeeLike("wals");
        List<Company> nameStartedWith = companyDao.retrieveCompanyNameLike("sof");

        //Then
        Assert.assertEquals(1, lastName.size());
        Assert.assertEquals(2, nameStartedWith.size());

        //CleanUp
       try {
          companyDao.delete(microsoft);
           companyDao.delete(ubisoft);
           companyDao.delete(blizzard);
        } catch (Exception e) {
          //do nothing
        }

    }
}