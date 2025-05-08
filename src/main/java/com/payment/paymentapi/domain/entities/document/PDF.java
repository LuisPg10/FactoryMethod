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
  private String Mensaje;
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

  public void setMensaje(String mensaje) {
    Mensaje = mensaje;
  }

  public void setFormat(Format format) {
    this.format = format;
  }
}
