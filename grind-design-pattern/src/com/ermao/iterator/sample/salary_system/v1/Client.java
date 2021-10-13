package com.ermao.iterator.sample.salary_system.v1;

import com.ermao.iterator.sample.salary_system.common.PayModel;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ermao
 * Date: 2021/10/13 20:25
 */
public class Client {
	public static void main(String[] args) {
		PayManager payManager = new PayManager();
		payManager.calculatePay();
		Collection<PayModel> payList = payManager.getList();
		Iterator<PayModel> iterator = payList.iterator();
		System.out.println("已有的工资列表：");
		while (iterator.hasNext()) {
			PayModel next = iterator.next();
			System.out.println(next);
		}

		SalaryManager salaryManager = new SalaryManager();
		salaryManager.calculatePay();

		PayModel[] pms = salaryManager.getPms();
		System.out.println("新的工资数组：");
		for (PayModel pm : pms) {
			System.out.println(pm);
		}
	}
}
