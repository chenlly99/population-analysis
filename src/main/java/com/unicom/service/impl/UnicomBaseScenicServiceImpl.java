package com.unicom.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.unicom.dao.UnicomBaseScenicMapper;
import com.unicom.service.IUnicomBaseScenicService;
import com.unicom.vo.UnicomBaseScenicVO;
import com.unicom.vo.UnicomResultRoadVO;
import com.unicom.vo.UnicomResultScenicAttributionVO;
import com.unicom.vo.UnicomResultScenicBscoverVO;
import com.unicom.vo.UnicomResultScenicInoutVO;


@Service
public class UnicomBaseScenicServiceImpl implements IUnicomBaseScenicService {
	

	

	@Resource
	private UnicomBaseScenicMapper unicomBaseScenicMapper;


	@Override
	public List<UnicomBaseScenicVO> findScenic(UnicomBaseScenicVO unicomBaseScenicVO) {
		return unicomBaseScenicMapper.queryScenic(unicomBaseScenicVO);
	}


	@Override
	public List<UnicomResultRoadVO> findRoad(UnicomResultRoadVO unicomResultRoadVO) {
		return unicomBaseScenicMapper.queryRoad(unicomResultRoadVO);
	}

	@Override
	public List<UnicomResultScenicBscoverVO> findScenicBscover(UnicomResultScenicBscoverVO unicomResultScenicBscoverVO) {
		return unicomBaseScenicMapper.queryScenicBscover(unicomResultScenicBscoverVO);
	}

	
	@Override
	public List<UnicomResultScenicInoutVO> findScenicInout(
			UnicomResultScenicInoutVO unicomResultScenicInoutVO) {
		return unicomBaseScenicMapper.queryScenicInout(unicomResultScenicInoutVO);
	}


	@Override
	public List<UnicomResultScenicAttributionVO> findScenicAttribution(
			UnicomResultScenicAttributionVO unicomResultScenicAttributionVO) {
		return unicomBaseScenicMapper.queryScenicAttribution(unicomResultScenicAttributionVO);
	}


	public UnicomBaseScenicMapper getUnicomBaseScenicMapper() {
		return unicomBaseScenicMapper;
	}

	public void setUnicomBaseScenicMapper(
			UnicomBaseScenicMapper unicomBaseScenicMapper) {
		this.unicomBaseScenicMapper = unicomBaseScenicMapper;
	}

}
