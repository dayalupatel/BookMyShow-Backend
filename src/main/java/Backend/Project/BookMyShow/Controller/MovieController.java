package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.MovieEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import Backend.Project.BookMyShow.Service.Impl.MovieServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieServiceImpl movieSerivice;

    @GetMapping(value="/get-movie")
    public ResponseEntity<MovieResponseDto> getMovie(@RequestParam("id") int id) {
        return new ResponseEntity<>(movieSerivice.getMovie(id), HttpStatus.FOUND);
    }
    
    @PostMapping("/add-movie")
    public ResponseEntity<MovieResponseDto> addMovie(@RequestBody MovieEntryDto movieEntryDto) {
        return new ResponseEntity<>(movieSerivice.addMovie(movieEntryDto), HttpStatus.CREATED);
    }
}
