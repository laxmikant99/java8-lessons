package com.laxmikant.java8.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.laxmikant.java8.Book;

/*# Introduction of sort method 
Problem statement: How would you sort a list? How would you get a new instance of sorted list ?*/
public class SortingCollection {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Clean Code", "Uncle Bob"),
				new Book("Pragmatic UT", "Andy hunt"),
				new Book("Pragmatic UT", "David Thomas"),
				new Book("Effective java", "Joshua Bloch"));

		// java7 approach
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book a, Book b) {
				return a.getName()
						.compareTo(b.getName());
			}
		});

		// java8 aproach
		books.sort(Comparator.comparing(Book::getName));
		System.out.println(books);

		// sort by first name and then reverse order of author
		// java7 approach
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book a, Book b) {
				int i = a.getName()
						.compareTo(b.getName());
				return i == 0 ? -1 * a.getAuther()
						.compareTo(b.getAuther()) : i;
			}
		});
		System.out.println(books);
		
		// java8 approach
		books.sort(Comparator.comparing(Book::getName)
				.thenComparing(Book::getAuther, Comparator.reverseOrder()));
		System.out.println(books);
		
	}

}
