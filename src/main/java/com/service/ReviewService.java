package com.service;

import com.entity.Employee;
import com.entity.Review;

import java.util.List;

public interface ReviewService {
    boolean addReview(Review review);
    boolean updateReview(Review review);
    Review queryReviewById(Review review);
    List<Review> queryReviewByEid(Employee employee);
    List<Review> queryAllReview();
}
