package com.rollking.lightcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/** The type Light cloud application. */
@EntityScan
@SpringBootApplication
public class LightCloudApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(LightCloudApplication.class, args);
  }
}
