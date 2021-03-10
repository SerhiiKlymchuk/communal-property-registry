package com.pnudev.communalpropertyregistry.service;

import com.pnudev.communalpropertyregistry.domain.CategoryByPurpose;
import com.pnudev.communalpropertyregistry.dto.CategoryByPurposeDto;
import com.pnudev.communalpropertyregistry.dto.CategoryByPurposePageDto;
import com.pnudev.communalpropertyregistry.dto.CategoryByPurposeResponseDto;
import org.springframework.data.domain.Pageable;


public interface CategoryByPurposeService {

    CategoryByPurposeResponseDto findAll();

    CategoryByPurposePageDto findAll(Pageable pageable);

    CategoryByPurpose findById(Long id);

    void create(CategoryByPurposeDto categoryByPurposeDto);

    void update(CategoryByPurposeDto categoryByPurposeDto, Long categoryId);

    void delete(Long id);

}
