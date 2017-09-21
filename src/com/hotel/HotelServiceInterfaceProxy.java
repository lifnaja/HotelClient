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
  
  public boolean createUser(java.lang.String lastName, java.lang.String firstName, java.lang.String identity, java.lang.String phone, java.lang.String email, java.lang.String address, java.lang.String username, java.lang.String password, java.lang.String type) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.createUser(lastName, firstName, identity, phone, email, address, username, password, type);
  }
  
  public com.hotel.User[] allUser() throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.allUser();
  }
  
  public java.lang.Boolean deleteUser(java.lang.String id) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.deleteUser(id);
  }
  
  public com.hotel.Room getupdateRoom(java.lang.String id) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.getupdateRoom(id);
  }
  
  public boolean createRoom(java.lang.String roomID, java.lang.String type, java.lang.String price) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.createRoom(roomID, type, price);
  }
  
  public boolean updateUser(java.lang.String id, java.lang.String lastName, java.lang.String firstName, java.lang.String identity, java.lang.String phone, java.lang.String email, java.lang.String address, java.lang.String username, java.lang.String password, java.lang.String type) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.updateUser(id, lastName, firstName, identity, phone, email, address, username, password, type);
  }
  
  public com.hotel.User getupdateUser(java.lang.String id) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.getupdateUser(id);
  }
  
  public boolean updateRoom(java.lang.String id, java.lang.String roomID, java.lang.String type, java.lang.String price) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.updateRoom(id, roomID, type, price);
  }
  
  public java.lang.Boolean deleteRoom(java.lang.String id) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.deleteRoom(id);
  }
  
  public com.hotel.Room[] findRoomBusy(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.findRoomBusy(startDate, endDate);
  }
  
  public com.hotel.Room[] allRoom() throws java.rmi.RemoteException{
    if (hotelServiceInterface == null)
      _initHotelServiceInterfaceProxy();
    return hotelServiceInterface.allRoom();
  }
  
  
}