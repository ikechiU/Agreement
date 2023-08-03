package org.example.cache;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Agreement;

public class AgreementCache {
  private final List<Agreement> cache;

  private static AgreementCache GET_INSTANCE;

  private AgreementCache() {
    cache = new ArrayList<>();
  }

  public void save(Agreement agreement) {
    cache.add(agreement);
  }

  public  List<Agreement> getAll() {
    return cache;
  }

  public static AgreementCache getInstance() {
    if (GET_INSTANCE == null) {
      GET_INSTANCE = new AgreementCache();
    }

    return GET_INSTANCE;
  }

  public void saveAll(List<Agreement> agreements) {
    cache.addAll(agreements);
  }
}
