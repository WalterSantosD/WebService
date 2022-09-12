/**
 * WSOpecacaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.hellows;

public class WSOpecacaoServiceLocator extends org.apache.axis.client.Service implements br.com.hellows.WSOpecacaoService {

    public WSOpecacaoServiceLocator() {
    }


    public WSOpecacaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSOpecacaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSOpecacao
    private java.lang.String WSOpecacao_address = "http://localhost:8080/WebServiceHello/services/WSOpecacao";

    public java.lang.String getWSOpecacaoAddress() {
        return WSOpecacao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSOpecacaoWSDDServiceName = "WSOpecacao";

    public java.lang.String getWSOpecacaoWSDDServiceName() {
        return WSOpecacaoWSDDServiceName;
    }

    public void setWSOpecacaoWSDDServiceName(java.lang.String name) {
        WSOpecacaoWSDDServiceName = name;
    }

    public br.com.hellows.WSOpecacao getWSOpecacao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSOpecacao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSOpecacao(endpoint);
    }

    public br.com.hellows.WSOpecacao getWSOpecacao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.hellows.WSOpecacaoSoapBindingStub _stub = new br.com.hellows.WSOpecacaoSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSOpecacaoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSOpecacaoEndpointAddress(java.lang.String address) {
        WSOpecacao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.hellows.WSOpecacao.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.hellows.WSOpecacaoSoapBindingStub _stub = new br.com.hellows.WSOpecacaoSoapBindingStub(new java.net.URL(WSOpecacao_address), this);
                _stub.setPortName(getWSOpecacaoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSOpecacao".equals(inputPortName)) {
            return getWSOpecacao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hellows.com.br", "WSOpecacaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hellows.com.br", "WSOpecacao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSOpecacao".equals(portName)) {
            setWSOpecacaoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
