/**
 * HotelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hotel;

public interface HotelServiceInterface extends java.rmi.Remote {
    public boolean createUser(java.lang.String lastName, java.lang.String firstName, java.lang.String identity, java.lang.String phone, java.lang.String email, java.lang.String address, java.lang.String username, java.lang.String password, java.lang.String type) throws java.rmi.RemoteException;
    public com.hotel.User[] allUser() throws java.rmi.RemoteException;
    public java.lang.Boolean deleteUser(java.lang.String id) throws java.rmi.RemoteException;
    public com.hotel.Room getupdateRoom(java.lang.String id) throws java.rmi.RemoteException;
    public boolean createRoom(java.lang.String roomID, java.lang.String type, java.lang.String price) throws java.rmi.RemoteException;
    public boolean updateUser(java.lang.String id, java.lang.String lastName, java.lang.String firstName, java.lang.String identity, java.lang.String phone, java.lang.String email, java.lang.String address, java.lang.String username, java.lang.String password, java.lang.String type) throws java.rmi.RemoteException;
    public com.hotel.User getupdateUser(java.lang.String id) throws java.rmi.RemoteException;
    public boolean updateRoom(java.lang.String id, java.lang.String roomID, java.lang.String type, java.lang.String price) throws java.rmi.RemoteException;
    public java.lang.Boolean deleteRoom(java.lang.String id) throws java.rmi.RemoteException;
    public com.hotel.Room[] findRoomBusy(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException;
    public com.hotel.Room[] allRoom() throws java.rmi.RemoteException;
}
