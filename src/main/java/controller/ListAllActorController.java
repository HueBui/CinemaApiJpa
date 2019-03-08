package controller;

import handle.Handler;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import service.ActorService;
import main.main;

public class ListAllActorController extends Handler {
    @Autowired
    private ActorService actorService;
    @Override
    public String doProcessPost(JSONObject params) {
        JSONObject js = new JSONObject();
        try {
            actorService = main.context.getBean("actorService", ActorService.class);
            js.put("Actor",actorService.listAll());
            js.put("rc", "1");
            js.put("rd", "Success");
        }catch (Exception ex){
            js.put("rc", "-1");
            js.put("rd", "Err");
        }
        return js.toString();
    }
}
