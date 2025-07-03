package openrouter.ai.bot.chatbot.controller;

import openrouter.ai.bot.chatbot.service.ChatService;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai/openrouter/")
public class ChatController {

    @Autowired
    ChatService service;

    @GetMapping("/chat")
    public String chatWithBot(@RequestParam("prompt") String prompt){
        return service.getChatResponse(prompt);
    }
}
