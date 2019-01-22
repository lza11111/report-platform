package com.netease.music.platform.report.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import com.netease.music.platform.report.Model.Report;
import com.netease.music.platform.report.Service.ReportService;

@RestController
public class ReportController {

    private Logger log = LoggerFactory.getLogger(ReportController.class);

    @Resource(name = "ReportServiceImpl")
    private ReportService reportService;


    @GetMapping("/api/report/{id}")
    public Report getReportById(@PathVariable int id){

        Report report = reportService.getReport(id);
        return report;
    }

    @GetMapping("/api/reports")
    public List<Report> getReportList(){

        return reportService.getReportList();
    }

    @PostMapping("/api/report")
    public Report insertReport(@RequestBody Report report){

        return reportService.insertReport(report);
    }

    @PutMapping("/api/report/{id}")
    public Report updateReport(@PathVariable int id, @RequestBody Report report){

        return reportService.updateReport(id, report);
    }

    @DeleteMapping("/api/report/{id}")
    public String deleteReport(@PathVariable int id){

        reportService.deleteReport(id);
        return "OK";
    }
}
