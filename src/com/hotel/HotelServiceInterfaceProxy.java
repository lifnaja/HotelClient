package com.hotel;

public class HotelServiceInterfaceProxy implements com.hotel.HotelServiceInterface {
  private String _endpoint = null;
  private com.hotel.HotelServiceInterface hotelServiceInterface = null;
  
  public HotelServiceInterfaceProxy() {
    _initHotelServiceInterfaceProxy();
  }
  
  public HotelServiceInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHotelServiceInterfaceProxy();
  }
  
  private void _initHotelServiceInterfaceProxy() {
    try {
      hotelServiceInterface = (new com.hotel.HotelServiceServiceLocator()).getHotelServicePort();
      if (hotelServiceInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hotelServiceInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hotelServiceInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hotelServiceInterface != null)
      ((javax.xml.rpc.Stub)hotelServiceInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hotel.HotelServiceInterface getHotelServiceInterface() {
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface;
  }
  
  public com.hotel.Room[] allRoom() throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.allRoom();
  }
  
  
}