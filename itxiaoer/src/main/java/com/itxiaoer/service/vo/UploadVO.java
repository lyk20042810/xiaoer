package com.itxiaoer.service.vo;

import com.itxiaoer.core.dal.entity.Post;
import com.itxiaoer.core.dal.entity.Upload;
import com.itxiaoer.core.dal.entity.User;

/**
 * 附件业务对象
 * 
 * @author zhou
 *
 */
public class UploadVO extends Upload{
  private Post post;
  private User user;

  public Post getPost(){
    return post;
  }

  public void setPost(Post post){
    this.post = post;
  }

  public User getUser(){
    return user;
  }

  public void setUser(User user){
    this.user = user;
  }

}
