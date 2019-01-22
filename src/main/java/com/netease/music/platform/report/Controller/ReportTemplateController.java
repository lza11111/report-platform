package com.netease.music.platform.report.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import com.netease.music.platform.report.Model.ReportTemplate;
import com.netease.music.platform.report.Service.ReportTemplateService;

@RestController
public class ReportTemplateController {

    private Logger log = LoggerFactory.getLogger(ReportTemplateController.class);

    @Resource(name = "ReportTemplateServiceImpl")
    private ReportTemplateService reportTemplateService;


    @GetMapping("/api/report-template/{id}")
    public ReportTemplate getReportTemplateById(@PathVariable int id){

        ReportTemplate reportTemplate = reportTemplateService.getReportTemplate(id);
        return reportTemplate;
    }

    @GetMapping("/api/report-templates")
    public List<ReportTemplate> getReportTemplateList(){

        return reportTemplateService.getReportTemplateList();
    }

    @PostMapping("/api/report-template")
    public ReportTemplate insertReportTemplate(@RequestBody ReportTemplate reportTemplate){

        return reportTemplateService.insertReportTemplate(reportTemplate);
    }

    @PutMapping("/api/report-template/{id}")
    public ReportTemplate updateReportTemplate(@PathVariable int id, @RequestBody ReportTemplate reportTemplate){

        return reportTemplateService.updateReportTemplate(id, reportTemplate);
    }

    @DeleteMapping("/api/report-template/{id}")
    public String deleteReportTemplate(@PathVariable int id){

        reportTemplateService.deleteReportTemplate(id);
        return "OK";
    }
}
