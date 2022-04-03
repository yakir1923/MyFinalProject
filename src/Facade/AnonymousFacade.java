package Facade;

import DAO.CustomerConnection;
import DAO.UserRoleConnection;
import DAO.UsersConnection;
import POCO.Customers;
import POCO.UserRole;
import POCO.Users;

public class AnonymousFacade extends FacadeBase{
    public FacadeBase facade;
    public Users user;

    public FacadeBase login(String userName, String password){
        loginToken=new LoginToken();
        UsersConnection usersConnection=new UsersConnection();
        user =usersConnection.get_user_by_username_and_password(userName,password);
        loginToken.setId(user.id);
        loginToken.setName(user.userName);
        loginToken.setUserRole(user.UserRole);
         if (user.password.equals(password) && user.userName.equals(userName)){
             switch (loginToken.getUserRole()) {
                 case 1 -> facade = new CustomerFacade();
                 case 2 -> facade = new AirlineFacade();
                 case 3 -> facade = new AdministratorFacade();
             }
         }else {
             System.out.println("i.e. WrongPasswordError");
         }
         return facade;
    }
    public void addCustomer(Customers customers){
        CustomerConnection connection=new CustomerConnection();
        connection.add(customers);
    }


}
