package pro.sky.ShelterTelegramBot.service;


import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
import pro.sky.ShelterTelegramBot.model.Attachment;
import pro.sky.ShelterTelegramBot.model.Client;

import java.io.IOException;
import java.net.MalformedURLException;

public interface AttachmentService {

    Attachment addAttachment(MultipartFile file) throws IOException;
    Attachment findAttachById(Long attachId);
    Resource loadFileAsResource( String fileName) throws MalformedURLException;
}