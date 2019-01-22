package com.netease.music.platform.report.Service;

import java.util.List;

import com.netease.music.platform.report.Model.ReportTemplate;

public interface ReportTemplateService {

    public ReportTemplate getReportTemplate(int id);

    public List<ReportTemplate> getReportTemplateList();

    public ReportTemplate insertReportTemplate(ReportTemplate report);

    public ReportTemplate updateReportTemplate(int id,ReportTemplate report);

    public void deleteReportTemplate(int id);
}
