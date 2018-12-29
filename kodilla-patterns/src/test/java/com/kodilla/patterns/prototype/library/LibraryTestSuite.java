package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        Book book1 = new Book("Kubuś Puchatek","Nawet nie Wiem", LocalDate.of(1920,11,2));
        Book book2 = new Book("1984","George Orwell", LocalDate.of(1938,3,21));
        Book book3 = new Book("Lord Jim","Joseph Conrad", LocalDate.of(1971,2,13));

        Library library = new Library("My Library");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        Assert.assertEquals(3,library.books.size());
        System.out.println(library.getName()+ " size: " + library.books.size());

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My shallow copied Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(3,clonedLibrary.books.size());
        System.out.println(clonedLibrary.getName()+ " size: " + clonedLibrary.books.size());

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My deep copied Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(3,deepClonedLibrary.books.size());
        System.out.println(deepClonedLibrary.getName()+ " size: " + deepClonedLibrary.books.size());

        // removing 1 book from list
        library.getBooks().remove(book1);

        Assert.assertEquals(2,library.books.size());
        System.out.println(library.getName()+ " size: " + library.books.size());

        Assert.assertEquals(2,clonedLibrary.books.size());
        System.out.println(clonedLibrary.getName()+ " size: " + clonedLibrary.books.size());

        Assert.assertEquals(3,deepClonedLibrary.books.size());
        System.out.println(deepClonedLibrary.getName()+ " size: " + deepClonedLibrary.books.size());


    }

}
