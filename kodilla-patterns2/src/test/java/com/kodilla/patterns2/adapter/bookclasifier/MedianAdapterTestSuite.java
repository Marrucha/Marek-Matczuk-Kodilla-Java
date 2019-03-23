package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testMedianAdapter() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("R.R Martin", "Gra o Tron", 1995, "111-1-125"));
        bookSet.add(new Book("R.R Martin", "Starcie Królów", 2000, "222-2-441"));
        bookSet.add(new Book("R.R Martin", "Nawałnica Mieczy", 2003, "333-3-322"));
        bookSet.add(new Book("R.R Martin", "Uczta dla Wron", 2006, "444-4-555"));
        bookSet.add(new Book("R.R Martin", "Taniec ze Smokami", 2008, "999-5-556"));
        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2003, median);
    }
}