package entity;

import entity.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:18:17")
@StaticMetamodel(Director.class)
public class Director_ { 

    public static volatile SingularAttribute<Director, Integer> iddirector;
    public static volatile SingularAttribute<Director, String> namedirector;
    public static volatile ListAttribute<Director, Movie> movieList;

}