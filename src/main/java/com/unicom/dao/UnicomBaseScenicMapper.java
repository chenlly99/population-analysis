package com.unicom.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.unicom.vo.UnicomBaseScenicVO;
import com.unicom.vo.UnicomResultRoadVO;
import com.unicom.vo.UnicomResultScenicAttributionVO;
import com.unicom.vo.UnicomResultScenicBscoverVO;
import com.unicom.vo.UnicomResultScenicInoutVO;

@MapperScan
public interface UnicomBaseScenicMapper {
	
	
	public List<UnicomBaseScenicVO> queryScenic(UnicomBaseScenicVO unicomBaseScenicVO);	
	
	public List<UnicomResultRoadVO> queryRoad(UnicomResultRoadVO unicomResultRoadVO);
	
	public List<UnicomResultScenicBscoverVO> queryScenicBscover(UnicomResultScenicBscoverVO unicomResultScenicBscoverVO);	
	
	public List<UnicomResultScenicInoutVO> queryScenicInout(UnicomResultScenicInoutVO unicomResultScenicInoutVO);	
	
	public List<UnicomResultScenicAttributionVO> queryScenicAttribution(UnicomResultScenicAttributionVO unicomResultScenicAttributionVO);
	
	
	
	
}
