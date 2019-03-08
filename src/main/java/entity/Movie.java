/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m")
    , @NamedQuery(name = "Movie.findByIdmovie", query = "SELECT m FROM Movie m WHERE m.idmovie = :idmovie")
    , @NamedQuery(name = "Movie.findByDuration", query = "SELECT m FROM Movie m WHERE m.duration = :duration")
    , @NamedQuery(name = "Movie.findByImage", query = "SELECT m FROM Movie m WHERE m.image = :image")
    , @NamedQuery(name = "Movie.findByLanguage", query = "SELECT m FROM Movie m WHERE m.language = :language")
    , @NamedQuery(name = "Movie.findByMoviename", query = "SELECT m FROM Movie m WHERE m.moviename = :moviename")
    , @NamedQuery(name = "Movie.findByRated", query = "SELECT m FROM Movie m WHERE m.rated = :rated")
    , @NamedQuery(name = "Movie.findByStart", query = "SELECT m FROM Movie m WHERE m.start = :start")
    , @NamedQuery(name = "Movie.findByStatus", query = "SELECT m FROM Movie m WHERE m.status = :status")
    , @NamedQuery(name = "Movie.findByTrailler", query = "SELECT m FROM Movie m WHERE m.trailler = :trailler")
    , @NamedQuery(name = "Movie.findByIdcatagory", query = "SELECT m FROM Movie m WHERE m.idcatagory = :idcatagory")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmovie")
    private Integer idmovie;
    @Lob
    @Column(name = "discription")
    private String discription;
    @Column(name = "duration")
    private Integer duration;
    @Column(name = "image")
    private String image;
    @Column(name = "language")
    private String language;
    @Column(name = "moviename")
    private String moviename;
    @Column(name = "rated")
    private String rated;
    @Column(name = "start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date start;
    @Column(name = "status")
    private Integer status;
    @Column(name = "trailler")
    private String trailler;
    @Column(name = "idcatagory")
    private Integer idcatagory;
    @ManyToMany(mappedBy = "movieList",fetch = FetchType.EAGER)
    private List<Cinema> cinemaList;
    @JoinColumn(name = "idactor", referencedColumnName = "idactor")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Actor idactor;
    @JoinColumn(name = "idcategory", referencedColumnName = "idcategory")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Category idcategory;
    @JoinColumn(name = "iddirector", referencedColumnName = "iddirector")
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private Director iddirector;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmovie",fetch = FetchType.LAZY)
    private List<Showtime> showtimeList;

    public Movie() {
    }

    public Movie(Integer idmovie) {
        this.idmovie = idmovie;
    }

    public Integer getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Integer idmovie) {
        this.idmovie = idmovie;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTrailler() {
        return trailler;
    }

    public void setTrailler(String trailler) {
        this.trailler = trailler;
    }

    public Integer getIdcatagory() {
        return idcatagory;
    }

    public void setIdcatagory(Integer idcatagory) {
        this.idcatagory = idcatagory;
    }

    @XmlTransient
    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public Actor getIdactor() {
        return idactor;
    }

    public void setIdactor(Actor idactor) {
        this.idactor = idactor;
    }

    public Category getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Category idcategory) {
        this.idcategory = idcategory;
    }

    public Director getIddirector() {
        return iddirector;
    }

    public void setIddirector(Director iddirector) {
        this.iddirector = iddirector;
    }

    @XmlTransient
    public List<Showtime> getShowtimeList() {
        return showtimeList;
    }

    public void setShowtimeList(List<Showtime> showtimeList) {
        this.showtimeList = showtimeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovie != null ? idmovie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.idmovie == null && other.idmovie != null) || (this.idmovie != null && !this.idmovie.equals(other.idmovie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idmovie=" + idmovie + "";
    }
    
}
