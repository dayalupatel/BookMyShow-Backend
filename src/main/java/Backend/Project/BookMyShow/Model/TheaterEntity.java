package Backend.Project.BookMyShow.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Backend.Project.BookMyShow.enums.TheaterType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="theaters")
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    // @Enumerated(EnumType.STRING)
    // @Column(name = "seatType", nullable = false)
    // private SeatType seatType;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "theaterType", nullable = false)
    private TheaterType theaterType;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> showList;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TheaterSeatEntity> theaterSeatList;
    
}
