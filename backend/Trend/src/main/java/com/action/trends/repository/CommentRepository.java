package com.action.trends.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.action.trends.dto.Comment;

@Repository
public interface CommentRepository {
	List<HashMap<String, Object>> readByTrendId(int trendId);

	int insert(Comment comment);

	int update(Comment comment);

	int delete(int id);
}
