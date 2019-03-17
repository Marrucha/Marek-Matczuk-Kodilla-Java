package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyEmployeeSearchFacadeTest {

    @Autowired
    private CompanyEmployeeSearchFacade companyEmployeeSearchFacade;
    @Autowired
    private CompanyDao companyDao;

    private ArrayList<Company> resultCompanyList = new ArrayList<>();
    private ArrayList<Employee> resultEmployeeList = new ArrayList<>();


    @Test
    public void retrieveCompanyLikeTest() {

/*        //Given
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
        companyDao.save(ubisoft);
        companyDao.save(blizzard);

        resultCompanyList.add(microsoft);
        resultCompanyList.add(ubisoft);

        resultEmployeeList.add(janKowalski);
        resultEmployeeList.add(agnieszkaHolland);
        //When
        List<Company> queryResult = companyEmployeeSearchFacade.retrieveCompanyLike("oft");
        //Then
        Assert.assertEquals(resultCompanyList.size(), queryResult.size());
        //CleanUp
        try {
            companyDao.delete(microsoft);
            companyDao.delete(ubisoft);
            companyDao.delete(blizzard);
        } catch (Exception e) {
            //do nothing
        }*/

    }

    @Test
    public void retrieveEmployeeLikeTest() {

/*        //Given

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
        companyDao.save(ubisoft);
        companyDao.save(blizzard);

        resultCompanyList.add(microsoft);
        resultCompanyList.add(ubisoft);

        resultEmployeeList.add(janKowalski);
        resultEmployeeList.add(agnieszkaHolland);


        //When
        List<Employee> queryResult = companyEmployeeSearchFacade.retrieveEmployeeLike("als");
        //Then
        Assert.assertEquals(resultEmployeeList.size(), queryResult.size());

        try {
            companyDao.delete(microsoft);
            companyDao.delete(ubisoft);
            companyDao.delete(blizzard);
        } catch (Exception e) {
            //do nothing
        }*/
    }
}
