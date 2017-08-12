package com.mastercard.api.mdescustomerservice;
 
import com.mastercard.api.core.exception.*;
import com.mastercard.api.core.model.*;
import com.mastercard.api.core.security.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class TokenUpdate extends BaseObject  {
 
    private static Map<String, OperationConfig> operationConfigs;
 
    static {
       operationConfigs = new HashMap<String, OperationConfig>();
        String env = System.getProperty("ENVIRONMENT");
        if (env != null && env.equalsIgnoreCase("Production"))
        {
            operationConfigs.put("92ce4140-5fde-44fb-8265-0993ba8977e8", new OperationConfig("/mdes/csapi/v2/token/update", Action.create, Arrays.asList(""), Arrays.asList("")));
        }
        else
        {                                               
            operationConfigs.put("92ce4140-5fde-44fb-8265-0993ba8977e8", new OperationConfig("/mdes/csapi/mtf/v2/token/update", Action.create, Arrays.asList(""), Arrays.asList("")));               
        }
    }
 
    public TokenUpdate() {
    }
 
    public TokenUpdate(BaseObject o) {
        putAll(o);
    }
 
    public TokenUpdate(RequestMap requestMap) {
        putAll(requestMap);
    }
 
    @Override protected final OperationConfig getOperationConfig(String operationUUID) throws IllegalArgumentException{
        OperationConfig operationConfig = operationConfigs.get(operationUUID);
 
        if(operationConfig == null) {
            throw new IllegalArgumentException("Invalid operationUUID supplied: " + operationUUID);
        }
 
        return operationConfig;
    }
 
    @Override protected OperationMetadata getOperationMetadata() throws IllegalArgumentException {
        return new OperationMetadata(SDKConfig.getVersion(), SDKConfig.getHost());
    }
 
 
 
    /**
     * Creates a <code>TokenUpdate</code> object
     *
     * @param       map a map of parameters to create a <code>TokenUpdate</code> object
     *
     * @return      a TokenUpdate object.
     *
     * @throws      ApiCommunicationException
     * @throws      AuthenticationException
     * @throws      InvalidRequestException
     * @throws      MessageSignerException
     * @throws      NotAllowedException
     * @throws      ObjectNotFoundException
     * @throws      SystemException
     */
    public static TokenUpdate create(RequestMap map)
        throws ApiCommunicationException, AuthenticationException, InvalidRequestException,
        MessageSignerException, NotAllowedException, ObjectNotFoundException, SystemException {
 
        return create(null, map);
    }
 
    /**
     * Creates a <code>TokenUpdate</code> object
     *
     * @param       auth Authentication object overriding <code>ApiConfig.setAuthentication(authentication)</code>
     * @param       map a map of parameters to create a <code>TokenUpdate</code> object
     *
     * @return      a TokenUpdate object.
     *
     * @throws      ApiCommunicationException
     * @throws      AuthenticationException
     * @throws      InvalidRequestException
     * @throws      MessageSignerException
     * @throws      NotAllowedException
     * @throws      ObjectNotFoundException
     * @throws      SystemException
     */
    public static TokenUpdate create(Authentication auth, RequestMap map)
        throws ApiCommunicationException, AuthenticationException, InvalidRequestException,
        MessageSignerException, NotAllowedException, ObjectNotFoundException, SystemException {
 
        return new TokenUpdate(BaseObject.executeOperation(auth, "92ce4140-5fde-44fb-8265-0993ba8977e8", new TokenUpdate(map)));
    }
 
 
 
 
 
 
 
}
 
