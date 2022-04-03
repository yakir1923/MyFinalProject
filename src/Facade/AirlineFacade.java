package Facade;

import DAO.AirlineCompanyConnection;
import DAO.FlightConnection;
import POCO.AirlineCompanies;
import POCO.Flights;

import java.util.ArrayList;
import java.util.List;

public class AirlineFacade extends AnonymousFacade{

    public List<Flights> get_my_flights (){
        FlightConnection flightConnection=new FlightConnection();
        List<Flights> flightsList;
        flightsList=flightConnection.get_flights_by_airline_id(loginToken.getId());
        return flightsList;
    }


    public void update_airline(AirlineCompanies airlineCompanies){
        if (airlineCompanies.id== loginToken.getId()) {
            AirlineCompanyConnection airlineCompanyConnection = new AirlineCompanyConnection();
            airlineCompanyConnection.update(airlineCompanies);
        }
    }


    public void add_flight(Flights flights){
        if (flights.airlineCompanyId== loginToken.getId()) {
            FlightConnection flightConnection = new FlightConnection();
            flightConnection.add(flights);
        }
    }


    public void update_flight(Flights flights){
        if (flights.airlineCompanyId== loginToken.getId()) {
            FlightConnection flightConnection = new FlightConnection();
            flightConnection.update(flights);
        }
    }


    public void remove_flight(Flights flights){
        if (flights.airlineCompanyId== loginToken.getId()) {
            FlightConnection flightConnection = new FlightConnection();
            flightConnection.remove(flights);
        }
    }




}
