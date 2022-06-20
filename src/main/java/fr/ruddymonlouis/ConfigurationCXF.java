/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ruddymonlouis;

import fr.ruddymonlouis.api.impl.MyValidationExceptionMapper;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration du framework CXF
 * @author akriks
 */
@Configuration
public class ConfigurationCXF {
 
@Bean
public LoggingFeature myLogger() {
    LoggingFeature logger= new LoggingFeature();
    logger.setLimit(4096);
    return logger;
}
@Bean
public MyValidationExceptionMapper myMapper() {
    MyValidationExceptionMapper myMapper= new MyValidationExceptionMapper();
  //  myMapper.setAddMessageToResponse(true);
    return myMapper;
}

}
