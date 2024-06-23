package com.bqt.ecommerce.services;

import com.bqt.ecommerce.payloads.response.PriceResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface IFileService {
    String uploadImage(String path, MultipartFile file) throws IOException;

    InputStream getResource(String path, String fileName) throws FileNotFoundException;

    boolean deleteImage(String path,String fileName);

}
