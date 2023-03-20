package shop.mtcoding.transferdto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.transferdto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.transferdto.service.BoardService;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id){
        BoardJoinUserDtoV2 dto = boardService.게시글상세보기(id);
        return ResponseEntity.ok().body(dto);
    }
}