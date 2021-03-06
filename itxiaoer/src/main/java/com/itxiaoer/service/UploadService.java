package com.itxiaoer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itxiaoer.core.dal.entity.Upload;
import com.itxiaoer.core.dal.mapper.BaseMapper;
import com.itxiaoer.core.dal.mapper.UploadMapper;
import com.itxiaoer.core.plugin.PageModel;
import com.itxiaoer.service.vo.UploadVO;

@Service
public class UploadService extends BaseService{
  @Autowired
  private UploadMapper uploadMapper;

  public PageModel<UploadVO> list(int pageIndex, int pageSize){
    PageModel<UploadVO> pageModel = new PageModel<>(pageIndex, pageSize);
    list(pageModel);

    return pageModel;
  }

  public List<Upload> listByPostid(String postid){
    return uploadMapper.listByPostid(postid);
  }

  public void updatePostid(String postid, List<String> imgpaths){
    uploadMapper.updatePostid(postid, imgpaths);
  }

  /**
   * 将所有postid的记录置空,非删除记录
   * 
   * @param postid
   */
  public void setNullPostid(String postid){
    uploadMapper.setNullPostid(postid);
  }

  public void deleteByPostid(String postid){
    uploadMapper.deleteByPostid(postid);
  }

  @Override
  protected BaseMapper getMapper(){
    return uploadMapper;
  }

}
