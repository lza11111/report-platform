package com.netease.music.platform.report.Service;

import java.util.List;

import com.netease.music.platform.report.Model.Report;

public interface ReportService {

    public Report getReport(int id);

    public List<Report> getReportList();

    public Report insertReport(Report report);

    public Report updateReport(int id,Report report);

    public void deleteReport(int id);
}
