package com.netease.music.platform.report.DAO;

import com.netease.music.platform.report.Model.ReportTemplate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


@Mapper
public interface ReportTemplateDAO {

    public ReportTemplate getReportTemplate(@Param("id") int id);

    public ArrayList<ReportTemplate> getReportTemplateList();

    public void insertReportTemplate(ReportTemplate reportTemplate);

    public void updateReportTemplate(@Param("id") int id, @Param("reportTemplate") ReportTemplate reportTemplate);

    public void deleteReportTemplate(@Param("id") int id);


}
