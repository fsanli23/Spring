package com.sanli.proxy;

import com.sanli.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sentComment(Comment comment) {
        System.out.println("sending push notification for comment :" + comment.getText());

    }
}
