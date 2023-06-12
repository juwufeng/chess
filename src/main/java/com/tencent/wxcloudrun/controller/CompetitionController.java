package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.domain.common.CwCompetition;
import com.tencent.wxcloudrun.dto.CompetitionRequest;
import com.tencent.wxcloudrun.service.CompetitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author yang
 * @date 2023/6/13
 */
@Controller
@RequestMapping("competition")
@Slf4j
public class CompetitionController {

    @Resource
    CompetitionService competitionService;

    /**
     * 增加比赛
     *
     * @param request 请求
     * @return {@link ApiResponse}
     */
    @PostMapping(value = "/api/add")
    ApiResponse addCompetition(@RequestBody CompetitionRequest request) {
        log.info("/api/add add request");
        CwCompetition cwCompetition = new CwCompetition();
        cwCompetition.setCompetitionName(request.getCompetitionName());
        competitionService.addCompetition(cwCompetition);
        return ApiResponse.ok();
    }
}
