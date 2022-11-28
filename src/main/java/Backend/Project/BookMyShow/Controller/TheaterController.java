package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.TheaterEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import Backend.Project.BookMyShow.Service.Impl.TheaterServiceImpl;


@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterServiceImpl theaterService;

    @GetMapping("/get-theater")
    public ResponseEntity<TheaterResponseDto> getTheater(@RequestParam("id") int id) {
        return new ResponseEntity<>(theaterService.getTheater(id) , HttpStatus.FOUND);
    }

    @PostMapping("/add-theater")
    public ResponseEntity<TheaterResponseDto> addTheater(@RequestBody TheaterEntryDto theaterEntryDto) {
        return new ResponseEntity<>(theaterService.addTheater(theaterEntryDto), HttpStatus.CREATED);
    }

}
