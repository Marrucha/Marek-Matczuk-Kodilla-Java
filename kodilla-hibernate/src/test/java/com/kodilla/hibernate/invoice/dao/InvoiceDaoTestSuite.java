package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product1 = new Product("Pasta do zębów");
        Product product2 = new Product("Mydło");
        Product product3 = new Product("Proszek do prania");
        Product product4 = new Product("Papier toaletowy");

        Item item1 = new Item(product1,new BigDecimal(12),50);
        Item item2 = new Item(product2,new BigDecimal(15),1000);
        Item item3 = new Item(product3,new BigDecimal(10),500);
        Item item4 = new Item(product4,new BigDecimal(11),520);
        Item item5 = new Item(product4,new BigDecimal(13),567);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product4.getItems().add(item5);

        Invoice invoice1 = new Invoice("BB1234567");
        Invoice invoice2 = new Invoice("B121234567");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);

        //When

        /* productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);*/

        invoiceDao.save(invoice1);
        int invoiceTest1 = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoiceTest2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, invoiceTest1);
        Assert.assertNotEquals(0, invoiceTest2);

        try{
        /*  productDao.delete(product1);
            productDao.delete(product2);
            productDao.delete(product3);
            productDao.delete(product4);

            itemDao.delete(item1);
            itemDao.delete(item2);
            itemDao.delete(item3);
            itemDao.delete(item4);*/

            invoiceDao.delete(invoice1);
            invoiceDao.delete(invoice1);

        }
        catch (Exception e) {
            //do nothing
        }

    }


}
