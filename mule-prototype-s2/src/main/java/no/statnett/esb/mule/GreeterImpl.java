package no.statnett.esb.mule;

import org.apache.hello_world_soap_http.Greeter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebParam;

public class GreeterImpl implements Greeter {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String greetMe(@WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types") final String requestType) {
        logger.info("Processing greetMe with parameter: " + requestType);
        return "Hello " + requestType + "!";
    }
}
