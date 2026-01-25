package ticket.booking.services;

import ticket.booking.entities.User;

public class UserBookingService
{
    private User user;
    //making constructor
    //constructor has same name as class
    //constructor is called 1st when a class is called
    //we are assuming that user has already logged for accessing userbookingservices

    public UserBookingService(User user1){
        this.user = user1;
    }
}
