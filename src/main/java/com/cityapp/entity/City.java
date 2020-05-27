package com.cityapp.entity;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cloud.gcp.data.firestore.Document;

@Getter
@Setter
@ToString
@Document(collectionName = "cities")
public class City {

  @DocumentId
  private String id;
  private String name;

}
