package entity;

import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-08T22:09:28")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Integer> idshowtime;
    public static volatile SingularAttribute<Ticket, User> iduser;
    public static volatile SingularAttribute<Ticket, Integer> idseat;
    public static volatile SingularAttribute<Ticket, Integer> idticket;
    public static volatile SingularAttribute<Ticket, Integer> price;
    public static volatile SingularAttribute<Ticket, Integer> status;

}