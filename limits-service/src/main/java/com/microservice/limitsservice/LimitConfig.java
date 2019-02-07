package com.microservice.limitsservice;

public class LimitConfig {
	
	private int max;
	private int min;
	protected LimitConfig()
	{
		
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public LimitConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

}
