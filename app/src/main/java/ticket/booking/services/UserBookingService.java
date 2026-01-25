package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService
{
    private User user;
private List<User> userList;
private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDb/users.json";
    //making constructor
    //constructor has same name as class
    //constructor is called 1st when a class is called
    //we are assuming that user has already logged for accessing userbookingservices

    public UserBookingService(User user1) throws IOException
    {
        this.user = user1;
        File users = new File(USERS_PATH);
        //TYPEREFERENCE IS USED IN OBJECTMAPPER IN RUNTIME TO RESOLVE THINGS
        userList = objectMapper.readValue(users , new TypeReference<List<User>>(){});
    }
}
