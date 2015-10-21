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
package com.tobby.designpattern.observer.sanguo;

import java.util.ArrayList;
import java.util.List;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 下午3:17:45
 */
public class NewHanFeiZi implements Observable {

	private List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		notifyObservers("韩非子在吃饭");
	}

	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		notifyObservers("韩非子在娱乐");
	}

}
