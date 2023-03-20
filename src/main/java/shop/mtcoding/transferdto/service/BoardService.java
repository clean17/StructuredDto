package shop.mtcoding.transferdto.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.transferdto.dto.BoardDetailOutDto;
import shop.mtcoding.transferdto.dto.BoardDetailOutDto2;
import shop.mtcoding.transferdto.model.board.BoardRepository;

@Service
@Transactional(readOnly =  true)
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public BoardDetailOutDto2 게시글상세보기(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그 : "+boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 =
                new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : "+boardDetailOutDto2);
        return boardDetailOutDto2;
    }
    
}
