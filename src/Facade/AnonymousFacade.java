package Facade;

import DAO.UserRoleConnection;
import DAO.UsersConnection;
import POCO.UserRole;
import POCO.Users;

public class AnonymousFacade extends FacadeBase{



    public UserRole login(String userName, String password){
        Users user;
        UsersConnection usersConnection=new UsersConnection();
        user=usersConnection.get_user_by_username_and_password(userName,password);
         if (user.password.equals(password) && user.userName.equals(userName)){
             UserRoleConnection userRoleConnection=new UserRoleConnection();
             return userRoleConnection.get(user.id);
         }else {
             System.out.println("not good");
             return null;
         }
    }


}
