/**
 * 
 */
package pattern.Memento.more;

import java.util.HashMap;
import java.util.Map;

/**
 * 多检查点演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-16
 */
public class MoreCheckPointsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator);
		originator.setState1("1");
		originator.setState2("a");
		caretaker.createCheckPoint("1st");// 第1个检查点
		originator.setState1("2");
		originator.setState2("b");
		caretaker.createCheckPoint("2nd");// 第2个检查点
		originator.setState1("3");
		originator.setState2("c");
		caretaker.createCheckPoint("3rd");// 第3个检查点
		originator.setState1("4");
		originator.setState2("d");
		caretaker.createCheckPoint("4th");// 第4个检查点
		caretaker.restoreCheckPoint("1st");// 恢复到第1个检查点的状态
	}
}

/**
 * 增强负责人角色
 * <p>
 * 常见的软件系统往往需要存储不止一个时刻的状态，而是需要存储多个时刻的状态，或者叫做多个检查点。
 * 这样发起人就可以将自己恢复到任何一个时刻的状态，有些实现在理论上允许存储无限个状态，有些只允许存储有限个状态。
 */
class Caretaker {

	// 使用一个Map来存储不同时刻的备忘录，理论上是无限个
	private Map<String, Memento> checkpoint_memento_map;

	private Originator originator;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	/**
	 * 用指定关键字的创建一个检查点
	 */
	public void createCheckPoint(String key) {
		getMap().put(key, originator.createMemento());
	}

	/**
	 * 删除指定关键字对应的检查点
	 */
	public void removeCheckPoint(String key) {
		getMap().remove(key);
	}

	/**
	 * 恢复发起人到指定关键字对应的检查点的状态
	 */
	public void restoreCheckPoint(String key) {
		originator.restoreMemento(getMap().get(key));
	}

	private Map<String, Memento> getMap() {
		if (checkpoint_memento_map == null) {
			checkpoint_memento_map = new HashMap<String, Memento>();
		}
		return checkpoint_memento_map;
	}
}

class Originator {

	// 两个状态
	private String state1;
	private String state2;

	public Memento createMemento() {
		System.out.println("state1=" + state1 + "  state2=" + state2);
		return new Memento(state1, state2);
	}

	public void restoreMemento(Memento memento) {
		setState1(memento.getState1());
		setState2(memento.getState2());
		System.out.println("state1=" + state1 + "  state2=" + state2);
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}
}

class Memento {

	private String state1;
	private String state2;

	public Memento(String state1, String state2) {
		this.state1 = state1;
		this.state2 = state2;
	}

	public String getState1() {
		return state1;
	}

	public String getState2() {
		return state2;
	}
}
