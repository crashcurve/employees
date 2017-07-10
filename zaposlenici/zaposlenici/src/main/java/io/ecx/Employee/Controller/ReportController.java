package io.ecx.Employee.Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.ecx.Employee.Model.Employee;
import io.ecx.Employee.Repository.EmployeeRepository;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;

@Controller
public class ReportController
{

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/employees/report/pdf")
    public String generateEmployeesPDF() throws IOException, JRException
    {
        final InputStream jasperStream = this.getClass().getResourceAsStream("/templates/template_Table.jasper");
        final List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);

        final JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(employeeList);

        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ItemDataSource", itemsJRBean);

        final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, parameters, new JREmptyDataSource());

        final String fileName = (new Date().getTime() + ".pdf");
        final File pdfResource = new File(System.getProperty("user.dir") + File.separator + "employees" + fileName);
        pdfResource.createNewFile();
        JasperExportManager.exportReportToPdfFile(jasperPrint, pdfResource.getAbsolutePath());

        return "redirect:/employees";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}/report/pdf")
    public String generateEmployeesPDF(@PathVariable Integer id) throws IOException, JRException
    {
        final InputStream jasperStream = this.getClass().getResourceAsStream("/templates/template_Table.jasper");
        final List<Employee> employeeList = new ArrayList<>();
        final Employee employee = employeeRepository.findOne(id);
        employeeList.add(employee);

        final JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(employeeList);

        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ItemDataSource", itemsJRBean);

        final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, parameters, new JREmptyDataSource());

        final String fileName = (new Date().getTime() + ".pdf");
        final File pdfResource = new File(System.getProperty("user.dir") + File.separator + "employees" + fileName);
        pdfResource.createNewFile();
        JasperExportManager.exportReportToPdfFile(jasperPrint, pdfResource.getAbsolutePath());

        return "redirect:/employees/{id}";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/report/xls")
    public String generateEmployeesXLS() throws IOException, JRException
    {
        final InputStream jasperStream = this.getClass().getResourceAsStream("/templates/template_Table.jasper");
        final List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);

        final JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(employeeList);

        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ItemDataSource", itemsJRBean);

        final String fileName = (new Date().getTime() + ".xls");

        final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, parameters, new JREmptyDataSource());

        final JRXlsExporter xlsExporter = new JRXlsExporter();
        xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(System.getProperty("user.dir") + File.separator + "employees" + fileName));
        final SimpleXlsReportConfiguration xlsReportConfiguration = new SimpleXlsReportConfiguration();
        xlsReportConfiguration.setOnePagePerSheet(true);
        xlsReportConfiguration.setRemoveEmptySpaceBetweenRows(false);
        xlsReportConfiguration.setDetectCellType(true);
        xlsReportConfiguration.setWhitePageBackground(false);
        xlsExporter.setConfiguration(xlsReportConfiguration);
        xlsExporter.exportReport();
        return "redirect:/employees";
    }

}
