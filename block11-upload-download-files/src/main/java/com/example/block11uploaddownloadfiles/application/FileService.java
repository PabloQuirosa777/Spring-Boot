package com.example.block11uploaddownloadfiles.application;


import com.example.block11uploaddownloadfiles.domain.FileNew;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    FileNew addFile (FileNew fileNew) throws Exception;

    FileNew getFileById(Integer id) throws Exception;

    FileNew getFileByName(String name) throws Exception;
}
