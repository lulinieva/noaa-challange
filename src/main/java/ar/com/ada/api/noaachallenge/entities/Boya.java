package ar.com.ada.api.noaachallenge.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "boya")
public class Boya {
    
    @Id
    @Column(name = "boya_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boyaId;

    private String colorLuz;

    @Column(name = "longitud_instalacion")
    private Double longitudInstlacion;

    @Column(name = "latitud_instalacion")
    private Double latiudInstalcion;

    @OneToMany(mappedBy = "boya", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Muestra> muestras = new ArrayList<>();

    public Integer getBoyaId() {
        return boyaId;
    }

    public void setBoyaId(Integer boyaId) {
        this.boyaId = boyaId;
    }

    public String getColorLuz() {
        return colorLuz;
    }

    public void setColorLuz(String colorLuz) {
        this.colorLuz = colorLuz;
    }

    public Double getLongitudInstlacion() {
        return longitudInstlacion;
    }

    public void setLongitudInstlacion(Double longitudInstlacion) {
        this.longitudInstlacion = longitudInstlacion;
    }

    public Double getLatiudInstalcion() {
        return latiudInstalcion;
    }

    public void setLatiudInstalcion(Double latiudInstalcion) {
        this.latiudInstalcion = latiudInstalcion;
    }

    public void agregarMuestra(Muestra muestra){
        this.muestras.add(muestra); 
        muestra.setBoya(this); 

    }

    

    
}
