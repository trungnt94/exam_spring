package com.example.test_ejb.model;

import com.example.test_ejb.entity.Candidate;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CandidateModel extends PagingAndSortingRepository<Candidate, Integer> {
}
