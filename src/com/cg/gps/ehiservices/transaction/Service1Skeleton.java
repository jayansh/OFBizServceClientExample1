
/**
 * Service1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
    package com.cg.gps.ehiservices.transaction;

import org.tempuri.GetTransactionResponse;
import org.tempuri.ResponseMsg;

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
             GetTransactionResponse response = new GetTransactionResponse();
             ResponseMsg message = new ResponseMsg();
             message.setAvlBalance(new Double(30.5));
             message.setAcknowledgement("Service success");
             message.setLoadAmount(new Double(23));
             message.setResponsestatus("Done");
             message.setCurBalance(new Double(30.3));
             response.setGetTransactionResult(message);
             return response;
        }
     
    }
    