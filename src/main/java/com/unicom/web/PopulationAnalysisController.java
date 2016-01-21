package com.unicom.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.framework.base.web.BaseWebResult;
import com.unicom.service.IUnicomBaseScenicService;
import com.unicom.vo.UnicomBaseScenicVO;
import com.unicom.vo.UnicomResultRoadVO;
import com.unicom.vo.UnicomResultScenicAttributionVO;
import com.unicom.vo.UnicomResultScenicBscoverVO;
import com.unicom.vo.UnicomResultScenicInoutVO;


@Controller
public class PopulationAnalysisController {
	
	private static final Log logger = LogFactory.getLog(PopulationAnalysisController.class);
	
	@Resource
	private IUnicomBaseScenicService unicomBaseScenicServiceImpl;
	
	/**
	 * 道路
	 * @param unicomResultRoadVO
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/unicom/resultRoad", method=RequestMethod.GET ,produces = "application/json; charset=utf-8")
	public @ResponseBody String resultRoad(UnicomResultRoadVO unicomResultRoadVO,HttpSession session,HttpServletRequest request){
		BaseWebResult result = new BaseWebResult();
		List<UnicomResultRoadVO> list = unicomBaseScenicServiceImpl.findRoad(unicomResultRoadVO);
		if(list != null && !list.isEmpty() && list.size() !=0) {
			result.getData().add(list);
			result.setIsSuccess(1);
			result.setMessage("OK");
		} else {
			result.setIsSuccess(0);
			result.setMessage("ERROR");
		}
		return JSON.toJSONString(result);
	}
	
	/**
	 * 景区列表
	 * @param unicomBaseScenicVO
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/unicom/scenicList", method=RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String scenicList(UnicomBaseScenicVO unicomBaseScenicVO,HttpSession session,HttpServletRequest request,HttpServletResponse response){
		BaseWebResult result = new BaseWebResult();
		List<UnicomBaseScenicVO> list = unicomBaseScenicServiceImpl.findScenic(unicomBaseScenicVO);
		if(list != null && !list.isEmpty() && list.size() !=0) {
			result.getData().add(list);
			result.setIsSuccess(1);
			result.setMessage("OK");
		} else {
			result.setIsSuccess(0);
			result.setMessage("ERROR");
		}
		return JSON.toJSONString(result);
	}
	
	/**
	 * 景区基站覆盖数目
	 * @param UnicomResultScenicBscoverVO
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/unicom/resultScenicBscover", method=RequestMethod.GET,produces = "application/json; charset=utf-8")
	public @ResponseBody String resultScenicBscover(UnicomResultScenicBscoverVO unicomResultScenicBscoverVO,HttpSession session,HttpServletRequest request){
		BaseWebResult result = new BaseWebResult();
		List<UnicomResultScenicBscoverVO> list = unicomBaseScenicServiceImpl.findScenicBscover(unicomResultScenicBscoverVO);
		if(list != null && !list.isEmpty() && list.size() !=0) {
			result.getData().add(list);
			result.setIsSuccess(1);
			result.setMessage("OK");
		} else {
			result.setIsSuccess(0);
			result.setMessage("ERROR");
		}
		/*for(UnicomResultScenicBscoverVO vo:list) {
			System.out.println("++"+vo.getId());
			System.out.println("++"+vo.getCoverNumber());
			System.out.println("++"+vo.getLatitude());
			System.out.println("++"+vo.getLongitude());
			System.out.println("++"+vo.getUnicomBaseScenicVO().getScenicName());
			System.out.println("++"+vo.getUnicomBaseScenicVO().getId());
		}
		System.out.println("===="+JSON.toJSONString(result));*/
		return JSON.toJSONString(result);
	}
	
	/**
	 * 景区进出入统计
	 * @param UnicomResultScenicInoutVO
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/unicom/resultScenicInout", method=RequestMethod.GET ,produces = "application/json; charset=utf-8")
	public @ResponseBody String resultScenicInout(UnicomResultScenicInoutVO unicomResultScenicInoutVO,HttpSession session,HttpServletRequest request){
		BaseWebResult result = new BaseWebResult();
		List<UnicomResultScenicInoutVO> list = unicomBaseScenicServiceImpl.findScenicInout(unicomResultScenicInoutVO);
		if(list != null && !list.isEmpty() && list.size() !=0) {
			result.getData().add(list);
			result.setIsSuccess(1);
			result.setMessage("OK");
		} else {
			result.setIsSuccess(0);
			result.setMessage("ERROR");
		}
		return JSON.toJSONString(result);
	}
	
	/**
	 * 归属地分析
	 * @param unicomResultScenicAttributionVO
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/unicom/computeAttribution", method=RequestMethod.GET,produces = "application/json; charset=utf-8")
	public @ResponseBody String computeAttribution(UnicomResultScenicAttributionVO unicomResultScenicAttributionVO,HttpSession session,HttpServletRequest request){
		BaseWebResult result = new BaseWebResult();
		List<UnicomResultScenicAttributionVO> list = unicomBaseScenicServiceImpl.findScenicAttribution(unicomResultScenicAttributionVO);
		if(list != null && !list.isEmpty() && list.size() !=0) {
			result.getData().add(list);
			result.setIsSuccess(1);
			result.setMessage("OK");
		} else {
			result.setIsSuccess(0);
			result.setMessage("ERROR");
		}
		return JSON.toJSONString(result);
	}

	public IUnicomBaseScenicService getUnicomBaseScenicServiceImpl() {
		return unicomBaseScenicServiceImpl;
	}

	public void setUnicomBaseScenicServiceImpl(
			IUnicomBaseScenicService unicomBaseScenicServiceImpl) {
		this.unicomBaseScenicServiceImpl = unicomBaseScenicServiceImpl;
	}
	
	
}
