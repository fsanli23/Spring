package com.sanli.proxy;

import com.sanli.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotificationProxy implements CommentNotificationProxy {


    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending  Email Notification for Comment" + comment.getText());
    }
}
