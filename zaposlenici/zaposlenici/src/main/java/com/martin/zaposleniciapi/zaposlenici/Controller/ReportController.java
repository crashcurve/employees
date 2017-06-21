package com.martin.zaposleniciapi.zaposlenici.Controller;

import com.martin.zaposleniciapi.zaposlenici.Model.Employee;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by i.mihalina on 20.6.2017..
 */@Controller
public class ReportController {


    @PutMapping("/employees/report")
    @Transactional
    public Map<String, String> generateDetailReportEmployee(@RequestBody Employee employee)
            throws IOException, JRException {
        final InputStream jasperStream = this.getClass().getResourceAsStream("/jasperreports/employees.jasper");
        final Map<String, Object> params = new HashMap<>();
        final ArrayList<EmployeeReportBean> employeesList = new ArrayList<EmployeeReportBean>();
        final JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);


        for (final PaketDaski p : otpremnica.getPaketDaskis()) {
            final EmployeeReportBean bean = new OtpremnicaReportBean();
            final List<DaskaReportBean> listaDaski = new ArrayList<DaskaReportBean>();
        }

        params.put("brojZaposlenika", employee.getId().toString());
        params.put("ime", employee.getName());
        params.put("notes", employee.getNotes());

        final JRBeanCollectionDataSource employeesListSource = new JRBeanCollectionDataSource(employeesList);
        params.put("employeeList", employeesListSource);

        final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());

        final String fileName = (new Date().getTime() + ".pdf");

        if (!(new File(System.getProperty("user.dir") + File.separator + "webapps" + File.separator + "ROOT"
                + File.separator + "content" + File.separator + "otpremnice").exists())) {
            (new File(System.getProperty("user.dir") + File.separator + "webapps" + File.separator + "ROOT"
                    + File.separator + "content" + File.separator + "otpremnice")).mkdir();
        }

        final File pdfResource = new File(System.getProperty("user.dir") + File.separator + "webapps" + File.separator
                + "ROOT" + File.separator + "content" + File.separator + "otpremnice" + File.separator + fileName);
        pdfResource.createNewFile();
        JasperExportManager.exportReportToPdfFile(jasperPrint, pdfResource.getAbsolutePath());

        final Map<String, String> pathToExport = new HashMap<>();

        pathToExport.put("url", File.separator + "content" + File.separator + "otpremnice" + File.separator + fileName);
        return pathToExport;
    }
}
