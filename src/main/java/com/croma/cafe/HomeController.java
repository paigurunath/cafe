package com.croma.cafe;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(value = "/croma")
@RestController            // <1>
public class HomeController {

  @GetMapping("/test")     // <2>
  public String home() {
    return "home";     // <3>
  }

  @GetMapping("/menu")     // <2>
  public JsonNode menu() throws JsonMappingException, JsonProcessingException {
	  
	  ObjectMapper objectMapper = new ObjectMapper();
	  String json = "[{\"average_rating\":3.5,\"image_url\":\"https://cdn.pixabay.com/photo/2014/09/18/21/17/sandwich-451403_640.jpg\",\"item_name\":\"Sandwich\",\"item_price\":80},{\"average_rating\":4,\"image_url\":\"https://cdn.pixabay.com/photo/2015/05/11/11/46/fried-rice-762362_640.jpg\",\"item_name\":\"FriedRice\",\"item_price\":110},{\"average_rating\":4.2,\"image_url\":\"https://cdn.pixabay.com/photo/2015/04/20/13/25/burger-731298_640.jpg\",\"item_name\":\"Burger\",\"item_price\":125.5},{\"average_rating\":3.8,\"image_url\":\"https://cdn.pixabay.com/photo/2014/11/05/16/00/thai-food-518035_640.jpg\",\"item_name\":\"Noodles\",\"item_price\":132.5},{\"average_rating\":4.2,\"image_url\":\"https://cdn.pixabay.com/photo/2017/01/03/11/33/pizza-1949183_640.jpg\",\"item_name\":\"Pizza\",\"item_price\":180},{\"average_rating\":4.8,\"image_url\":\"https://cdn.pixabay.com/photo/2015/08/11/10/34/camel-meat-883772_640.jpg\",\"item_name\":\"Biryani\",\"item_price\":210}]";

	  JsonNode jsonNode = objectMapper.readTree(json);
	  return jsonNode;     // <3>
  }

  
  @PostMapping("/order")     // <2>
  public JsonNode order() throws JsonMappingException, JsonProcessingException {
	  
	  ObjectMapper objectMapper = new ObjectMapper();
	  String json = "{\"order_id\":56,\"order\":[{\"counter_num\":1,\"counter_name\":\"dosa\",\"counter_item\":\"Sada Dosa\"},{\"counter_num\":2,\"counter_name\":\"juice\",\"counter_item\":\"WaterMelon Juice\"},{\"counter_num\":3,\"counter_name\":\"instant\",\"counter_item\":\"idli\"}],\"time\":30}";

	  JsonNode jsonNode = objectMapper.readTree(json);
	  return jsonNode;     // <3>
  }
  
}
