package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.gst.dao.FileGSTR3BDataDao;
import com.ojas.gst.entity.FileGSTR3BData;
import com.ojas.gst.entity.GSTR3BEntity;
import com.ojas.gst.entity.RefferenceId;
import com.ojas.gst.service.FileGSTR3BDataService;

public class FileGSTR3BDataServiceImpl implements FileGSTR3BDataService {

	@Autowired
	private FileGSTR3BDataDao fileGSTR3BDataDao;

	@Override
	public FileGSTR3BData saveFileGSTR3BData(FileGSTR3BData data) {
		return fileGSTR3BDataDao.save(data);

	}

	@Override
	public List<FileGSTR3BData> getFileGSTR3BData() {
		return fileGSTR3BDataDao.findAll();
	}

	@Override
	public FileGSTR3BData findGSTR3BById(Long id) {
		return null;
	}

	@Override
	public void deleteFileGSTR3BDataById(Long id) {

	}

	@Override
	public RefferenceId getGSTRByGSTIN(GSTR3BEntity gstr3bEntity) {
		RefferenceId refferenceId = fileGSTR3BDataDao.findByGstinAndRet_period(gstr3bEntity);
		if(null != refferenceId) {
			return refferenceId;
		}
		return null;
	}

	@Transactional
	@Override
	public FileGSTR3BData getGSTR(GSTR3BEntity gstr3bEntity) {
		return fileGSTR3BDataDao.findByFileGSTR3B(gstr3bEntity);
	}

}
