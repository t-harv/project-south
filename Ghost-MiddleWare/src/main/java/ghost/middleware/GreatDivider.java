package ghost.middleware;

/**
 * 
 * @author root
 * 
 * Purpose of this class is to simulate a 3 zone architecture.  Presentation Layer transmitted to Data Layer.  This middle layer simulates data transmitting through
 * WS Queues or whatever separates the presentation layer from the data layer.
 *
 *This class needs a direct reference to the HiberDriver because, the presentation layer will call a specific method here that correspond/ simulate a call from the 
 *presentation layer to the data layer.
 *
 *So... unfortunately, what this means, is the webservice logic will hardcode a call to this class which in turn will call a method from the data layer to CRUD data
 *
 *More information.  From PostMan, you should call invoke the correct webservice methods, which will come here and simply display data.  After you get that far,
 *we add more functionality, from simply displaying data to calling the data layer and creating/persisting, updating, retrieving and deleting the data.
 */
public class GreatDivider {
	

}
