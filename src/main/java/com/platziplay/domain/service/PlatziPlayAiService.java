package com.platziplay.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a {{platform}}
            """)
    String generatePlatziPlayAi(@V(("platform")) String platform);


}
