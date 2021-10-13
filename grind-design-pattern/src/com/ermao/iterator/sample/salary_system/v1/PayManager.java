package com.ermao.iterator.sample.salary_system.v1;

import com.ermao.iterator.sample.salary_system.common.PayModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 已有的工资管理对象
 * @author Ermao
 * Date: 2021/10/13 20:17
 */
public class PayManager {

	private List<PayModel> list = new ArrayList<>();

	/**
	 * 获取工资列表
	 * @return 工资列表
	 */
	public List<PayModel> getList() {
		return list;
	}

	/**
	 * 计算工资，实际上会有很多参数，但是在这里从简
	 */
	public void calculatePay() {
		// 计算工资并且吧工资信息填充到工资列表中
		// mock 一些数据
		PayModel payModel1 = new PayModel();
		PayModel payModel2 = new PayModel();
		payModel1.setPay(3800);
		payModel1.setEmployeeName("ermao");
		payModel2.setPay(4900);
		payModel2.setEmployeeName("sanmao");

		list.add(payModel1);
		list.add(payModel2);
	}

}
