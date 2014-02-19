package com.intuit.extension;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;

public class VetoExtension implements Extension{

    private Logger logger = Logger.getLogger(VetoExtension.class.getName());
       
    void beforeBeanDiscovery(@Observes BeforeBeanDiscovery bbd) {
        logger.info("beginning the scanning process");
     }

	public void processAnnotatedType(@Observes ProcessAnnotatedType pat)
	{
		String beanClassName = pat.getAnnotatedType().getJavaClass().getName();
		if(beanClassName.equals("com.intuit.core.SimpleGreeting")){
			pat.veto();
			logger.info("Adding Veto to class " + beanClassName );
		}
    }

}
