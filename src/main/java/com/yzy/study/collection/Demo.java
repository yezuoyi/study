package com.yzy.study.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Order {
	private Long id;
	private String businessNum;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessNum() {
		return businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

}

public class Demo {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<Order>();
		Order o1 = new Order();
		o1.setId(1L);
		o1.setBusinessNum("ord0001");
		Order o2 = new Order();
		o2.setId(2L);
		o2.setBusinessNum("ord0002");

		Order o3 = new Order();
		o3.setId(3L);
		o3.setBusinessNum("ord0003");

		list.add(o1);
		list.add(o2);
		list.add(o3);

		List<String> orderNums = new ArrayList<>();
		orderNums.add("ord0001");
		orderNums.add("ord0003");

		// 只留下长度等于3的，也就是ccc，其他都过滤掉，不要
		List<Order> stream = list.stream().filter(order -> {
			if (orderNums.contains(order.getBusinessNum())) {
				return false;
			} else {
				return true;
			}
		}).collect(Collectors.toList());
		// stream中只有一个ccc
		// System.out.println(stream.toString());
		for (Order o : stream) {
			System.out.println("Id=" + o.getId() + "--businessnum=" + o.getBusinessNum());
		}

	}
}
