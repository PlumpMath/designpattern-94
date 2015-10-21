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
package com.tobby.designpattern.observer.sanguo.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 下午3:52:40
 */
public class ChuGuo implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("楚国：观察到韩非子活动，开始动作了...");
		happy(arg.toString());
		System.out.println("楚国：真被乐死了\n");
	}

	private void happy(String context){
		System.out.println("楚国：因为" +context+",——所以我快乐呀！" );
	}

}
