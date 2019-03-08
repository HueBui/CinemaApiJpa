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
@Table(name = "director")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Director.findAll", query = "SELECT d FROM Director d")
    , @NamedQuery(name = "Director.findByIddirector", query = "SELECT d FROM Director d WHERE d.iddirector = :iddirector")
    , @NamedQuery(name = "Director.findByNamedirector", query = "SELECT d FROM Director d WHERE d.namedirector = :namedirector")})
public class Director implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddirector")
    private Integer iddirector;
    @Column(name = "namedirector")
    private String namedirector;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddirector",fetch = FetchType.EAGER)
    private List<Movie> movieList;

    public Director() {
    }

    public Director(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public Integer getIddirector() {
        return iddirector;
    }

    public void setIddirector(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public String getNamedirector() {
        return namedirector;
    }

    public void setNamedirector(String namedirector) {
        this.namedirector = namedirector;
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
        hash += (iddirector != null ? iddirector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director)) {
            return false;
        }
        Director other = (Director) object;
        if ((this.iddirector == null && other.iddirector != null) || (this.iddirector != null && !this.iddirector.equals(other.iddirector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Director[ iddirector=" + iddirector + " ]";
    }
    
}
