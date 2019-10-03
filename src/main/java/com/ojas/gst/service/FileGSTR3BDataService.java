package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.FileGSTR3BData;
import com.ojas.gst.entity.GSTR3BEntity;
import com.ojas.gst.entity.RefferenceId;

public interface FileGSTR3BDataService {

	FileGSTR3BData saveFileGSTR3BData(FileGSTR3BData data);

	List<FileGSTR3BData> getFileGSTR3BData();

	public FileGSTR3BData findGSTR3BById(Long id);

	public void deleteFileGSTR3BDataById(Long id);

	RefferenceId getGSTRByGSTIN(GSTR3BEntity gstr3bEntity);

	FileGSTR3BData getGSTR(GSTR3BEntity gstr3bEntity);

}
