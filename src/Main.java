import DAO.*;
import POCO.Adminstrator;
import POCO.AirlineCompanies;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        System.out.println(airlineCompanyConnection.getAll());
        //2
        CountryConnection countryConnection=new CountryConnection();
        System.out.println(countryConnection.getAll());
         //3
        CustomerConnection customerConnection=new CustomerConnection();
        System.out.println(customerConnection.getAll());
        //4
        FlightConnection flightConnection=new FlightConnection();
        System.out.println(flightConnection.getAll());
        //5
        TicketConnection ticketConnection=new TicketConnection();
        System.out.println(ticketConnection.getAll());
         //6
        UserRoleConnection userRoleConnection=new UserRoleConnection();
        System.out.println(userRoleConnection.getAll());
       //7
        UsersConnection usersConnection=new UsersConnection();
        System.out.println(usersConnection.getAll());
        //8
        AdminstratorsConnection adminstratorsConnection=new AdminstratorsConnection();
        System.out.println(adminstratorsConnection.getAll());

    }
}
