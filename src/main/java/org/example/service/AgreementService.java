package org.example.service;

import java.util.List;
import org.example.dto.AgreementRequestDTO;
import org.example.dto.AgreementResponseDTO;

public interface AgreementService {
  AgreementResponseDTO createAgreement(AgreementRequestDTO agreementRequestDTO);
  List<AgreementResponseDTO> createAgreements(List<AgreementRequestDTO> agreementRequestDTOs);
  List<AgreementResponseDTO> findAll();
}
