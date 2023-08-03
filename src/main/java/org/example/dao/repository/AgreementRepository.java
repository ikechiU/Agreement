package org.example.dao.repository;

import java.util.List;
import org.example.model.Agreement;

public interface AgreementRepository {

  Agreement save(Agreement agreement);
  List<Agreement> saveAll(List<Agreement> agreements);
  List<Agreement> findAll();

}
