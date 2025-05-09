package com.payment.paymentapi.controllers;

import com.payment.paymentapi.domain.entities.document.PDF;
import com.payment.paymentapi.services.PDFService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/document")
public class PDFController {

  private final PDFService service;

  public PDFController(PDFService pdfService) {
    this.service = pdfService;
  }

  @PostMapping("/pdf")
  public void generatePDF(@RequestBody PDF pdf, HttpServletResponse response) {
    try {
      Path file = Paths.get(service.generatePaymentPDF(pdf).getAbsolutePath());

      if (Files.exists(file)){
        response.setContentType("application/pdf");
        response.addHeader("Content-Disposition", "attachment; filename"+ file.getFileName());
        Files.copy(file, response.getOutputStream());
        response.getOutputStream().flush();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
