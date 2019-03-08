package entity;

import entity.Ticket;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Ticket> ticketList;
    public static volatile SingularAttribute<User, Integer> role;
    public static volatile SingularAttribute<User, String> token;
    public static volatile SingularAttribute<User, String> username;

}