package ar.com.ada.api.apihotel.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {

    // en java se tiene q escribir en camelcase,
    // a pesar d q en mysql este con _
    @Id
    @Column(name = "reserva_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservaId;// tiene un huesped
    @Column(name = "fecha_reserva")
    private Date fechaReserva;
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    @Column(name = "fecha_egreso")
    private Date fechaEgreso;
    private Integer habitacion;
    @Column(name = "importe_reserva")
    private BigDecimal importeReserva;
    @Column(name = "importe_total")
    private BigDecimal importeTotal;
    @Column(name = "saldo_pendiente_pgo")
    private BigDecimal saldoPendienteDePago;
    @Column(name = "id_estado")
    private int tipoestadoId;// Por ahora vamos a crear este como int
    @ManyToOne
    @JoinColumn(name = "huesped_id", referencedColumnName = "huesped_id")
    private Huesped huesped;

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    public BigDecimal getImporteReserva() {
        return importeReserva;
    }

    public void setImporteReserva(BigDecimal importeReserva) {
        this.importeReserva = importeReserva;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getSaldoPendienteDePago() {
        return saldoPendienteDePago;
    }

    public void setSaldoPendienteDePago(BigDecimal saldoPendienteDePago) {
        this.saldoPendienteDePago = saldoPendienteDePago;
    }

    public int getTipoestadoId() {
        return tipoestadoId;
    }

    public void setTipoestadoId(int tipoestadoId) {
        this.tipoestadoId = tipoestadoId;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
        this.huesped.getReservas().add(this);
    }

    // Sirve para debugear, no usar para mostrar en la terminal(usar .getAlgo())
    @Override
    public String toString() {
        return " [reservaid = " + this.getReservaId() + ", importe = " + this.getImporteTotal() + "] ";
    }

   
}
