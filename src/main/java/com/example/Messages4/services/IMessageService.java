package com.example.Messages4.services;

import com.example.Messages4.model.Message;
import org.springframework.stereotype.Service;


@Service
public interface IMessageService {
    Iterable<Message> getAllMessages();
}
