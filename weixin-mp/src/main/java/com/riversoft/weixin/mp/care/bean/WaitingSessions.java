package com.riversoft.weixin.mp.care.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by exizhai on 11/22/2015.
 */
public class WaitingSessions {
	
	private int count;
	
	@JsonProperty("waitcaselist")
	private List<Session> sessions;
	
	/**
	 * 总的未处理session数
	 * 
	 * @return 返回session数目
	 */
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * 只会返回前100个未处理session
	 * 
	 * @return 返回session列表
	 */
	public List<Session> getSessions() {
		return sessions;
	}
	
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
}
