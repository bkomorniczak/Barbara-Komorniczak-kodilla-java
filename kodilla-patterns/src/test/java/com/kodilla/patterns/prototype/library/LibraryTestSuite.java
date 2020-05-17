package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Set<Book> books = new HashSet<>();
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->library.getBooks().add(new Book("Title " + n, "Author" +n, LocalDate.of(1990 + n, 1 + n, 1+n))));

        Library shallowLibrary = null;
        try{
            shallowLibrary = library.shallowCopy();
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepLibrary = null;
        try{
            deepLibrary = library.deepCopy();
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title", "Auuthor", LocalDate.of(2000,2,2)));
        //Then
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowLibrary.getBooks().size());
        Assert.assertEquals(10,deepLibrary.getBooks().size());
    }
}
