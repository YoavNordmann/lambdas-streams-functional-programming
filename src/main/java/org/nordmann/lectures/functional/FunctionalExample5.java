package org.nordmann.lectures.functional;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FunctionalExample5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture.supplyAsync(retrieveData)
		.thenApply(parse)
		.thenApplyAsync(retrieveStates)
		.thenApplyAsync(filterByCountry("Israel"))
		.thenApply(getFlightNumber)
		.get()
		.parallelStream()
		.filter(Predicate.not(String::isBlank))
		.forEach(System.out::println);

		TimeUnit.SECONDS.sleep(30);		
	}

	private static Supplier<String> retrieveData = () -> {
		try {
			return HttpClient.newHttpClient()
					.send(HttpRequest.newBuilder().uri(URI.create("https://opensky-network.org/api/states/all")).GET()
							.build(), HttpResponse.BodyHandlers.ofString())
					.body();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return "{}";
	};


	private static Function<String, JsonObject> parse = (raw) -> 
		new JsonParser().parse(raw).getAsJsonObject();

	private static Function<JsonObject, JsonArray> retrieveStates = (jsonObj) -> 
		Optional.ofNullable(jsonObj.get("states")).orElseGet(() -> new JsonArray()).getAsJsonArray();

	private static Function<List<JsonArray>, List<String>> getFlightNumber = (array) -> 
		array.stream().map((jsonArray) -> jsonArray.get(1).getAsString()).collect(Collectors.toList());

		
	private static Function<JsonArray, List<JsonArray>> filterByCountry(String country){

		return (jsonArray) -> {
			List<JsonArray> list = new LinkedList<>();
			jsonArray.forEach(j -> {
				if(j.getAsJsonArray().get(2).getAsString().equals(country)) {
					list.add(j.getAsJsonArray());
				}
			});
			return list;
		};
	}

}
