package org.example.injection;

import org.example.cache.AgreementCache;
import org.example.dao.repository.AgreementRepository;
import org.example.dao.repository.AgreementRepositoryImpl;
import org.example.mapper.AgreementMapper;
import org.example.service.AgreementService;
import org.example.service.impl.AgreementServiceImpl;

public class Injection {
  private Injection() {}
  public static AgreementService init() {
    AgreementCache agreementCache = AgreementCache.getInstance();
    AgreementMapper agreementMapper = new AgreementMapper();
    AgreementRepository agreementRepository = new AgreementRepositoryImpl(agreementCache);
    return new AgreementServiceImpl(agreementMapper, agreementRepository);
  }
}
