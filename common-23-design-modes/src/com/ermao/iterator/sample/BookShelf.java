package com.ermao.iterator.sample;

/**
 * 表示书架的类
 * @author Ermao
 * Date: 2021/10/10 14:36
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
