package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.ShowDto;
import Backend.Project.BookMyShow.Model.ShowEntity;

public interface ShowService {
    // Add Show
    ShowEntity addShow(ShowDto showDto);

    // Get Show
    ShowDto getShow(int id);
}
