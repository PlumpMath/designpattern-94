/*
 * Copyright (C) 2015 YUNDA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tobby.designpattern.iterator;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年11月10日 上午10:09:33
 */
public class MenuItem {

	private String name;

	private String description;

	private boolean vegetarian;

	private double price;

	/**
	 * 创建一个新的实例 MenuItem.
	 *
	 * @param name
	 * @param description
	 * @param vegetarian
	 * @param price
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean getVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

}
