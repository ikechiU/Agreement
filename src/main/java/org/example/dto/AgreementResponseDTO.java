package org.example.dto;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class AgreementResponseDTO {

  private UUID agreementId;
  private String name;
  private AgreementType type;
  private LocalDate uploadDate;


  public UUID getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(UUID agreementId) {
    this.agreementId = agreementId;
  }

  public AgreementResponseDTO() {
  }

  public AgreementResponseDTO(String name, AgreementType type, LocalDate uploadDate) {
    this.name = name;
    this.type = type;
    this.uploadDate = uploadDate;
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
    return "AgreementResponseDTO{" +
        "name='" + name + '\'' +
        ", type=" + type +
        ", uploadDate=" + uploadDate +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AgreementResponseDTO that)) {
      return false;
    }
    return Objects.equals(agreementId, that.agreementId) && Objects.equals(name,
        that.name) && type == that.type && Objects.equals(uploadDate, that.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, name, type, uploadDate);
  }
}
