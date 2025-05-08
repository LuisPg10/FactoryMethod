package com.payment.paymentapi.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Environtment {
  private static final Dotenv dotenv = Dotenv.load();

  public static String getEmailUsername() {
    return dotenv.get("EMAIL_USERNAME");
  }

  public static String getEmailPassword() {
    return dotenv.get("EMAIL_PASSWORD");
  }

  public static String getTwilioAccountSID() {
    return dotenv.get("TWILIO_ACCOUNT_SID");
  }

  public static String getTwilioAuthToken() {
    return dotenv.get("TWILIO_AUTH_TOKEN");
  }

  public static String getTwilioNumber() {
    return dotenv.get("TWILIO_NUMBER");
  }
}
