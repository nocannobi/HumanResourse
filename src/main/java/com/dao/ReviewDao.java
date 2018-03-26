package com.dao;

import com.po.Employee;
import com.po.Review;

import java.util.List;

public interface ReviewDao {
    boolean addReview(Review review);
    boolean updateReview(Review review);
    Review queryReviewById(Review review);
    List<Review> queryReviewByEid(Employee employee);
    List<Review> queryAllReview();
}
