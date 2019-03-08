package service;

import entity.Actor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoty.ActorRepo;

import java.util.List;
@Service
public class ActorService {
    @Autowired
    private ActorRepo actorRepo;

    public JSONArray listAll() {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = null;

        List<Actor> list = actorRepo.findAll();
        for (int i = 0; i<list.size(); i++){
            jsonObject = new JSONObject();
            jsonObject.put("idactor",list.get(i).getIdactor());
            jsonObject.put("nameactor",list.get(i).getNameactor());

            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }
}
