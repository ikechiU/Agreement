package org.example.dao.repository;

import java.util.List;
import org.example.cache.AgreementCache;
import org.example.model.Agreement;

public class AgreementRepositoryImpl implements AgreementRepository {
  private final AgreementCache agreementCache;

  public AgreementRepositoryImpl(AgreementCache agreementCache) {
    this.agreementCache = agreementCache;
  }

  @Override
  public Agreement save(Agreement agreement) {
    agreementCache.save(agreement);
    return agreement;
  }

  @Override
  public List<Agreement> saveAll(List<Agreement> agreements) {
    agreementCache.saveAll(agreements);
    return agreements;
  }

  @Override
  public List<Agreement> findAll() {
    return agreementCache.getAll();
  }
}
