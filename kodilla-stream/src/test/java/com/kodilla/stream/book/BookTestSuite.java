package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.*;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0,books.size())
                .filter(b->books.get(b).getYearOfPublication()>2007)
                .map(b->1) // no row with count
                .sum(); //count()


        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
