package org.example.mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import org.example.dto.AgreementRequestDTO;
import org.example.dto.AgreementResponseDTO;
import org.example.model.Agreement;

public class AgreementMapper {

  public Agreement createAgreement(AgreementRequestDTO agreementRequestDTO) {
    Agreement agreement = new Agreement();
    agreement.setAgreementId(UUID.randomUUID());
    agreement.setName(agreementRequestDTO.name());
    agreement.setType(agreementRequestDTO.type());
    agreement.setUploadDate(LocalDate.now());

    return agreement;
  }

  public List<Agreement> createAgreements(List<AgreementRequestDTO> agreementRequestDTOs) {
    return agreementRequestDTOs.stream()
        .map(this::createAgreement)
        .toList();
  }

  public AgreementResponseDTO createAgreementResponse(Agreement agreement) {
    AgreementResponseDTO agreementResponseDTO = new AgreementResponseDTO();
    agreementResponseDTO.setAgreementId(agreement.getAgreementId());
    agreementResponseDTO.setName(agreement.getName());
    agreementResponseDTO.setType(agreement.getType());
    agreementResponseDTO.setUploadDate(agreement.getUploadDate());

    return agreementResponseDTO;
  }

  public List<AgreementResponseDTO> mapToAgreementResponseDTO(List<Agreement> agreements) {
    return agreements.stream()
        .map(this::createAgreementResponse)
        .toList();
  }

}
