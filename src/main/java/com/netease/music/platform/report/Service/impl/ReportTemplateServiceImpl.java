package com.netease.music.platform.report.Service.impl;


import com.netease.music.platform.report.Model.ReportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netease.music.platform.report.Service.ReportTemplateService;
import com.netease.music.platform.report.DAO.ReportTemplateDAO;

import java.util.List;

@Service(value = "ReportTemplateServiceImpl")
public class ReportTemplateServiceImpl implements ReportTemplateService {

    @Autowired
    private ReportTemplateDAO reportTemplateDAO;

    @Override
    public ReportTemplate getReportTemplate(int id) {
        return reportTemplateDAO.getReportTemplate(id);
    }

    @Override
    public List<ReportTemplate> getReportTemplateList() {
        return reportTemplateDAO.getReportTemplateList();
    }

    @Override
    public ReportTemplate insertReportTemplate(ReportTemplate reportTemplate) {
        reportTemplateDAO.insertReportTemplate(reportTemplate);

        return reportTemplateDAO.getReportTemplate(reportTemplate.getId());
    }

    @Override
    public ReportTemplate updateReportTemplate(int id, ReportTemplate reportTemplate) {
        reportTemplateDAO.updateReportTemplate(id, reportTemplate);
        return reportTemplateDAO.getReportTemplate(id);
    }

    @Override
    public void deleteReportTemplate(int id) {
        reportTemplateDAO.deleteReportTemplate(id);
    }
}
