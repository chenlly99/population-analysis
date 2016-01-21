package com.unicom.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 道路
 * @author chenlly
 *
 */
@Component
public class UnicomResultRoadVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	
	private UnicomBaseRoadpointVO unicomBaseRoadpointVO;
	
	private String velocity;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	
	private String cdStartTime; //查询条件，起始时间
	
	private String cdEndTime;  //查询条件，结束时间
	
	private String roadName; //查询条件，道路名称

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public UnicomBaseRoadpointVO getUnicomBaseRoadpointVO() {
		return unicomBaseRoadpointVO;
	}

	public void setUnicomBaseRoadpointVO(UnicomBaseRoadpointVO unicomBaseRoadpointVO) {
		this.unicomBaseRoadpointVO = unicomBaseRoadpointVO;
	}

	public String getVelocity() {
		return velocity;
	}

	public void setVelocity(String velocity) {
		this.velocity = velocity;
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

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}


	
}
