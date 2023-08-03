package org.example.dto;

public record AgreementRequestDTO(String name, AgreementType type) {

  @Override
  public String toString() {
    return "AgreementRequestDTO{" +
        "name='" + name + '\'' +
        ", type=" + type +
        '}';
  }
}
