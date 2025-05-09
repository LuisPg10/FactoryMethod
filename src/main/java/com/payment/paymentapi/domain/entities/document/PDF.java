package com.payment.paymentapi.domain.entities.document;

import com.payment.paymentapi.domain.enums.Format;
import com.payment.paymentapi.domain.enums.Theme;

public class PDF {
  private boolean includeLogo;
  private String title;
  private boolean includePaymentDetails;
  private boolean includeUserInfo;
  private Theme theme;
  private boolean includeTimestamp;
  private String footerMessage;
  private String message;
  private Format format;

  public void setIncludeLogo(boolean includeLogo) {
    this.includeLogo = includeLogo;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setIncludePaymentDetails(boolean includePaymentDetails) {
    this.includePaymentDetails = includePaymentDetails;
  }

  public void setIncludeUserInfo(boolean includeUserInfo) {
    this.includeUserInfo = includeUserInfo;
  }

  public void setTheme(Theme theme) {
    this.theme = theme;
  }

  public void setIncludeTimestamp(boolean includeTimestamp) {
    this.includeTimestamp = includeTimestamp;
  }

  public void setFooterMessage(String footerMessage) {
    this.footerMessage = footerMessage;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setFormat(Format format) {
    this.format = format;
  }

  public boolean isIncludeLogo() {
    return includeLogo;
  }

  public String getTitle() {
    return title;
  }

  public boolean isIncludePaymentDetails() {
    return includePaymentDetails;
  }

  public boolean isIncludeUserInfo() {
    return includeUserInfo;
  }

  public Theme getTheme() {
    return theme;
  }

  public boolean isIncludeTimestamp() {
    return includeTimestamp;
  }

  public String getFooterMessage() {
    return footerMessage;
  }

  public String getMessage() {
    return message;
  }

  public Format getFormat() {
    return format;
  }
}
