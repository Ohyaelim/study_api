package yl.yaelim.board.domain.service;

import org.springframework.stereotype.Service;
import yl.yaelim.board.domain.dto.BoardDto;
import yl.yaelim.board.domain.repository.BoardRepository;

import javax.transaction.Transactional;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
