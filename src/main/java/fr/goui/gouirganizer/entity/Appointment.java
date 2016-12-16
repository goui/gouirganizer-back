package fr.goui.gouirganizer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * Entity representing an appointment.
 */
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private ZonedDateTime beginDate;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Act.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "ACT_ID")
    private Act act;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Client.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_fk")
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(ZonedDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id &&
                Objects.equals(beginDate, that.beginDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beginDate);
    }
}
