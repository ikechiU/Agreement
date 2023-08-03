package org.example.model;

import java.time.LocalDate;
import java.util.UUID;
import org.example.dto.AgreementType;

public class Agreement {

  private UUID agreementId;
  private String name;
  private AgreementType type;
  private LocalDate uploadDate;

  public Agreement() {
  }

  public Agreement(UUID agreementId, String name, AgreementType type, LocalDate uploadDate) {
    this.agreementId = agreementId;
    this.name = name;
    this.type = type;
    this.uploadDate = uploadDate;
  }

  public UUID getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(UUID agreementId) {
    this.agreementId = agreementId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AgreementType getType() {
    return type;
  }

  public void setType(AgreementType type) {
    this.type = type;
  }

  public LocalDate getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(LocalDate uploadDate) {
    this.uploadDate = uploadDate;
  }

  @Override
  public String toString() {
    return "Agreement{" +
        "name='" + name + '\'' +
        ", type=" + type +
        ", uploadDate=" + uploadDate +
        '}';
  }
}
