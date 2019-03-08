/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
    , @NamedQuery(name = "Ticket.findByIdticket", query = "SELECT t FROM Ticket t WHERE t.idticket = :idticket")
    , @NamedQuery(name = "Ticket.findByPrice", query = "SELECT t FROM Ticket t WHERE t.price = :price")
    , @NamedQuery(name = "Ticket.findByStatus", query = "SELECT t FROM Ticket t WHERE t.status = :status")
    , @NamedQuery(name = "Ticket.findByIdseat", query = "SELECT t FROM Ticket t WHERE t.idseat = :idseat")
    , @NamedQuery(name = "Ticket.findByIdshowtime", query = "SELECT t FROM Ticket t WHERE t.idshowtime = :idshowtime")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idticket")
    private Integer idticket;
    @Column(name = "price")
    private Integer price;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @Column(name = "idseat")
    private int idseat;
    @Basic(optional = false)
    @Column(name = "idshowtime")
    private int idshowtime;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private User iduser;

    public Ticket() {
    }

    public Ticket(Integer idticket) {
        this.idticket = idticket;
    }

    public Ticket(Integer idticket, int idseat, int idshowtime) {
        this.idticket = idticket;
        this.idseat = idseat;
        this.idshowtime = idshowtime;
    }

    public Integer getIdticket() {
        return idticket;
    }

    public void setIdticket(Integer idticket) {
        this.idticket = idticket;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getIdseat() {
        return idseat;
    }

    public void setIdseat(int idseat) {
        this.idseat = idseat;
    }

    public int getIdshowtime() {
        return idshowtime;
    }

    public void setIdshowtime(int idshowtime) {
        this.idshowtime = idshowtime;
    }

    public User getIduser() {
        return iduser;
    }

    public void setIduser(User iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idticket != null ? idticket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.idticket == null && other.idticket != null) || (this.idticket != null && !this.idticket.equals(other.idticket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ticket[ idticket=" + idticket + " ]";
    }
    
}
