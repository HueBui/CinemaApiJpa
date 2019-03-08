package entity;

import entity.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile SingularAttribute<Actor, Integer> idactor;
    public static volatile SingularAttribute<Actor, String> nameactor;
    public static volatile ListAttribute<Actor, Movie> movieList;

}