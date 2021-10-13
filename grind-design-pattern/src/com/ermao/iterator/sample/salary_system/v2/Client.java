package com.ermao.iterator.sample.salary_system.v2;

import com.ermao.iterator.sample.salary_system.common.PayModel;

/**
 * @author Ermao
 * Date: 2021/10/13 22:36
 */
public class Client {
	public static void main(String[] args) {
		PayManager payManager = new PayManager();
		payManager.calculatePay();
		System.out.println("旧的工资列表：");
		Iterator it = payManager.createIterator();
		iterate(it);

		SalaryManager sm = new SalaryManager();
		sm.calculatePay();
		System.out.println("旧的工资列表：");
		it = sm.createIterator();
		iterate(it);
	}

	private static void iterate(Iterator it) {
		it.first();
		while (!it.isDone()) {
			PayModel payModel = (PayModel) it.currentItem();
			System.out.println(payModel);
			it.next();
		}
	}
}
