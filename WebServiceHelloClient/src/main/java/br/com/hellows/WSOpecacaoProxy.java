package br.com.hellows;

public class WSOpecacaoProxy implements br.com.hellows.WSOpecacao {
  private String _endpoint = null;
  private br.com.hellows.WSOpecacao wSOpecacao = null;
  
  public WSOpecacaoProxy() {
    _initWSOpecacaoProxy();
  }
  
  public WSOpecacaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSOpecacaoProxy();
  }
  
  private void _initWSOpecacaoProxy() {
    try {
      wSOpecacao = (new br.com.hellows.WSOpecacaoServiceLocator()).getWSOpecacao();
      if (wSOpecacao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSOpecacao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSOpecacao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSOpecacao != null)
      ((javax.xml.rpc.Stub)wSOpecacao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.hellows.WSOpecacao getWSOpecacao() {
    if (wSOpecacao == null)
      _initWSOpecacaoProxy();
    return wSOpecacao;
  }
  
  public int divide(int num01, int num02) throws java.rmi.RemoteException{
    if (wSOpecacao == null)
      _initWSOpecacaoProxy();
    return wSOpecacao.divide(num01, num02);
  }
  
  public int soma(int num01, int num02) throws java.rmi.RemoteException{
    if (wSOpecacao == null)
      _initWSOpecacaoProxy();
    return wSOpecacao.soma(num01, num02);
  }
  
  public int subtrai(int num01, int num02) throws java.rmi.RemoteException{
    if (wSOpecacao == null)
      _initWSOpecacaoProxy();
    return wSOpecacao.subtrai(num01, num02);
  }
  
  public int multiplica(int num01, int num02) throws java.rmi.RemoteException{
    if (wSOpecacao == null)
      _initWSOpecacaoProxy();
    return wSOpecacao.multiplica(num01, num02);
  }
  
  
}