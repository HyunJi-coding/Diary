package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Notice;
import org.example.repository.NoticeRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;
    @Transactional(readOnly = true)
    public List<Notice> findAll() {
        return noticeRepository.findAll(Sort.by(Direction.DESC, "id"));
    }

    public Notice saveNotice(String title, String content) {
        return noticeRepository.save(new Notice(title, content));
    }

    public void deleteNotice(Long id) {
        noticeRepository.findById(id).ifPresent(noticeRepository::delete);
    }
}
