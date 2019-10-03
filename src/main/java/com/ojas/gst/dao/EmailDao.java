
  package com.ojas.gst.dao;
  
  import com.ojas.gst.entity.EmailUser; import com.ojas.gst.entity.Response;
  
  public interface EmailDao extends Dao<EmailUser, Long>{
  
  public Response saveEmail(EmailUser mail) ;
  
  
  
  }
 