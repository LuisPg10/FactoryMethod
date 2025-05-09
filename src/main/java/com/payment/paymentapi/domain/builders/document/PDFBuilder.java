package com.payment.paymentapi.domain.builders.document;

import com.payment.paymentapi.domain.entities.document.PDF;
import com.payment.paymentapi.domain.enums.Format;
import com.payment.paymentapi.domain.enums.Theme;

public class PDFBuilder {
  PDF pdf;

  public PDFBuilder() {
    reset();
  }

  private void reset() {
    pdf = new PDF();
  }

  public void setIncludeLogo(boolean includeLogo) {
    pdf.setIncludeLogo(includeLogo);
  }

  public void setTitle(String title) {
    pdf.setTitle(title);
  }

  public void setIncludePaymentDetails(boolean includePaymentDetails) {
    pdf.setIncludePaymentDetails(includePaymentDetails);
  }

  public void setIncludeUserInfo(boolean includeUserInfo) {
    pdf.setIncludeUserInfo(includeUserInfo);
  }

  public void setTheme(Theme theme) {
    pdf.setTheme(theme);
  }

  public void setIncludeTimestamp(boolean includeTimestamp) {
    pdf.setIncludeTimestamp(includeTimestamp);
  }

  public void setFooterMeesage(String footerMesage) {
    pdf.setFooterMessage(footerMesage);
  }

  public void setMessage(String message) {
    pdf.setMessage(message);
  }

  public void setFormat(Format format) {
    pdf.setFormat(format);
  }

  public PDF getResult() {
    return pdf;
  }
}
