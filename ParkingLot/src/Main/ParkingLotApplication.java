package Main;

import SpotAssignmentStrategy.RandomSpotAssignmentStrategy;
import SpotAssignmentStrategy.SpotAssignmentStrategy;
import controllers.TicketController;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import service.TicketService;

public class ParkingLotApplication {

	public static void main(String[] args) {
		
		 GateRepository gateRepository = new GateRepository();
	        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
	        TicketRepository ticketRepository = new TicketRepository();
	        VehicleRepository vehicleRepository = new VehicleRepository();
	        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

	        TicketService ticketService = new TicketService(
	                gateRepository,
	                vehicleRepository,
	                spotAssignmentStrategy,
	                ticketRepository,
	                parkingLotRepository
	        );

	        TicketController ticketController = new TicketController(ticketService);

	        System.out.println("Application has started on part :8080");
	}

}
