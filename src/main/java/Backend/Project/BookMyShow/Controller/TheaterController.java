package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.TheaterEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import Backend.Project.BookMyShow.Service.Impl.TheaterServiceImpl;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterServiceImpl theaterService;

    @GetMapping("/get-theater/{id}")
    public ResponseEntity<TheaterResponseDto> getTheater(@PathVariable(value = "id") int id) {
        return new ResponseEntity<>(theaterService.getTheater(id) , HttpStatus.FOUND);
    }

    @PostMapping("/add-theater")
    public ResponseEntity<TheaterResponseDto> addTheater(@RequestBody TheaterEntryDto theaterEntryDto) {
        return new ResponseEntity<>(theaterService.addTheater(theaterEntryDto), HttpStatus.CREATED);
    }

}
