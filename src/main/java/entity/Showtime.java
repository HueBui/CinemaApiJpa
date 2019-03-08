/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "showtime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Showtime.findAll", query = "SELECT s FROM Showtime s")
    , @NamedQuery(name = "Showtime.findByIdshowtime", query = "SELECT s FROM Showtime s WHERE s.idshowtime = :idshowtime")
    , @NamedQuery(name = "Showtime.findByDateshow", query = "SELECT s FROM Showtime s WHERE s.dateshow = :dateshow")
    , @NamedQuery(name = "Showtime.findByFrametime", query = "SELECT s FROM Showtime s WHERE s.frametime = :frametime")})
public class Showtime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idshowtime")
    private Integer idshowtime;
    @Column(name = "dateshow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateshow;
    @Column(name = "frametime")
    private Integer frametime;
    @JoinColumn(name = "idmovie", referencedColumnName = "idmovie")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Movie idmovie;
    @JoinColumn(name = "idroom", referencedColumnName = "idroom")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Room idroom;

    public Showtime() {
    }

    public Showtime(Integer idshowtime) {
        this.idshowtime = idshowtime;
    }

    public Integer getIdshowtime() {
        return idshowtime;
    }

    public void setIdshowtime(Integer idshowtime) {
        this.idshowtime = idshowtime;
    }

    public Date getDateshow() {
        return dateshow;
    }

    public void setDateshow(Date dateshow) {
        this.dateshow = dateshow;
    }

    public Integer getFrametime() {
        return frametime;
    }

    public void setFrametime(Integer frametime) {
        this.frametime = frametime;
    }

    public Movie getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Movie idmovie) {
        this.idmovie = idmovie;
    }

    public Room getIdroom() {
        return idroom;
    }

    public void setIdroom(Room idroom) {
        this.idroom = idroom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idshowtime != null ? idshowtime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Showtime)) {
            return false;
        }
        Showtime other = (Showtime) object;
        if ((this.idshowtime == null && other.idshowtime != null) || (this.idshowtime != null && !this.idshowtime.equals(other.idshowtime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Showtime[ idshowtime=" + idshowtime + " ]";
    }
    
}
