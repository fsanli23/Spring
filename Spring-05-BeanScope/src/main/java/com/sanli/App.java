package com.sanli;

import com.sanli.config.ProjectConfig;
import com.sanli.model.Comment;
import com.sanli.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Fatih");
        comment.setText("Spring framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService c1 = context.getBean(CommentService.class);
        CommentService c2 = context.getBean(CommentService.class);

        System.out.println(c1 == c2);




    }


}
