package com.ermao.iterator.sample.salary_system.v2;

import com.ermao.iterator.sample.salary_system.common.PayModel;

/**
 * 新的工资管理类
 * @author Ermao
 * Date: 2021/10/13 20:22
 */
public class SalaryManager extends Aggregate {

	private PayModel[] pms;

	public PayModel[] getPms() {
		return pms;
	}

	/**
	 * 计算工资，实际上会有很多参数，但是在这里从简
	 */
	public void calculatePay() {
		// 计算工资并且吧工资信息填充到工资列表中
		// mock 一些数据
		PayModel payModel1 = new PayModel();
		PayModel payModel2 = new PayModel();
		payModel1.setPay(1700);
		payModel1.setEmployeeName("simao");
		payModel2.setPay(2800);
		payModel2.setEmployeeName("wumao");

		pms = new PayModel[2];
		pms[0] = payModel1;
		pms[1] = payModel2;
	}

	public int size() {
		return pms.length;
	}

	public Object get(int index) {
		Object object = null;
		if (index < pms.length) {
			object = pms[index];
		}
		return object;
	}

	@Override
	public Iterator createIterator() {
		return new ArrayIteratorImpl(this);
	}
}
