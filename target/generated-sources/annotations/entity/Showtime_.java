package entity;

import entity.Movie;
import entity.Room;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Showtime.class)
public class Showtime_ { 

    public static volatile SingularAttribute<Showtime, Integer> idshowtime;
    public static volatile SingularAttribute<Showtime, Date> dateshow;
    public static volatile SingularAttribute<Showtime, Movie> idmovie;
    public static volatile SingularAttribute<Showtime, Room> idroom;
    public static volatile SingularAttribute<Showtime, Integer> frametime;

}