package entity;

import entity.Actor;
import entity.Category;
import entity.Cinema;
import entity.Director;
import entity.Showtime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:33:17")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, String> image;
    public static volatile SingularAttribute<Movie, Actor> idactor;
    public static volatile SingularAttribute<Movie, Director> iddirector;
    public static volatile SingularAttribute<Movie, String> discription;
    public static volatile SingularAttribute<Movie, Category> idcategory;
    public static volatile ListAttribute<Movie, Cinema> cinemaList;
    public static volatile SingularAttribute<Movie, Date> start;
    public static volatile SingularAttribute<Movie, String> language;
    public static volatile SingularAttribute<Movie, String> moviename;
    public static volatile ListAttribute<Movie, Showtime> showtimeList;
    public static volatile SingularAttribute<Movie, Integer> duration;
    public static volatile SingularAttribute<Movie, String> rated;
    public static volatile SingularAttribute<Movie, Integer> idcatagory;
    public static volatile SingularAttribute<Movie, Integer> idmovie;
    public static volatile SingularAttribute<Movie, String> trailler;
    public static volatile SingularAttribute<Movie, Integer> status;

}