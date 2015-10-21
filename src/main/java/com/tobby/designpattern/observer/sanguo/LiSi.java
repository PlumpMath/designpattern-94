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
 * @date 2015年10月21日 下午1:57:27
 */
public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
		this.reportToQiShiHuang(context);
		System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
	}

	private void reportToQiShiHuang(String reportContext){
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
	}
}
