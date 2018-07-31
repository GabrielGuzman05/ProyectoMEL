/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "seriegenerica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seriegenerica.findAll", query = "SELECT s FROM Seriegenerica s")
    , @NamedQuery(name = "Seriegenerica.findByIdSerie", query = "SELECT s FROM Seriegenerica s WHERE s.idSerie = :idSerie")
    , @NamedQuery(name = "Seriegenerica.findByNombre", query = "SELECT s FROM Seriegenerica s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Seriegenerica.findByNombreAlternativo", query = "SELECT s FROM Seriegenerica s WHERE s.nombreAlternativo = :nombreAlternativo")
    , @NamedQuery(name = "Seriegenerica.findByEstadoUsuarioidEstadoUsuario", query = "SELECT s FROM Seriegenerica s WHERE s.estadoUsuarioidEstadoUsuario = :estadoUsuarioidEstadoUsuario")
    , @NamedQuery(name = "Seriegenerica.findByCadena", query = "SELECT s FROM Seriegenerica s WHERE s.cadena = :cadena")
    , @NamedQuery(name = "Seriegenerica.findByEpisodios", query = "SELECT s FROM Seriegenerica s WHERE s.episodios = :episodios")})
public class Seriegenerica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSerie")
    private Integer idSerie;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "nombreAlternativo")
    private String nombreAlternativo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoUsuarioidEstadoUsuario")
    private int estadoUsuarioidEstadoUsuario;
    @Size(max = 255)
    @Column(name = "cadena")
    private String cadena;
    @Column(name = "episodios")
    private Integer episodios;

    public Seriegenerica() {
    }

    public Seriegenerica(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public Seriegenerica(Integer idSerie, int estadoUsuarioidEstadoUsuario) {
        this.idSerie = idSerie;
        this.estadoUsuarioidEstadoUsuario = estadoUsuarioidEstadoUsuario;
    }

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAlternativo() {
        return nombreAlternativo;
    }

    public void setNombreAlternativo(String nombreAlternativo) {
        this.nombreAlternativo = nombreAlternativo;
    }

    public int getEstadoUsuarioidEstadoUsuario() {
        return estadoUsuarioidEstadoUsuario;
    }

    public void setEstadoUsuarioidEstadoUsuario(int estadoUsuarioidEstadoUsuario) {
        this.estadoUsuarioidEstadoUsuario = estadoUsuarioidEstadoUsuario;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSerie != null ? idSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seriegenerica)) {
            return false;
        }
        Seriegenerica other = (Seriegenerica) object;
        if ((this.idSerie == null && other.idSerie != null) || (this.idSerie != null && !this.idSerie.equals(other.idSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "series.Seriegenerica[ idSerie=" + idSerie + " ]";
    }
    
}
