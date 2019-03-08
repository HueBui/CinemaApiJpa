/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "actor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actor.findAll", query = "SELECT a FROM Actor a")
    , @NamedQuery(name = "Actor.findByIdactor", query = "SELECT a FROM Actor a WHERE a.idactor = :idactor")
    , @NamedQuery(name = "Actor.findByNameactor", query = "SELECT a FROM Actor a WHERE a.nameactor = :nameactor")})
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idactor")
    private Integer idactor;
    @Column(name = "nameactor")
    private String nameactor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idactor")
    private List<Movie> movieList;

    public Actor() {
    }

    public Actor(Integer idactor) {
        this.idactor = idactor;
    }

    public Integer getIdactor() {
        return idactor;
    }

    public void setIdactor(Integer idactor) {
        this.idactor = idactor;
    }

    public String getNameactor() {
        return nameactor;
    }

    public void setNameactor(String nameactor) {
        this.nameactor = nameactor;
    }

    @XmlTransient
    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactor != null ? idactor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actor)) {
            return false;
        }
        Actor other = (Actor) object;
        if ((this.idactor == null && other.idactor != null) || (this.idactor != null && !this.idactor.equals(other.idactor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idactor=" + idactor + "";
    }

//    @Override
//    public String toString() {
//        return "Actor{" +
//                "idactor=" + idactor +
//                ", nameactor='" + nameactor + '\'' +
//                ", movieList=" + movieList +
//                '}';
//    }
}
