package com.pnudev.communalpropertyregistry.service;

import com.pnudev.communalpropertyregistry.domain.AttachmentCategory;
import com.pnudev.communalpropertyregistry.dto.AttachmentCategoryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AttachmentCategoryService {

    Page<AttachmentCategory> findAll(Pageable pageable);

    AttachmentCategory findById(Long id);

    void updateById(Long id, AttachmentCategoryDto attachmentCategoryDto);

    void create(AttachmentCategoryDto attachmentCategoryDto);

    void delete(Long id);
}
