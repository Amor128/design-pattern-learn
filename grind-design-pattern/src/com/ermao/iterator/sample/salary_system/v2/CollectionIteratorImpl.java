package com.ermao.iterator.sample.salary_system.v2;

/**
 * @author Ermao
 * Date: 2021/10/13 22:34
 */
public class CollectionIteratorImpl implements Iterator {

	private PayManager aggregate;
	private int index = -1;

	public CollectionIteratorImpl(PayManager aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < aggregate.size()) {
			index++;
		}
	}

	@Override
	public boolean isDone() {
		if (index == aggregate.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(index);
	}
}
