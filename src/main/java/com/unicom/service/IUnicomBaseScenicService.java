package com.unicom.service;

import java.util.List;

import com.unicom.vo.UnicomBaseScenicVO;
import com.unicom.vo.UnicomResultRoadVO;
import com.unicom.vo.UnicomResultScenicAttributionVO;
import com.unicom.vo.UnicomResultScenicBscoverVO;
import com.unicom.vo.UnicomResultScenicInoutVO;


public interface IUnicomBaseScenicService {
	
	
	
	public List<UnicomBaseScenicVO> findScenic(UnicomBaseScenicVO unicomBaseScenicVO);
	
	public List<UnicomResultRoadVO> findRoad(UnicomResultRoadVO unicomResultRoadVO);
	
	public List<UnicomResultScenicBscoverVO> findScenicBscover(UnicomResultScenicBscoverVO unicomResultScenicBscoverVO);
	
	public List<UnicomResultScenicInoutVO> findScenicInout(UnicomResultScenicInoutVO unicomResultScenicInoutVO);
	
	public List<UnicomResultScenicAttributionVO> findScenicAttribution(UnicomResultScenicAttributionVO unicomResultScenicAttributionVO);

	
}
