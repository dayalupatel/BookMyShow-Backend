package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.ShowEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import Backend.Project.BookMyShow.Service.Impl.ShowServiceImpl;

@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    ShowServiceImpl showService;

    @GetMapping("/get-show/{id}")
    public ResponseEntity<ShowResponseDto> getShow(@RequestParam int id) {
        return new ResponseEntity<>(showService.getShow(id), HttpStatus.FOUND);
    }

    @PostMapping("/add-show")
    public ResponseEntity<ShowResponseDto> addShow(@RequestBody ShowEntryDto showEntryDto) {
        return new ResponseEntity<>(showService.addShow(showEntryDto), HttpStatus.CREATED);
    }
}
