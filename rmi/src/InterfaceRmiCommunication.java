



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException; 
    Integer getMulti(int num1, int num2) throws RemoteException; 
    Integer getDivi(int num1, int num2) throws RemoteException; 
    Integer getResta(int num1, int num2) throws RemoteException; 
}
