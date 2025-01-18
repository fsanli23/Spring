package com.sanli.proxy;

import com.sanli.model.Comment;

public interface CommentNotificationProxy {
    void sentComment(Comment comment);
}
