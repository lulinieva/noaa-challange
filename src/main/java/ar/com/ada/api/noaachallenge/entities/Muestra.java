package ar.com.ada.api.noaachallenge.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "muestra")
public class Muestra {
    
    @Id
    @Column(name = "muestra_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer muestraId;

    @ManyToOne
    @JoinColumn(name = "boya_id", referencedColumnName = "boya_id")
    private Boya boya; //boyaId;

    @Column(name = "horario_muestra")
    private Date horarioMuestra;

    private String matriculaEmbarcacion;

    @Column(name = "longitud")
    private Double longitud;

    @Column(name = "latitutd")
    private Double latitud;

    @Column(name = "altura_al_nive_del_mar")
    private Double alturaAlNivelDelMar;

    public Integer getMuestraId() {
        return muestraId;
    }

    public void setMuestraId(Integer muestraId) {
        this.muestraId = muestraId;
    }

    public Boya getBoya() {
        return boya;
    }

    public void setBoya(Boya boya) {
        this.boya = boya;
    }

    public Date getHorarioMuestra() {
        return horarioMuestra;
    }

    public void setHorarioMuestra(Date horarioMuestra) {
        this.horarioMuestra = horarioMuestra;
    }

    public String getMatriculaEmbarcacion() {
        return matriculaEmbarcacion;
    }

    public void setMatriculaEmbarcacion(String matriculaEmbarcacion) {
        this.matriculaEmbarcacion = matriculaEmbarcacion;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getAlturaAlNivelDelMar() {
        return alturaAlNivelDelMar;
    }

    public void setAlturaAlNivelDelMar(Double alturaAlNivelDelMar) {
        this.alturaAlNivelDelMar = alturaAlNivelDelMar;
    }

    public enum EstadoFaroMuestraEnum {

        ROJO(1), AMARILLO(2), VERDE(3), AZUL(4);
        private final Integer value;

        
        private EstadoFaroMuestraEnum(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public static EstadoFaroMuestraEnum parse(Integer id) {
            EstadoFaroMuestraEnum status = null; // Default
            for (EstadoFaroMuestraEnum item : EstadoFaroMuestraEnum.values()) {
                if (item.getValue().equals(id)) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    }

    



}
