package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CwCompetitionMapper;
import com.tencent.wxcloudrun.domain.common.CwCompetition;
import com.tencent.wxcloudrun.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yang
 * @date 2023/6/13
 */
@Service
public class CompetitionServiceImpl implements CompetitionService {

    final CwCompetitionMapper cwCompetitionMapper;

    public CompetitionServiceImpl(@Autowired CwCompetitionMapper cwCompetitionMapper) {
        this.cwCompetitionMapper = cwCompetitionMapper;
    }

    @Override
    public void addCompetition(CwCompetition cwCompetition) {
        cwCompetitionMapper.insert(cwCompetition);
    }
}
