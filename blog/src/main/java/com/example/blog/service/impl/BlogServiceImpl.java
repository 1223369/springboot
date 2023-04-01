package com.example.blog.service.impl;

import com.example.blog.entity.Blog;
import com.example.blog.mapper.BlogMapper;
import com.example.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author alan
 * @since 2022-03-18
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
