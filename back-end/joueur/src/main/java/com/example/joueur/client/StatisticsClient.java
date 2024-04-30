package com.example.joueur.client;
/*
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.core.ParameterizedTypeReference;
import java.util.List;
import java.util.stream.Collectors;
*/
public class StatisticsClient {
    /*
    private final String baseUrl; // URL de base du service Statistique

    public StatisticsClient(WebClient.Builder webClientBuilder,
                            @Value("${statistique.service.url:http://localhost:8080/api/statistique}") String baseUrl) {
        this.webClient = webClientBuilder.baseUrl(baseUrl).build();
        this.baseUrl = baseUrl;
    }

    @PostConstruct
    public void validateConfig() {
        if (this.baseUrl == null || this.baseUrl.isEmpty()) {
            throw new IllegalStateException("Base URL must not be null or empty");
        }
    }

    public Mono<List<Double>> getProbabilities(List<Integer> diceValues) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/probabilities")
                        .queryParam("diceValues", diceValues.stream().map(String::valueOf).collect(Collectors.joining(",")))
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Double>>() {});
    }

     */
}
