package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.context.ApplicationContext;

import com.ptsb.tutorial.tutorialspringhibernate.infrastructure.ApplicationContextProvider;
import com.ptsb.tutorial.tutorialspringhibernate.service.IDocumentManagementService;

@ManagedBean
@ViewScoped
public class AlfrescoTestForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void initForm(){
		
	}
	
	public void handleFileUpload(FileUploadEvent event) throws IOException{
		ApplicationContext applicationContext = ApplicationContextProvider
				.getApplicationContext();
		IDocumentManagementService bean = applicationContext.getBean(IDocumentManagementService.class);
		UploadedFile file=event.getFile();
		bean.uploadFile(file, "");
		
	}

}
