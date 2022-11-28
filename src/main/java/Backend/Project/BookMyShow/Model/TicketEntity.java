package Backend.Project.BookMyShow.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name="tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "allotedSeat", nullable = false)
    private String allotedSeats;

    @Column(name = "amount", nullable = false)
    private double amount;

    @CreationTimestamp
    @Column(name = "bookedAt", nullable = false)
    private Date bookedAt;
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private UserEntity user;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seatList;
    
}
