package com.capgemini.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.capgemini.JUNIT_Cucumber_Example_2.Book;
import com.capgemini.JUNIT_Cucumber_Example_2.Library;

import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class SearchBookSteps {
	Library library = new Library();
	List<Book> result = new ArrayList<>();
 
	@Given("^a book with the title \"(.*?)\", written by \"(.*?)\", published in \"(.*?)\"$")
	public void a_book_with_the_title_written_by_published_in(final String title, final String author, @Format("dd MMMMM yyyy") final Date published) {
		Book book = new Book(title, author, published);
		library.addBook(book);
	   
	}

	@When("^the customer searches for books published between (\\d+) and (\\d+)$")
	public void the_customer_searches_for_books_published_between_and(@Format("yyyy") final Date from, @Format("yyyy") final Date to) {
		result = library.findBooks(from, to);
	  
	}

	@Then("^(\\d+) books should have been found$")
	public void books_should_have_been_found(final int booksFound) {
		assertThat(result.size(), equalTo(booksFound));
	   
	}

	@Then("^Book (\\d+) should have the title \"(.*?)\"$")
	public void book_should_have_the_title(final int position, final String title) {
		assertThat(result.get(position - 1).getTitle(), equalTo(title));
	   
	}


}