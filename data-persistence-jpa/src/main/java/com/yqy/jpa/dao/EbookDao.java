package com.yqy.jpa.dao;

import com.yqy.jpa.domain.Ebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EbookDao extends JpaRepository<Ebook, Long> {
}
