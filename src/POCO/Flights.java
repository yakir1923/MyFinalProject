package POCO;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

public class Flights implements POCO {
    public int id;
    public int airlineCompanyId;
    public int originCountryId;
    public int destinationCountryId;
    public Timestamp departureTime;
    public Timestamp landingTime;
    public int remainingTickets;

    public Flights(int id, int airlineCompanyId, int originCountryId, int destinationCountryId, Timestamp departureTime, Timestamp landingTime, int remainingTickets) {
        this.id = id;
        this.airlineCompanyId = airlineCompanyId;
        this.originCountryId = originCountryId;
        this.destinationCountryId = destinationCountryId;
        this.departureTime = departureTime;
        this.landingTime = landingTime;
        this.remainingTickets = remainingTickets;
    }

    public Flights() {
    }
}
