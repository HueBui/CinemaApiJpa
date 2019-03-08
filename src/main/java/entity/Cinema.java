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
@Table(name = "cinema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cinema.findAll", query = "SELECT c FROM Cinema c")
    , @NamedQuery(name = "Cinema.findByIdcinema", query = "SELECT c FROM Cinema c WHERE c.idcinema = :idcinema")
    , @NamedQuery(name = "Cinema.findByAddress", query = "SELECT c FROM Cinema c WHERE c.address = :address")
    , @NamedQuery(name = "Cinema.findByArea", query = "SELECT c FROM Cinema c WHERE c.area = :area")
    , @NamedQuery(name = "Cinema.findByNamecinema", query = "SELECT c FROM Cinema c WHERE c.namecinema = :namecinema")})
public class Cinema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcinema")
    private Integer idcinema;
    @Column(name = "address")
    private String address;
    @Column(name = "area")
    private String area;
    @Column(name = "namecinema")
    private String namecinema;
    @JoinTable(name = "cinema_movie", joinColumns = {
        @JoinColumn(name = "idcinema", referencedColumnName = "idcinema")}, inverseJoinColumns = {
        @JoinColumn(name = "idmovie", referencedColumnName = "idmovie")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Movie> movieList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcinema",fetch = FetchType.LAZY)
    private List<Room> roomList;

    public Cinema() {
    }

    public Cinema(Integer idcinema) {
        this.idcinema = idcinema;
    }

    public Integer getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(Integer idcinema) {
        this.idcinema = idcinema;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNamecinema() {
        return namecinema;
    }

    public void setNamecinema(String namecinema) {
        this.namecinema = namecinema;
    }

    @XmlTransient
    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @XmlTransient
    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcinema != null ? idcinema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cinema)) {
            return false;
        }
        Cinema other = (Cinema) object;
        if ((this.idcinema == null && other.idcinema != null) || (this.idcinema != null && !this.idcinema.equals(other.idcinema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cinema[ idcinema=" + idcinema + " ]";
    }
    
}
