package com.netease.music.platform.report.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.netease.music.platform.report.Model.Report;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netease.music.platform.report.Service.ReportService;
import com.netease.music.platform.report.DAO.ReportDAO;

import java.io.IOException;
import java.util.List;

@Service(value = "ReportServiceImpl")
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDAO reportDAO;

    @Override
    public Report getReport(int id) {
        return reportDAO.getReport(id);
    }

    @Override
    public List<Report> getReportList() {
        return reportDAO.getReportList();
    }

    @Override
    public Report insertReport(Report report) {
        reportDAO.insertReport(report);

        return reportDAO.getReport(report.getId());
    }

    @Override
    public Report updateReport(int id, Report report) {
        reportDAO.updateReport(id, report);
        return reportDAO.getReport(id);
    }

    @Override
    public void deleteReport(int id) {
        reportDAO.deleteReport(id);
    }

    @Override
    public JSONObject getThirdPartyData(String url) {
        try{
            return JSONObject.parseObject(Request.Get(url).execute().returnContent().asString());
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
