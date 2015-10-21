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

import java.awt.event.ItemListener;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 下午1:59:01
 */
public class Watch extends Thread {

	private HanFeiZi hanFeiZi;

	private LiSi liSi;

	private String type;

	public Watch(HanFeiZi hanFeiZi, LiSi liSi, String type) {
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}

	public void run() {
		while (true) {
			if (type.equals("breakfast")) {
				if (hanFeiZi.isHaveBreakfast()) {
					liSi.update("韩非子在吃饭");
					hanFeiZi.setHaveBreakfast(false);
				}
			} else if(this.type.equals("fun")) {
				if (this.hanFeiZi.isHaveFun()) {
					liSi.update("韩非子在娱乐");
					hanFeiZi.setHaveFun(false);
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
