
package com.whty.efs.webservice.es.message;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-08T17:55:13.020+08:00
 * Generated source version: 3.1.7
 * 
 */
public final class ES1SmSr_SmSrES1Port_Client {

    private static final QName SERVICE_NAME = new QName("http://namespaces.gsma.org/esim-messaging/3", "ES1SmSrService");

    private ES1SmSr_SmSrES1Port_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ES1SmSrService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ES1SmSrService ss = new ES1SmSrService(wsdlURL, SERVICE_NAME);
        ES1SmSr port = ss.getSmSrES1Port();  
        
        {
        System.out.println("Invoking es1RegisterEIS...");
        com.whty.efs.webservice.es.message.ES1RegisterEISRequest _es1RegisterEIS_parameters = null;
        com.whty.efs.webservice.es.message.ES1RegisterEISResponse _es1RegisterEIS__return = port.es1RegisterEIS(_es1RegisterEIS_parameters);
        System.out.println("es1RegisterEIS.result=" + _es1RegisterEIS__return);


        }

        System.exit(0);
    }

}