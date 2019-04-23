package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Clasifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> libraryBookMap = bookSet.stream()
                .collect(Collectors.toMap(s -> new BookSignature(s.getSignature()),
                        s -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                s.getAuthor(),
                                s.getTitle(),
                                s.getPublicationYear()
                        )));
        return medianPublicationYear(libraryBookMap);
    }
}