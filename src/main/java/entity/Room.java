/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "room")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r")
    , @NamedQuery(name = "Room.findByIdroom", query = "SELECT r FROM Room r WHERE r.idroom = :idroom")
    , @NamedQuery(name = "Room.findByNameroom", query = "SELECT r FROM Room r WHERE r.nameroom = :nameroom")
    , @NamedQuery(name = "Room.findByQuantityseat", query = "SELECT r FROM Room r WHERE r.quantityseat = :quantityseat")
    , @NamedQuery(name = "Room.findByStatus", query = "SELECT r FROM Room r WHERE r.status = :status")})
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idroom")
    private Integer idroom;
    @Column(name = "nameroom")
    private String nameroom;
    @Column(name = "quantityseat")
    private Integer quantityseat;
    @Column(name = "status")
    private Integer status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idroom",fetch = FetchType.LAZY)
    private List<Seat> seatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idroom",fetch = FetchType.LAZY)
    private List<Showtime> showtimeList;
    @JoinColumn(name = "idcinema", referencedColumnName = "idcinema")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Cinema idcinema;

    public Room() {
    }

    public Room(Integer idroom) {
        this.idroom = idroom;
    }

    public Integer getIdroom() {
        return idroom;
    }

    public void setIdroom(Integer idroom) {
        this.idroom = idroom;
    }

    public String getNameroom() {
        return nameroom;
    }

    public void setNameroom(String nameroom) {
        this.nameroom = nameroom;
    }

    public Integer getQuantityseat() {
        return quantityseat;
    }

    public void setQuantityseat(Integer quantityseat) {
        this.quantityseat = quantityseat;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @XmlTransient
    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    @XmlTransient
    public List<Showtime> getShowtimeList() {
        return showtimeList;
    }

    public void setShowtimeList(List<Showtime> showtimeList) {
        this.showtimeList = showtimeList;
    }

    public Cinema getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(Cinema idcinema) {
        this.idcinema = idcinema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idroom != null ? idroom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.idroom == null && other.idroom != null) || (this.idroom != null && !this.idroom.equals(other.idroom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Room[ idroom=" + idroom + " ]";
    }
    
}
