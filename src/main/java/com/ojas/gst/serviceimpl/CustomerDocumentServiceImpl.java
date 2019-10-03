/*
 * package com.ojas.gst.serviceimpl;
 * 
 * import java.io.IOException;
 * 
 * import javax.transaction.Transactional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.multipart.MultipartFile;
 * 
 * import com.ojas.gst.dao.CustomerDocumentDao; import
 * com.ojas.gst.entity.CustomerDocument; import
 * com.ojas.gst.service.CustomerDocumentService;
 * 
 * public class CustomerDocumentServiceImpl implements CustomerDocumentService{
 * 
 * @Autowired private CustomerDocumentDao customerDocumentDao;
 * 
 * @Override
 * 
 * @Transactional public void saveImageFile(Long id, MultipartFile file) {
 * 
 * try { CustomerDocument cd1=new CustomerDocument(); CustomerDocument cd =
 * customerDocumentDao.findById(id).get();
 * 
 * Byte[] byteObjects = new Byte[file.getBytes().length];
 * 
 * int i = 0;
 * 
 * for (byte b : file.getBytes()){ byteObjects[i++] = b; }
 * 
 * cd.setImage(byteObjects); // cd1.getImage();
 * 
 * customerDocumentDao.save(cd); } catch (IOException e) { e.printStackTrace();
 * } }
 * 
 * 
 * }
 */