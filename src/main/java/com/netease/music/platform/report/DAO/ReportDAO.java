package com.netease.music.platform.report.DAO;

import com.netease.music.platform.report.Model.Report;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


@Mapper
public interface ReportDAO {

    public Report getReport(@Param("id") int id);

    public ArrayList<Report> getReportList();

    public void insertReport(Report report);

    public void updateReport(@Param("id") int id, @Param("report") Report report);

    public void deleteReport(@Param("id") int id);


}
