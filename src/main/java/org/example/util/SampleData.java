package org.example.util;

import java.util.List;
import org.example.dto.AgreementRequestDTO;
import org.example.dto.AgreementType;

public class SampleData {

  private SampleData(){}

  public static AgreementRequestDTO sampleAgreement() {
    return new AgreementRequestDTO("Example 0", AgreementType.PROFESSIONAL);
  }

  public static List<AgreementRequestDTO> sampleAgreements() {
    AgreementRequestDTO agreement1 = new AgreementRequestDTO("Example 1", AgreementType.PROFESSIONAL);
    AgreementRequestDTO agreement2 = new AgreementRequestDTO( "Example 2", AgreementType.STANDARD);
    AgreementRequestDTO agreement3 = new AgreementRequestDTO("Example 3", AgreementType.PROFESSIONAL);
    AgreementRequestDTO agreement4 = new AgreementRequestDTO("Example 4", AgreementType.STANDARD);
    AgreementRequestDTO agreement5 = new AgreementRequestDTO("Example 5", AgreementType.PROFESSIONAL);
    AgreementRequestDTO agreement6 = new AgreementRequestDTO("Example 6", AgreementType.STANDARD);
    AgreementRequestDTO agreement7 = new AgreementRequestDTO("Example 7", AgreementType.PROFESSIONAL);

    return List.of(agreement1, agreement2, agreement3, agreement4, agreement5, agreement6, agreement7);
  }

}
