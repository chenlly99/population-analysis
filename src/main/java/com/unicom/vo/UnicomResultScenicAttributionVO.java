package com.unicom.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 归属地数量
 * @author chenlly
 *
 */
@Component
public class UnicomResultScenicAttributionVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	private UnicomBaseScenicVO unicomBaseScenicVO;
	private UnicomBaseCityinfoVO unicomBaseCityinfoVO;
	private int  attriNumber; //归属地量
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

	

	public UnicomBaseCityinfoVO getUnicomBaseCityinfoVO() {
		return unicomBaseCityinfoVO;
	}

	public void setUnicomBaseCityinfoVO(UnicomBaseCityinfoVO unicomBaseCityinfoVO) {
		this.unicomBaseCityinfoVO = unicomBaseCityinfoVO;
	}

	public int getAttriNumber() {
		return attriNumber;
	}

	public void setAttriNumber(int attriNumber) {
		this.attriNumber = attriNumber;
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
