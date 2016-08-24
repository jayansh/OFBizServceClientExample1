
/**
 * Service1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package com.cg.gps.ehiservices.transaction;
    /**
     *  Service1Skeleton java skeleton for the axisService
     */
    public class Service1Skeleton implements Service1SkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTransaction0 
             * @return getTransactionResponse1 
         */
        
                 public org.tempuri.GetTransactionResponse getTransaction
                  (
                  org.tempuri.GetTransaction getTransaction0
                  )
            {
                //TODO : fill this with the necessary business logic
                     /*throw new java.lang.UnsupportedOperationException(
                     "Please implement " + this.getClass().getName() + "#getTransaction");*/
             org.tempuri.GetTransactionResponse response = new org.tempuri.GetTransactionResponse();
             org.tempuri.ResponseMsg message = new org.tempuri.ResponseMsg();
             message.setAvlBalance(new Double(30));
             message.setAcknowledgement("Service success");
             message.setLoadAmount(new Double(21.02));
             message.setResponsestatus("Done");
             message.setCurBalance(new Double(30));
             response.setGetTransactionResult(message);
             return response;
        }
     
    }
    