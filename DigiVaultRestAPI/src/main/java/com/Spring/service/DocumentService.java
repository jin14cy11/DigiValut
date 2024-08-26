package com.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entity.documents;
import com.Spring.repository.DocumentRepository;



@Service("documentService")
public class DocumentService {

	@Autowired
    private DocumentRepository documentRepository;

    public documents saveUser(documents document){
        return documentRepository.save(document);
    }
    

	public List<documents> getAllDocuments() {
		return documentRepository.findAll();
	}
	
	public List<documents> getDocumentsByEmail(String email) {
	    return documentRepository.findByEmail(email);
	}

}


