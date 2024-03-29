package Facade;

import DAO.AdminstratorsConnection;
import DAO.AirlineCompanyConnection;
import DAO.CustomerConnection;
import POCO.Adminstrator;
import POCO.AirlineCompanies;
import POCO.Customers;

import java.util.List;

public class AdministratorFacade extends FacadeBase{



    public List<Customers> get_all_customers(){
        CustomerConnection connection=new CustomerConnection();
        return connection.getAll();
    }

    public void  add_airline(AirlineCompanies airline){
        AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        airlineCompanyConnection.add(airline);
    }
    public void add_customer(Customers customer){
        CustomerConnection connection=new CustomerConnection();
        connection.add(customer);
    }
    public void add_administrator(Adminstrator adminstrator){
        AdminstratorsConnection adminstratorsConnection=new AdminstratorsConnection();
        adminstratorsConnection.add(adminstrator);
    }
    public void remove_airline(AirlineCompanies airlineCompanies){
        AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        airlineCompanyConnection.remove(airlineCompanies);
    }
    public void remove_customer(Customers customer) {
        CustomerConnection connection = new CustomerConnection();
        connection.remove(customer);
    }
    public void remove_administrator(Adminstrator adminstrator){
        AdminstratorsConnection adminstratorsConnection=new AdminstratorsConnection();
        adminstratorsConnection.remove(adminstrator);
    }

}
