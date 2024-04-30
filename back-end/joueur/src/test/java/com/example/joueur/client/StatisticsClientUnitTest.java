package com.example.joueur.client;
/*
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
*/
public class StatisticsClientUnitTest {
    /*

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private WebClient.Builder webClientBuilder;

    @Mock
    private WebClient webClient; // Ajout de la déclaration de webClient

    @InjectMocks
    private StatisticsClient statisticsClient;

    @BeforeEach
    public void setup() {
        String testBaseUrl = "http://test-url";  // Définir une URL de test non-nulle
        WebClient mockWebClient = mock(WebClient.class);
        WebClient.Builder mockWebClientBuilder = mock(WebClient.Builder.class);

        // S'assurer que baseUrl(String) retourne le même mock de WebClient.Builder
        when(mockWebClientBuilder.baseUrl(anyString())).thenReturn(mockWebClientBuilder);

        // S'assurer que build() retourne un mock de WebClient
        when(mockWebClientBuilder.build()).thenReturn(mockWebClient);

        // Initialisation manuelle de StatisticsClient avec les mocks
        statisticsClient = new StatisticsClient(mockWebClientBuilder, testBaseUrl); }

        @Test
    public void whenGetProbabilities_thenReturnProbabilitiesList() {
        // Given
        List<Integer> diceValues = Arrays.asList(1,2,3,4,5);
        String url = "http://statistique-service/api/statistique/probabilities?diceValues=" + diceValues;
        List<Double> expectedProbabilities = Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5);

        when(restTemplate.getForObject(url, List.class)).thenReturn(expectedProbabilities);

        // When
        List<Double> probabilities = statisticsClient.getProbabilities(diceValues).block();

        // Then
        assertEquals(expectedProbabilities, probabilities);
    }

     */
}
