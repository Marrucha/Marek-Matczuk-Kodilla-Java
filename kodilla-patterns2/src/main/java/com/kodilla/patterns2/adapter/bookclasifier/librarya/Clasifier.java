package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import java.util.Set;

public interface Clasifier {
    int publicationYearMedian(Set<Book> bookSet);
}