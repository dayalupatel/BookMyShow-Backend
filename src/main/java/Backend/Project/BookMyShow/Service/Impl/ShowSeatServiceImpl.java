package Backend.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Dto.ShowSeatDto;
import Backend.Project.BookMyShow.Repository.ShowSeatRepository;
import Backend.Project.BookMyShow.Service.ShowSeatService;

@Service
@Component
public class ShowSeatServiceImpl implements ShowSeatService {
    @Autowired
    ShowSeatRepository showSeatRepository;
    
    @Override
    public void addShowSeat(ShowSeatDto showSeatDto) {
        
    }

    @Override
    public ShowSeatDto getShowSeat(int id) {
        return null;
    }
    
}
