package org.example.service.impl;

import java.util.List;
import org.example.dao.repository.AgreementRepository;
import org.example.dto.AgreementRequestDTO;
import org.example.dto.AgreementResponseDTO;
import org.example.mapper.AgreementMapper;
import org.example.model.Agreement;
import org.example.service.AgreementService;

public class AgreementServiceImpl implements AgreementService {

  private final AgreementMapper agreementMapper;
  private final AgreementRepository agreementRepository;

  public AgreementServiceImpl(AgreementMapper agreementMapper,
      AgreementRepository agreementRepository) {
    this.agreementMapper = agreementMapper;
    this.agreementRepository = agreementRepository;
  }

  @Override
  public AgreementResponseDTO createAgreement(AgreementRequestDTO agreementRequestDTO) {
    Agreement agreement = agreementMapper.createAgreement(agreementRequestDTO);
    Agreement savedAgreement = agreementRepository.save(agreement);
    return agreementMapper.createAgreementResponse(savedAgreement);
  }

  @Override
  public List<AgreementResponseDTO> createAgreements(List<AgreementRequestDTO> agreementRequestDTOs) {
    List<Agreement> agreementResponseDTOS =  agreementMapper.createAgreements(agreementRequestDTOs);
    List<Agreement> agreements = agreementRepository.saveAll(agreementResponseDTOS);
    return agreementMapper.mapToAgreementResponseDTO(agreements);
  }

  @Override
  public List<AgreementResponseDTO> findAll() {
    List<Agreement> agreements = agreementRepository.findAll();
    return agreementMapper.mapToAgreementResponseDTO(agreements);
  }

}
