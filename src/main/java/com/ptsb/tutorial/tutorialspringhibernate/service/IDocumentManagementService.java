package com.ptsb.tutorial.tutorialspringhibernate.service;

import java.io.InputStream;

import org.primefaces.model.UploadedFile;

import com.ptsb.tutorialspringhibernate.vo.DocumentHolder;

public interface IDocumentManagementService {

	String uploadFile(UploadedFile uploadedFile, String folderPath);

	String uploadFile(InputStream inputStream, String fileName,
			String mimeType, String folderPath, String code, boolean encrypt,
			String penyerahanId);

	DocumentHolder getFile(String path);

}
