package Facade;

import DAO.*;
import POCO.AirlineCompanies;
import POCO.Countries;
import POCO.Flights;
import POCO.Users;
import java.sql.Timestamp;
import java.util.List;

public abstract class FacadeBase {

    public List<Flights> get_all_flights(){
        FlightConnection flightConnection=new FlightConnection();
        return  flightConnection.getAll();
    }

    public Flights get_flight_by_id(int id){
        FlightConnection flightConnection=new FlightConnection();
        return flightConnection.get(id) ;
    }

    public List<Flights> get_flights_by_parameters(int origin_country_id, int destination_country_id, Timestamp date){
        FlightConnection flightConnection=new FlightConnection();
        return flightConnection.get_flights_by_parameters(origin_country_id,destination_country_id,date);
   }

    public List<AirlineCompanies> get_all_airlines(){
       AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        return airlineCompanyConnection.getAll();
   }

    public AirlineCompanies get_airline_by_id(int id){
        AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        return airlineCompanyConnection.get(id);
   }


   public AirlineCompanies get_airline_by_parameters(String name,int countryId,int UserId){
        AirlineCompanyConnection airlineCompanyConnection=new AirlineCompanyConnection();
        return airlineCompanyConnection.get_airline_by_parameters(name,countryId,UserId);
   }

   public List<Countries>  get_all_countries(){
       CountryConnection countryConnection=new CountryConnection();
       return countryConnection.getAll();
   }

   public Countries get_country_by_id(int id){
        CountryConnection connection=new CountryConnection();
        return connection.get(id);
   }

   public void create_new_user (Users user){
       UsersConnection usersConnection=new UsersConnection();
       usersConnection.add(user);
   }




}
