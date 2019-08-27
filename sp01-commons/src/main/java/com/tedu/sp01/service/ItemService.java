package com.tedu.sp01.service;

import java.util.List;

import com.tedu.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	/**
	 * 在订单保存时减少库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}