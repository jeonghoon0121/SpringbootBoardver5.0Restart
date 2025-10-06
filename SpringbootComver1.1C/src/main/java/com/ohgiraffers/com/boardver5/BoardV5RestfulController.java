import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/restful/boardv5")
@CrossOrigin(origins = "http://localhost:8001")
public class BoardV5RestfulController {

    private final RestTemplate restTemplate;

    public BoardV5RestfulController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/user")
    public ResponseEntity<Map<String, String>> getUser(@RequestParam String name) {
        // 8003 서버에 조회 요청
        String url = "http://localhost:8003/restful/check?name=" + name;
        ResponseEntity<Map> responseFrom8003 = restTemplate.getForEntity(url, Map.class);

        String message;
        if ("true".equals(responseFrom8003.getBody().get("exists"))) {
            message = name + "님은 이미 DB에 있습니다.";
        } else {
            // 저장 요청
            String saveUrl = "http://localhost:8003/restful/save";
            Map<String, String> payload = new HashMap<>();
            payload.put("name", name);
            restTemplate.postForEntity(saveUrl, payload, Void.class);
            message = name + "님을 DB에 저장했습니다.";
        }

        Map<String, String> result = new HashMap<>();
        result.put("message", message);
        return ResponseEntity.ok(result);
    }
}

