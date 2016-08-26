
/**
 * Cut_Off.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

package org.tempuri;

/**
 * Cut_Off bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class Cut_Off implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://tempuri.org/",
            "Cut_Off", "ns1");

    /**
     * field for CutoffID
     */

    protected int localCutoffID;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getCutoffID() {
        return localCutoffID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CutoffID
     */
    public void setCutoffID(int param) {

        this.localCutoffID = param;

    }

    /**
     * field for ProductID
     */

    protected int localProductID;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getProductID() {
        return localProductID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ProductID
     */
    public void setProductID(int param) {

        this.localProductID = param;

    }

    /**
     * field for CutoffDate
     */

    protected java.lang.String localCutoffDate;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCutoffDateTracker = false;

    public boolean isCutoffDateSpecified() {
        return localCutoffDateTracker;
    }

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCutoffDate() {
        return localCutoffDate;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CutoffDate
     */
    public void setCutoffDate(java.lang.String param) {
        localCutoffDateTracker = param != null;

        this.localCutoffDate = param;

    }

    /**
     * field for FirstTxn_ID
     */

    protected int localFirstTxn_ID;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getFirstTxn_ID() {
        return localFirstTxn_ID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            FirstTxn_ID
     */
    public void setFirstTxn_ID(int param) {

        this.localFirstTxn_ID = param;

    }

    /**
     * field for LastTxn_ID
     */

    protected int localLastTxn_ID;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getLastTxn_ID() {
        return localLastTxn_ID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            LastTxn_ID
     */
    public void setLastTxn_ID(int param) {

        this.localLastTxn_ID = param;

    }

    /**
     * field for Auths_Acknowledged
     */

    protected int localAuths_Acknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getAuths_Acknowledged() {
        return localAuths_Acknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Auths_Acknowledged
     */
    public void setAuths_Acknowledged(int param) {

        this.localAuths_Acknowledged = param;

    }

    /**
     * field for Auths_NotAcknowledged
     */

    protected int localAuths_NotAcknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getAuths_NotAcknowledged() {
        return localAuths_NotAcknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Auths_NotAcknowledged
     */
    public void setAuths_NotAcknowledged(int param) {

        this.localAuths_NotAcknowledged = param;

    }

    /**
     * field for Financials_Acknowledged
     */

    protected int localFinancials_Acknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getFinancials_Acknowledged() {
        return localFinancials_Acknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Financials_Acknowledged
     */
    public void setFinancials_Acknowledged(int param) {

        this.localFinancials_Acknowledged = param;

    }

    /**
     * field for Financials_NotAcknowledged
     */

    protected int localFinancials_NotAcknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getFinancials_NotAcknowledged() {
        return localFinancials_NotAcknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Financials_NotAcknowledged
     */
    public void setFinancials_NotAcknowledged(int param) {

        this.localFinancials_NotAcknowledged = param;

    }

    /**
     * field for LoadsUnloads_Acknowledged
     */

    protected int localLoadsUnloads_Acknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getLoadsUnloads_Acknowledged() {
        return localLoadsUnloads_Acknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            LoadsUnloads_Acknowledged
     */
    public void setLoadsUnloads_Acknowledged(int param) {

        this.localLoadsUnloads_Acknowledged = param;

    }

    /**
     * field for LoadsUnloads_NotAcknowledged
     */

    protected int localLoadsUnloads_NotAcknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getLoadsUnloads_NotAcknowledged() {
        return localLoadsUnloads_NotAcknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            LoadsUnloads_NotAcknowledged
     */
    public void setLoadsUnloads_NotAcknowledged(int param) {

        this.localLoadsUnloads_NotAcknowledged = param;

    }

    /**
     * field for BalanceAdjustExpiry_Acknowledged
     */

    protected int localBalanceAdjustExpiry_Acknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getBalanceAdjustExpiry_Acknowledged() {
        return localBalanceAdjustExpiry_Acknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            BalanceAdjustExpiry_Acknowledged
     */
    public void setBalanceAdjustExpiry_Acknowledged(int param) {

        this.localBalanceAdjustExpiry_Acknowledged = param;

    }

    /**
     * field for BalanceAdjustExpiry_NotAcknowledged
     */

    protected int localBalanceAdjustExpiry_NotAcknowledged;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getBalanceAdjustExpiry_NotAcknowledged() {
        return localBalanceAdjustExpiry_NotAcknowledged;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            BalanceAdjustExpiry_NotAcknowledged
     */
    public void setBalanceAdjustExpiry_NotAcknowledged(int param) {

        this.localBalanceAdjustExpiry_NotAcknowledged = param;

    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://tempuri.org/");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Cut_Off",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Cut_Off", xmlWriter);
            }

        }

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "CutoffID", xmlWriter);

        if (localCutoffID == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CutoffID cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCutoffID));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "ProductID", xmlWriter);

        if (localProductID == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("ProductID cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductID));
        }

        xmlWriter.writeEndElement();
        if (localCutoffDateTracker) {
            namespace = "http://tempuri.org/";
            writeStartElement(null, namespace, "CutoffDate", xmlWriter);

            if (localCutoffDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CutoffDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCutoffDate);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "FirstTxn_ID", xmlWriter);

        if (localFirstTxn_ID == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("FirstTxn_ID cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstTxn_ID));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "LastTxn_ID", xmlWriter);

        if (localLastTxn_ID == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("LastTxn_ID cannot be null!!");

        } else {
            xmlWriter
                    .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastTxn_ID));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Auths_Acknowledged", xmlWriter);

        if (localAuths_Acknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Auths_Acknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuths_Acknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Auths_NotAcknowledged", xmlWriter);

        if (localAuths_NotAcknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Auths_NotAcknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuths_NotAcknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Financials_Acknowledged", xmlWriter);

        if (localFinancials_Acknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Financials_Acknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancials_Acknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "Financials_NotAcknowledged", xmlWriter);

        if (localFinancials_NotAcknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Financials_NotAcknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancials_NotAcknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "LoadsUnloads_Acknowledged", xmlWriter);

        if (localLoadsUnloads_Acknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("LoadsUnloads_Acknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoadsUnloads_Acknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "LoadsUnloads_NotAcknowledged", xmlWriter);

        if (localLoadsUnloads_NotAcknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("LoadsUnloads_NotAcknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localLoadsUnloads_NotAcknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "BalanceAdjustExpiry_Acknowledged", xmlWriter);

        if (localBalanceAdjustExpiry_Acknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("BalanceAdjustExpiry_Acknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBalanceAdjustExpiry_Acknowledged));
        }

        xmlWriter.writeEndElement();

        namespace = "http://tempuri.org/";
        writeStartElement(null, namespace, "BalanceAdjustExpiry_NotAcknowledged", xmlWriter);

        if (localBalanceAdjustExpiry_NotAcknowledged == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("BalanceAdjustExpiry_NotAcknowledged cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(localBalanceAdjustExpiry_NotAcknowledged));
        }

        xmlWriter.writeEndElement();

        xmlWriter.writeEndElement();

    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://tempuri.org/")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(
                        prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "CutoffID"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCutoffID));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "ProductID"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductID));
        if (localCutoffDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "CutoffDate"));

            if (localCutoffDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCutoffDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CutoffDate cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "FirstTxn_ID"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstTxn_ID));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "LastTxn_ID"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastTxn_ID));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Auths_Acknowledged"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuths_Acknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Auths_NotAcknowledged"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuths_NotAcknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Financials_Acknowledged"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancials_Acknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "Financials_NotAcknowledged"));

        elementList
                .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancials_NotAcknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "LoadsUnloads_Acknowledged"));

        elementList
                .add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoadsUnloads_Acknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "LoadsUnloads_NotAcknowledged"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoadsUnloads_NotAcknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "BalanceAdjustExpiry_Acknowledged"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString(localBalanceAdjustExpiry_Acknowledged));

        elementList.add(new javax.xml.namespace.QName("http://tempuri.org/", "BalanceAdjustExpiry_NotAcknowledged"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString(localBalanceAdjustExpiry_NotAcknowledged));

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
                attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static Cut_Off parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Cut_Off object = new Cut_Off();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader
                            .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"Cut_Off".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Cut_Off) org.tempuri.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "CutoffID").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CutoffID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCutoffID(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "ProductID").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ProductID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProductID(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/", "CutoffDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CutoffDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCutoffDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/", "FirstTxn_ID")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FirstTxn_ID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFirstTxn_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/", "LastTxn_ID")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "LastTxn_ID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastTxn_ID(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Auths_Acknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Auths_Acknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuths_Acknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Auths_NotAcknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Auths_NotAcknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuths_NotAcknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Financials_Acknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Financials_Acknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFinancials_Acknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "Financials_NotAcknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Financials_NotAcknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFinancials_NotAcknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "LoadsUnloads_Acknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "LoadsUnloads_Acknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLoadsUnloads_Acknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "LoadsUnloads_NotAcknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "LoadsUnloads_NotAcknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLoadsUnloads_NotAcknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "BalanceAdjustExpiry_Acknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BalanceAdjustExpiry_Acknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBalanceAdjustExpiry_Acknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()
                        && new javax.xml.namespace.QName("http://tempuri.org/", "BalanceAdjustExpiry_NotAcknowledged")
                                .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BalanceAdjustExpiry_NotAcknowledged" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBalanceAdjustExpiry_NotAcknowledged(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class

}
