
/**
 * Service1CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

package com.cg.gps.ehiservices.transaction;

/**
 * Service1CallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class GetTransactionCallbackHandler {

    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the
     * NonBlocking Web service call is finished and appropriate method of this
     * CallBack is called.
     * 
     * @param clientData
     *            Object mechanism by which the user can pass in user data that
     *            will be avilable at the time this callback is called.
     */
    public GetTransactionCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public GetTransactionCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getTransaction method override
     * this method for handling normal response from getTransaction operation
     */
    public void receiveResultgetTransaction(org.tempuri.GetTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getTransaction operation
     */
    public void receiveErrorgetTransaction(java.lang.Exception e) {
    }

}
