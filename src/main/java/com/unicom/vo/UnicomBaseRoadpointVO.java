package com.unicom.vo;

import org.springframework.stereotype.Component;


/**
 * link
 * @author chenlly
 *
 */
@Component
public class UnicomBaseRoadpointVO {

	private static final long serialVersionUID = 1L;
	
	private String id; // 内部唯一ID
	private String roadName;
	private String linkName;
	private String margin;
	private String longlat;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	
	public String getMargin() {
		return margin;
	}
	public void setMargin(String margin) {
		this.margin = margin;
	}
	public String getLonglat() {
		return longlat;
	}
	public void setLonglat(String longlat) {
		this.longlat = longlat;
	}
	
	
}
