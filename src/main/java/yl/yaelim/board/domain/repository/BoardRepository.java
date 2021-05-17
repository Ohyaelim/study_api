package yl.yaelim.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yl.yaelim.board.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
