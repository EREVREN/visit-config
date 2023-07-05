package com.project.visitconfig.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.visitconfig.db.DbSettings;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class VisitController {


    private DbSettings dbSettings;

    public VisitController (DbSettings dbSettings){
        this.dbSettings = dbSettings;
        log.info("dbSettings injected");
    }

    @Value("${app.description}")
    private String appdescription;
    
    @Value("${my.list.values}") 
    private List<String> listValues;
 
    @Value("#{${dbValues}}")
    private Map<String, String> dbValues;

    @GetMapping("/visit")
    public String visit() {
        log.info("appdescription OK");
        return appdescription;
    }

    @GetMapping("/visit3")
    public List<String> visitList () {
        log.info("listValues OK");
        
        return listValues;
    } 
    
    @GetMapping("/visit1")
    public Map<String, String> dbValues () {
        log.info("dbValues OK");

        return dbValues;
    }

    @GetMapping ("/visit2")
    public String visitDb () {
         log.info("dbSettings OK");
        return dbSettings.getConnection() + dbSettings.getHost() + dbSettings.getPort();
    }

   
}

