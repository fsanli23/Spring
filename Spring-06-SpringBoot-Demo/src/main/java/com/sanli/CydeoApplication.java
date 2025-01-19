package com.sanli;

import com.sanli.model.Comment;
import com.sanli.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Fatih");
        comment.setText("Spring framework");
        SpringApplication.run(CydeoApplication.class, args).getBean(CommentService.class).publishComment(comment);


    }


}
