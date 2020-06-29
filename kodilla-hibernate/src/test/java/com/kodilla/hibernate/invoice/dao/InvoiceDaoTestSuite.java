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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Invoice invoice = new Invoice("invoice1");

        Item item1 = new Item(product1, new BigDecimal(1),3, new BigDecimal(4));
        Item item2 = new Item(product2, new BigDecimal(2), 4, new BigDecimal(5));

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(2, itemDao.count());
        Assert.assertNotEquals(0,id);

        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

}
