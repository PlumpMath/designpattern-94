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

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 下午1:53:24
 */
public class HanFeiZi implements IHanFeiZi {

	private ILiSi liSi = new LiSi();

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		liSi.update("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		liSi.update("韩非子在娱乐");
	}

}
