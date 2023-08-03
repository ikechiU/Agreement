package org.example.service.impl;

import static org.example.util.SampleData.sampleAgreement;
import static org.example.util.SampleData.sampleAgreements;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.example.cache.AgreementCache;
import org.example.dto.AgreementResponseDTO;
import org.example.injection.Injection;
import org.example.service.AgreementService;
import org.junit.jupiter.api.Test;

class AgreementServiceImplTest {

  AgreementService agreementService = Injection.init();

  @Test
  void testCache() {
    AgreementCache agreementCache = AgreementCache.getInstance();
    assertEquals(agreementCache, AgreementCache.getInstance());
  }

  @Test
  void createAgreement() {
    AgreementResponseDTO agreement = agreementService.createAgreement(sampleAgreement());
    System.out.println(agreement);
    assertNotNull(agreement);
  }

  @Test
  void findAll() {
    AgreementResponseDTO agreement = agreementService.createAgreement(sampleAgreement());
    List<AgreementResponseDTO> agreements = agreementService.createAgreements(sampleAgreements());
    System.out.println(agreements);

    List<AgreementResponseDTO> list = agreementService.findAll();

    assertEquals(agreement, list.get(0));
    assertEquals(8, list.size());
  }

}