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
@Table(name = "seat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
    , @NamedQuery(name = "Seat.findByIdseat", query = "SELECT s FROM Seat s WHERE s.idseat = :idseat")
    , @NamedQuery(name = "Seat.findByNamerow", query = "SELECT s FROM Seat s WHERE s.namerow = :namerow")
    , @NamedQuery(name = "Seat.findByRow", query = "SELECT s FROM Seat s WHERE s.row = :row")
    , @NamedQuery(name = "Seat.findBySeattype", query = "SELECT s FROM Seat s WHERE s.seattype = :seattype")
    , @NamedQuery(name = "Seat.findByStatus", query = "SELECT s FROM Seat s WHERE s.status = :status")})
public class Seat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idseat")
    private Integer idseat;
    @Column(name = "namerow")
    private Integer namerow;
    @Column(name = "row")
    private String row;
    @Column(name = "seattype")
    private Integer seattype;
    @Column(name = "status")
    private Integer status;
    @JoinColumn(name = "idroom", referencedColumnName = "idroom")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Room idroom;

    public Seat() {
    }

    public Seat(Integer idseat) {
        this.idseat = idseat;
    }

    public Integer getIdseat() {
        return idseat;
    }

    public void setIdseat(Integer idseat) {
        this.idseat = idseat;
    }

    public Integer getNamerow() {
        return namerow;
    }

    public void setNamerow(Integer namerow) {
        this.namerow = namerow;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public Integer getSeattype() {
        return seattype;
    }

    public void setSeattype(Integer seattype) {
        this.seattype = seattype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        hash += (idseat != null ? idseat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seat)) {
            return false;
        }
        Seat other = (Seat) object;
        if ((this.idseat == null && other.idseat != null) || (this.idseat != null && !this.idseat.equals(other.idseat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Seat[ idseat=" + idseat + " ]";
    }
    
}
