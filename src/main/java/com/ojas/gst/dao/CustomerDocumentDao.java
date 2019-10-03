
package com.ojas.gst.dao;

import com.ojas.gst.entity.CustomerDocument;

public interface CustomerDocumentDao extends Dao<CustomerDocument, Long>{
	
void saveFile(CustomerDocument uploadFile);

}
