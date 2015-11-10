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

import java.util.ArrayList;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年11月10日 下午2:43:40
 */
public class PancakeHouseIterator implements Iterator {

	private ArrayList<MenuItem> items;

	private int index = 0;

	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (index >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		return items.get(index++);
	}

}
