package entity;

import entity.Movie;
import entity.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Cinema.class)
public class Cinema_ { 

    public static volatile SingularAttribute<Cinema, String> area;
    public static volatile SingularAttribute<Cinema, String> namecinema;
    public static volatile SingularAttribute<Cinema, String> address;
    public static volatile SingularAttribute<Cinema, Integer> idcinema;
    public static volatile ListAttribute<Cinema, Movie> movieList;
    public static volatile ListAttribute<Cinema, Room> roomList;

}