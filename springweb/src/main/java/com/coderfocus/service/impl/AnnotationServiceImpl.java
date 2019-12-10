package com.coderfocus.service.impl;

import com.coderfocus.service.AnnotationService;
import org.springframework.stereotype.Service;

@Service(value = "annotationService")
public class AnnotationServiceImpl implements AnnotationService {

    public String getMessage(){
        return "annotation";
    }
}
