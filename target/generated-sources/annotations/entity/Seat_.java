package entity;

import entity.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> idseat;
    public static volatile SingularAttribute<Seat, Integer> seattype;
    public static volatile SingularAttribute<Seat, Room> idroom;
    public static volatile SingularAttribute<Seat, String> row;
    public static volatile SingularAttribute<Seat, Integer> namerow;
    public static volatile SingularAttribute<Seat, Integer> status;

}