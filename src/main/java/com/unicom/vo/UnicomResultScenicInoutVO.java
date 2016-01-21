package com.unicom.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 景区进出入人数
 * @author chenlly
 *
 */
@Component
public class UnicomResultScenicInoutVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	private UnicomBaseScenicVO unicomBaseScenicVO;
	private int inNumber; //进景区人数
	private int outNumber; //出景区人数
	private String type;//type:1 进景区，type:2 出景区
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	
	private String cdStartTime; //查询条件，起始时间
	
	private String cdEndTime;  //查询条件，结束时间
	
	private String cdScenicId; //查询条件，景区ID
	
	private String reTime;

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

	public int getInNumber() {
		return inNumber;
	}

	public void setInNumber(int inNumber) {
		this.inNumber = inNumber;
	}

	public int getOutNumber() {
		return outNumber;
	}

	public void setOutNumber(int outNumber) {
		this.outNumber = outNumber;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getReTime() {
		return reTime;
	}

	public void setReTime(String reTime) {
		this.reTime = reTime;
	}

	
	
}
