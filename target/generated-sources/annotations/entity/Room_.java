package entity;

import entity.Cinema;
import entity.Seat;
import entity.Showtime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Integer> quantityseat;
    public static volatile SingularAttribute<Room, String> nameroom;
    public static volatile SingularAttribute<Room, Integer> idroom;
    public static volatile SingularAttribute<Room, Cinema> idcinema;
    public static volatile ListAttribute<Room, Seat> seatList;
    public static volatile SingularAttribute<Room, Integer> status;
    public static volatile ListAttribute<Room, Showtime> showtimeList;

}