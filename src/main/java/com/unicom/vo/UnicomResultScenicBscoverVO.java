package com.unicom.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 景区基站覆盖人数
 * @author chenlly
 *
 */
@Component
public class UnicomResultScenicBscoverVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	private UnicomBaseScenicVO unicomBaseScenicVO;
	private double longitude; //基站经度
	private double  latitude; //基站纬度
	private int coverNumber;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	
	private String cdStartTime; //查询条件，起始时间
	
	private String cdEndTime;  //查询条件，结束时间
	
	private String cdScenicId; //查询条件，景区ID

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UnicomBaseScenicVO getUnicomBaseScenicVO() {
		return unicomBaseScenicVO;
	}

	public void setUnicomBaseScenicVO(UnicomBaseScenicVO unicomBaseScenicVO) {
		this.unicomBaseScenicVO = unicomBaseScenicVO;
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

	public int getCoverNumber() {
		return coverNumber;
	}

	public void setCoverNumber(int coverNumber) {
		this.coverNumber = coverNumber;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCdStartTime() {
		return cdStartTime;
	}

	public void setCdStartTime(String cdStartTime) {
		this.cdStartTime = cdStartTime;
	}

	public String getCdEndTime() {
		return cdEndTime;
	}

	public void setCdEndTime(String cdEndTime) {
		this.cdEndTime = cdEndTime;
	}

	public String getCdScenicId() {
		return cdScenicId;
	}

	public void setCdScenicId(String cdScenicId) {
		this.cdScenicId = cdScenicId;
	}

	
}
