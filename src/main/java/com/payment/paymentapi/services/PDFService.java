package com.payment.paymentapi.services;

import com.payment.paymentapi.domain.builders.document.PDFBuilder;
import com.payment.paymentapi.domain.enums.Format;
import com.payment.paymentapi.domain.enums.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

@Service
public class PDFService {
  private static final String PDF_RESOURCES = "/pdf-resources/";

  private SpringTemplateEngine templateEngine;

  @Autowired
  private PDFService(SpringTemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  public File generatePaymentPDF(
          boolean includeLogo,
          String title,
          boolean includePaymentDetails,
          boolean includeUserInfo,
          Theme theme,
          boolean includeTimestamp,
          String message,
          Format format
  ) throws Exception {

    Context context = getPaymentPdf(
            includeLogo,
            title,
            includePaymentDetails,
            includeUserInfo,
            theme,
            includeTimestamp,
            message,
            format
    );
    String html = loadAndFillTemplate(context);
    String xhtml = convertToXhtml(html);
    return renderPaymentPdf(xhtml);
  }

  private String convertToXhtml(String html) throws UnsupportedEncodingException {
    Tidy tidy = new Tidy();
    tidy.setXHTML(true);
    tidy.setIndentContent(true);
    tidy.setPrintBodyOnly(true);
    tidy.setInputEncoding("UTF-8");
    tidy.setOutputEncoding("UTF-8");
    tidy.setSmartIndent(true);
    tidy.setShowWarnings(false);
    tidy.setQuiet(true);
    tidy.setTidyMark(false);

    Document htmlDOM = tidy.parseDOM(new ByteArrayInputStream(html.getBytes()), null);

    OutputStream out = new ByteArrayOutputStream();
    tidy.pprint(htmlDOM, out);
    return out.toString();
  }

  private File renderPaymentPdf(String html) throws Exception {
    File file = File.createTempFile("paymentSummary", ".pdf");
    OutputStream outputStream = new FileOutputStream(file);
    ITextRenderer renderer = new ITextRenderer(20f * 4f / 3f, 20);
    renderer.setDocumentFromString(html, new ClassPathResource(PDF_RESOURCES).getURL().toExternalForm());
    renderer.layout();
    renderer.createPDF(outputStream);
    outputStream.close();
    file.deleteOnExit();
    return file;
  }

  private Context getPaymentPdf(
          boolean includeLogo,
          String title,
          boolean includePaymentDetails,
          boolean includeUserInfo,
          Theme theme,
          boolean includeTimestamp,
          String message,
          Format format
  ) {
    PDFBuilder builder = new PDFBuilder();

    builder.setTitle(title);
    builder.setTheme(theme);
    builder.setIncludeLogo(includeLogo);
    builder.setIncludePaymentDetails(includePaymentDetails);
    builder.setIncludeUserInfo(includeUserInfo);
    builder.setIncludeTimestamp(includeTimestamp);
    builder.setMensaje(message);
    builder.setFormat(format);

    Context context = new Context();
    context.setVariable("payment", builder.getResult());
    return context;
  }

  private String loadAndFillTemplate(Context context) {
    return templateEngine.process("placesPDF", context);
  }
}
