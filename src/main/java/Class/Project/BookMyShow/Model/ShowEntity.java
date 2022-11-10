package Class.Project.BookMyShow.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="shows")
public class ShowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate showDate;
    private LocalTime showTime;

    @CreationTimestamp
    Date createdOn;
    
    @UpdateTimestamp
    Date updatedOn;

    @ManyToOne
    @JsonIgnore
    private MovieEntity movie;

    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;

    @OneToMany
    @JsonIgnore
    private List<TicketEntity> listOfTickets;

    @OneToMany
    @JoinColumn
    @JsonIgnore
    private List<ShowSeatsEntity> listOfShowSeats;
}
