package org.example;

import org.example.dto.AgreementResponseDTO;
import org.example.injection.Injection;
import org.example.service.AgreementService;
import org.example.util.SampleData;


public class Main {
  private final AgreementService agreementService;

  public Main() {
    agreementService = Injection.init();
  }

  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.createAgreement());
    System.out.println(main.agreementService.findAll());
  }

  public AgreementResponseDTO createAgreement() {
    return agreementService.createAgreement(SampleData.sampleAgreement());
  }

}