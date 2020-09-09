package com.serviceImpl;

import com.dao.ReviewDao;
import com.entity.Employee;
import com.entity.Review;
import com.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    @Override
    public boolean addReview(Review review) {
        if(review == null){
           return false;
        }
        return reviewDao.addReview(review);
    }

    @Override
    public boolean updateReview(Review review) {
        if(review == null){
            return false;
        }
        return reviewDao.updateReview(review);
    }

    @Override
    public Review queryReviewById(Review review) {
        if(review == null){
            return null;
        }
        return reviewDao.queryReviewById(review);
    }

    @Override
    public List<Review> queryReviewByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return reviewDao.queryReviewByEid(employee);
    }

    @Override
    public List<Review> queryAllReview() {
        return reviewDao.queryAllReview();
    }
}
