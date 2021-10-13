package com.ermao.iterator.sample.salary_system.v2;

/**
 * @author Ermao
 * Date: 2021/10/13 22:18
 */
public interface Iterator {
	void first();
	void next();
	boolean isDone();
	Object currentItem();
}
