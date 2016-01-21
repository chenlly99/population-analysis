package com.unicom.vo;

import org.springframework.stereotype.Component;


/**
 * 景区
 * @author chenlly
 *
 */
@Component
public class UnicomBaseScenicVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	private String scenicName;
	private double longitude;
	private double  latitude;
	private int c1;
	private int c2;
	private int c3;
	private int c4;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScenicName() {
		return scenicName;
	}
	public void setScenicName(String scenicName) {
		this.scenicName = scenicName;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	public int getC3() {
		return c3;
	}
	public void setC3(int c3) {
		this.c3 = c3;
	}
	public int getC4() {
		return c4;
	}
	public void setC4(int c4) {
		this.c4 = c4;
	}
	
	
	
	
}
