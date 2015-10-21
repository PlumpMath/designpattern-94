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
package com.tobby.designpattern.strategy.sanguo.strategy;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 上午11:20:21
 */
public class Zhaoyun {

	public static void main(String[] args) {
		StrategyOperation operation = new StrategyOperation();
		System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
		operation.setStrategy(new BackDoor()); //拿到妙计
		operation.operate(); //拆开执行
		System.out.println("-----------------------------------------------\n");
		//刘备乐不思蜀了，拆第二个了
		System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
		operation.setStrategy(new GivenGreenLight());
		operation.operate(); //执行了第二个锦囊了
		System.out.println("-----------------------------------------------\n");
		//孙权的小兵追了，咋办？拆第三个
		System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
		operation.setStrategy(new BlockEnemy());
		operation.operate(); //孙夫人退兵
		System.out.println("-----------------------------------------------");
	}
}
