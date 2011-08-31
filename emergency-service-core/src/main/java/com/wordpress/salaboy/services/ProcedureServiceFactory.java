/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.services;

import com.wordpress.salaboy.tracking.ContextTrackingServiceImpl;
import java.util.Map;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author salaboy
 */
public class ProcedureServiceFactory {
    
    public static ProcedureService createProcedureService(String emergencyId, String procedureName, Map<String, Object> parameters){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "procedures-beans.xml" );
        ProcedureService procedureService = (ProcedureService) context.getBean(procedureName);
        String procedureId = ContextTrackingServiceImpl.getInstance().newProcedure();
        procedureService.setId(procedureId);
        ContextTrackingServiceImpl.getInstance().attachProcedure(emergencyId, procedureId);
        procedureService.configure(emergencyId, parameters);
        return procedureService;
               
    }
    
    
    
    
    
    
}
