package com.hedspi.library.service;

import com.hedspi.library.model.Reader;
import com.hedspi.library.repository.ReaderRepository;
import com.hedspi.library.request.ReaderSearchRequest;
import com.hedspi.library.response.ReaderSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReaderService {
    @Autowired
    private ReaderRepository readerRepository;

    public Page<ReaderSearch> searchReader(ReaderSearchRequest readerSearchRequest, Pageable pageable){
        return readerRepository.searchReaders(readerSearchRequest.getId(),readerSearchRequest.getKeyword(),pageable);
    }

    public Page<ReaderSearch> searchReaderByKeyword(ReaderSearchRequest readerSearchRequest, Pageable pageable){
        return readerRepository.searchReadersByKeyword(readerSearchRequest.getKeyword(),pageable);
    }

    public Optional<Reader> findById(Integer id){
        return readerRepository.findById(id);
    }
}
