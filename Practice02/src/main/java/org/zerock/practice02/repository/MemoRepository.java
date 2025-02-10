package org.zerock.practice02.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.practice02.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByMnoBetweenOrderByMnoDesc(Long from, Long to);
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);
    void deleteMemoByMnoLessThan(Long mno);
}
