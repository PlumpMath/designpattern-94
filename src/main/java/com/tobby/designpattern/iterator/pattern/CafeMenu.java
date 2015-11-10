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
package com.tobby.designpattern.iterator.pattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年11月10日 下午4:41:34
 */
public class CafeMenu implements Menu {

	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
