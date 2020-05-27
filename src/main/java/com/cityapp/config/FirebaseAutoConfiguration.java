package com.cityapp.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class FirebaseAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public FirebaseOptions firebaseOptions() throws IOException {
    return new FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.getApplicationDefault())
        .build();
  }

  @Bean
  @ConditionalOnMissingBean
  public FirebaseApp firebaseApp(FirebaseOptions firebaseOptions) {
    return FirebaseApp.initializeApp(firebaseOptions);
  }

  @Bean
  @ConditionalOnMissingBean
  @DependsOn(value = "firebaseApp")
  public FirebaseAuth firebaseAuth() {
    return FirebaseAuth.getInstance();
  }
}
