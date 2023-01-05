package user;

import trip.Trip;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    private final List<Trip> trips = new ArrayList<>();
    private final List<UserTest> friends = new ArrayList<>();

    public List<UserTest> getFriends(){
        return friends;
    }

    public void addFriend(UserTest user){
        friends.add(user);
    }

    public List<Trip> getTrips(){
        return trips;
    }
    public void addTrip(Trip trip){
        trips.add(trip);
    }

}
