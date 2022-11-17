package Backend.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Dto.TheaterSeatDto;
import Backend.Project.BookMyShow.Repository.TheaterSeatRepository;
import Backend.Project.BookMyShow.Service.TheaterSeatService;

@Service
@Component
public class TheaterSeatServiceImpl implements TheaterSeatService {
    @Autowired
    TheaterSeatRepository theaterSeatRepository;
    
    @Override
    public void addTheaterSeat(TheaterSeatDto TheaterDtoDto) {
        
    }

    @Override
    public TheaterSeatDto getTheaterSeat(int id) {
        
        return null;
    }
    
}
