/* 
Step 1: Define Remote Interface
Create an interface that extends java.rmi.Remote
Declare methods that may throw RemoteException
*/
import java.rmi.*;
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}


/* 
Step 2: Implement Remote Interface
Create a class that implements the interface
Extend UnicastRemoteObject

*/
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from Server";
    }
}

/*
Step 3: Create Server Program
Create object of implementation class
Bind it using Naming.rebind()

*/
import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            MyRemoteImpl obj = new MyRemoteImpl();
            Naming.rebind("RemoteHello", obj);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/* 
Step 4: Create Client Program
Lookup remote object using Naming.lookup()
Call remote method
*/
import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


/*Step 5: Run the Application
Start RMI registry using:
rmiregistry
Run server program
Run client program */